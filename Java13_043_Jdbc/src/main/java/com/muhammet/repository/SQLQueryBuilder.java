package com.muhammet.repository;

import java.lang.reflect.Field;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Bu sınıf temel SQL komutlarını sınıfın bileşenlerini
 * işleyerek oluşturmak için kullanılır.
 * Yani Entity -> SQL  şeklinde çalışcaktır.
 */
public class SQLQueryBuilder {
    /**
     * <p>Entity nesnesini alıp, içerisinde bulunan alanları(fields) kullanarak
     * <p>insert into SQL komutunu oluşturan methodtur
     * @param entity -> herhangi bir varlık nesnesini sağlayınız
     * @param tableName -> insert işlemi yapılacak tablo adını giriniz.
     * @return -> SQL komut cümlesi geri döner
     *
     * Java Reflection
     */
    public static String generateInsert(Object entity, String tableName){
        /**
         * Burada object içinde gelen türü belli olmayan nesnenin sınıf bilgilerini çekiyoruz.
         */
        Class<?> clazz = entity.getClass();
        /**
         * Burada okunan sınıfın içinde tanımlı olan alanları bir listeye aktarıyoruz.
         * değişkenler, methoslar v.s.
         */
        Field[] fields = clazz.getDeclaredFields();
        /**
         * Burada oluşturulacak sorgu için bir StringBuilder sınıfından nesne yaratıyoruz. Bu sınıf
         * String işlemlerinde kullamanız gerekli olan büyük String ifadelerini işlerken performans
         * sorunlarını ortadan kaldıran bir sınıftır.
         */
        StringBuilder query = new StringBuilder();
        /**
         * Oluşturmak istediğim komut şuna benzeyecek
         * INSERT INTO [TABLO_ADI]( [ALAN_1],[ALAN_2]....,[ALAN_N] ) VALUES ( '[DEGER_1]', '[DEGER_2]'..., '[DEGER_N]');
         */
        query.append("INSERT INTO ").append(tableName).append("( ");

        /**
         * Bu kısımda entity nesnesinin içinden çektiğimiz sınıfın tanımlanmış değişken adlarını
         * tablonunu alanları olarak ekliyoruz.
         */
        for(int i=0;i<fields.length;i++){
            /**
             * DİKKAT!!!!!
             * id, primary key alanı insert işlemine tabi tutlumaması gereken bir alan
             * bu nedenle bu alan es geçilmeli. bunu yapmak için kontrol ediyoruz.
             */
            if(!fields[i].getName().equalsIgnoreCase("id")){
                if(i>1)
                    query.append(", ");

                query.append(fields[i].getName());
            }

        }

        query.append(") VALUES(");
        /**
         * Bu kısımda nesneden aldığımız alanların içerisinde olan değerleri alarak sorgunun values kısmına
         * ekliyoruz böylece nesne içinde tanımlı tüm değerler sorguya eklenmiş oluyor.
         */
        for(int i=0; i< fields.length;i++){
            /**
             * Öncelikle bir entity analiz ettiğimiz için class içindeki tüm alanlar private olarak işaretl
             * bu nedenle erişimleri yoktur. bunu çözmek için öncelikle bu alanları erişimini açarız
             */
            fields[i].setAccessible(true);
            try{
                /**
                 * Erişimini açtığımız alnların içindeki değerleri okuyoruz.
                 */
                Object value = fields[i].get(entity);

                if(!fields[i].getName().equalsIgnoreCase("id")){

                    /**
                     * Alanlar arasına virgül eklememiz gerekli bu işlemi yparken dikkat etmemiz gereken kısım
                     * ilk alan eklendikten sonra virgül eklemektir.
                     */
                    if(i>1)
                        query.append(", ");
                    /**
                     * DİKKAT!!!!
                     * SQL tarafında values alanar eklenirken tipine göre ekleme yamamız gereklidir. Yani SQL cümlesinde
                     * girmiş olduğunuz String te olsa tek bir değer olarak algılanır (int). Bu nedenle girilen values
                     * bilgisini şöyle yazmak zorundasınız. String, Date, TimeStamp alanları '' tırnak içinde belirtilmeli
                     * diğer sayısal veriler olduğu gibi yazılmalıdır.
                     * İşte bunu ayarlamak için fields leri okurken alanın datatype ına bakarak buna karar vermeliyiz.
                     */
                    if(value instanceof  String
                            || value instanceof Date
                            || value instanceof LocalDate
                            || value instanceof Timestamp)
                        query.append("'").append(value).append("'");
                    else
                        query.append(value);
                }
            }catch (Exception exception){
                System.out.println("Hata....: "+exception);
            }

        }
        query.append(")");

        return query.toString();
    }

    public static String generateUpdate(Object entity, String tableName){
        Class<?> clazz = entity.getClass();
        Field[] fields = clazz.getDeclaredFields();
        StringBuilder query = new StringBuilder();
        /**
         * Oluşturmak istediğim komut şuna benzeyecek
         * update [TABLO_ADI] set [ALAN_ADI]='DEGER', ALAN_ADI=DEGER where id= DEGER;
         */
        query.append("UPDATE ").append(tableName).append(" SET ");
        Object id= "";
        for(int i=0;i<fields.length;i++){
            try{
                fields[i].setAccessible(true);
                Object value = fields[i].get(entity);
                if(fields[i].getName().equalsIgnoreCase("id")){
                    id = value;
                }
                if(i>0)
                    query.append(", ");
                query.append(fields[i].getName()).append("=");
                if(value instanceof  String
                        || value instanceof Date
                        || value instanceof LocalDate
                        || value instanceof Timestamp)
                    query.append("'").append(value).append("'");
                else
                    query.append(value);
            }catch (Exception exception){
                System.out.println("Update hatası...: "+exception);
            }
         }
        query.append(" where id=").append(id);
        return query.toString();
    }

    public static <T> List<T> generateList(Class<T> entityClass, String tableName, ResultSet resultSet){
      List<T> resultList = new ArrayList<>();
      try {
          while (resultSet.next()){
              /**
               * method içine geçilen nesnenin kurucu methodunu çağırarak yeni bir nese yaratıyoruz.
               */
                T entity = entityClass.getDeclaredConstructor().newInstance();
              /**
               * gelen nesnenin içindeki tüm değişkenleri tek tek dolaşarak oluşturduğumuz nesnenin
               * içine result set içindeki bilgileri yerleştiriyoruyz.
               */
              for(Field field: entityClass.getDeclaredFields()){
                  /**,
                   * private alanları public e çeviriyoruz
                   */
                    field.setAccessible(true);
                  /**
                   * nesne içindeki alan(değişkenin) adını alıyoruız.
                   */
                  String fieldName = field.getName();
                  /**
                   * resultset içinde gelen o an üzerinde bulunduğumuz satırdaki ilgili alanın
                   * değerini okuyoruz.
                   */
                  Object value = resultSet.getObject(fieldName);
                  /**
                   * okuduğumuz değeri yeni oluşturduğumuz entity nesnesinin ilgili alanına set ediyoruz.
                   */
                  field.set(entity,value);
                }
              resultList.add(entity);
          }
      }catch (Exception exception){

      }

      return resultList;
    }

}
