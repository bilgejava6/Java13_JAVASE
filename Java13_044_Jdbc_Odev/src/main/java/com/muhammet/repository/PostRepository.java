package com.muhammet.repository;

import com.muhammet.entity.Post;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PostRepository implements Repository<Post> {
    private CRUD crud;
    private String sql;
    private ResultSet resultSet;

    public PostRepository(){
        crud = new CRUD();
    }

    @Override
    public boolean save(Post entity) {
        sql = "INSERT INTO tblpost(userid,title,postcomment,shareddate,imageurl,commentcount,likecount) values("+
                entity.getUserid()+",'"+entity.getTitle()+"','"+entity.getPostComment()+"',"+entity.getSharedDate()+",'"+entity.getImageUrl()+"',0,0)"
                ;
        crud.executeUpdate(sql);
        return true;
    }

    @Override
    public boolean update(Post entity) {
        return false;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public List<Post> findAll() {
       sql = "select * from tblpost";
       resultSet = crud.getAllTableRows(sql);
       List<Post> postList = new ArrayList<>();
       try{
           while (resultSet.next()){
               Post post = new Post();
               post.setId(resultSet.getLong("id"));
               post.setUserid(resultSet.getLong("userid"));
               post.setTitle(resultSet.getString("title"));
               post.setPostComment(resultSet.getString("postcomment"));
               post.setSharedDate(resultSet.getLong("shareddate"));
               post.setImageUrl(resultSet.getString("imageurl"));
               post.setCommentCount(resultSet.getInt("commentcount"));
               post.setLikeCount(resultSet.getInt("likecount"));
               postList.add(post);
           }
       }catch (Exception exception){

       }
     return postList;
    }

    @Override
    public Optional<Post> findById(Long id) {
        return Optional.empty();
    }
}
