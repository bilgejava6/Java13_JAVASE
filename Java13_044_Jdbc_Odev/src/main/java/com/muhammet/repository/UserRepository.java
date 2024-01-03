package com.muhammet.repository;

import com.muhammet.entity.User;

import java.sql.ResultSet;
import java.util.List;
import java.util.Optional;

public class UserRepository implements Repository<User> {
    private CRUD crud;
    private String sql;
    private ResultSet resultSet;
    public UserRepository(){
        crud = new CRUD();
    }

    /**
     * "Muhammet"+ değer +"HOCA"
     *
     * "Muhammet"+ deger + "Ali"
     * "Ali"
     *
     */
    @Override
    public boolean save(User entity) {
        sql = "insert into tbluser(adsoyad,username,password,avatar) " +
                "values('"+entity.getAdsoyad()+"','"+entity.getUsername()+"','"+entity.getPassword()+"','"+entity.getAvatar()+"')";
        crud.executeUpdate(sql);
        return true;
    }

    @Override
    public boolean update(User entity) {
        crud.executeUpdate(sql);
        return true;
    }

    @Override
    public boolean delete(Long id) {
        crud.executeUpdate(sql);
        return false;
    }

    @Override
    public List<User> findAll() {

        resultSet = crud.getAllTableRows(sql);
        return null;
    }

    @Override
    public Optional<User> findById(Long id) {
        sql = "select * from tbluser where id="+id;
        resultSet = crud.getAllTableRows(sql);
        Optional<User> userOptional = Optional.empty();
        try{
            while (resultSet.next()){ // sorgu neticesinde gelen tabloyu, satır satır dolaşmak için kullanılır.
                Long db_id = resultSet.getLong("id"); // her bir hatırda hangi kolonu okumak istediğimiz belirtiyoruz.
                String db_adsoyad = resultSet.getString("adsoyad");
                String db_username = resultSet.getString("username");
                String db_password = resultSet.getString("password");
                String db_avatar = resultSet.getString("avatar");
                User user = new User(db_id,db_adsoyad,db_username,db_password,db_avatar); // yeni bir user nesnesi oluşturuyoruz
                userOptional = Optional.of(user); // user nesnesini optional ile sarmalayarak eşitliyoruz.
            }
        }catch (Exception exception){

        }
        return userOptional;
    }

    /**
     * Bu method verilen kullanıcı adı ve şifreyi DB ye sorgu olarak gönderir ve herhangi bir kayıt
     * olup olmadığını sorgular. Eğer bir kayıt bulur ise bunu döner bulamaz ise boş olarak döner
     * @param username
     * @param password
     * @return
     */
    public Optional<User> doLogin(String username,String password){
        sql = "select * from tbluser where username='"+username+"' and password='"+password+"'";
        resultSet = crud.getAllTableRows(sql);
        Optional<User> userOptional = Optional.empty();
        try{
            while (resultSet.next()){ // sorgu neticesinde gelen tabloyu, satır satır dolaşmak için kullanılır.
                Long db_id = resultSet.getLong("id"); // her bir hatırda hangi kolonu okumak istediğimiz belirtiyoruz.
                String db_adsoyad = resultSet.getString("adsoyad");
                String db_username = resultSet.getString("username");
                String db_password = resultSet.getString("password");
                String db_avatar = resultSet.getString("avatar");
                User user = new User(db_id,db_adsoyad,db_username,db_password,db_avatar); // yeni bir user nesnesi oluşturuyoruz
                userOptional = Optional.of(user); // user nesnesini optional ile sarmalayarak eşitliyoruz.
            }
        }catch (Exception exception){

        }
        return userOptional;
    }

    public boolean isUserName(String userName){
        sql = "select * from tbluser where username='"+userName+"'";
        resultSet = crud.getAllTableRows(sql);
        boolean isUser = false;
        try{
//            while (resultSet.next()){
//               isUser = true;
//            }
            isUser = resultSet.next();
        }catch (Exception exception){

        }
        return isUser;
    }

}
