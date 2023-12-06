package com.muhammet;

import com.muhammet.entity.User;
import com.muhammet.repository.UserRepositoryImpl;

import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {
        UserRepositoryImpl repository = new UserRepositoryImpl();
        List<User> userList =  repository.fromRandomUserMe();
        /**
         * s1- Kullanıcı listesin içinde adında i geçenleri listele
         * s2- Kullanıcıları cinsiyetlerine göre gruplayıp Map<String, List<User>> şeklinde yazdırın.
         * s3- Yaşları 25-50 arasında olanların listesini yazdır. (gender, firtName, age) bu filternin yaş ortalaması nedir?
         * s4- Kullanıcıları userName lerine göre a...z ye sıralı bir şekilde yazdır.
         * s5- Kullanıcılardan türkiye de olanların listesini yazdır. Soyismine göre akraba olanları TreeMap olarak yazdır.
         */

        userList
                .stream()
                .filter(x-> x.getLocation().getCountry().equalsIgnoreCase("turkey"))
                .forEach(x-> System.out.println(x.getName().getFirst()+" "+ x.getName().getLast()));
        TreeMap<String,List<User>> akrabaListesi = userList
                .stream()
                .filter(x-> x.getLocation().getCountry().equalsIgnoreCase("turkey"))
                .collect(Collectors.groupingBy(
                        x-> x.getName().getLast(),
                        TreeMap::new,
                        Collectors.toList()
                ));
        akrabaListesi.forEach((k,v)->{
            System.out.println(k + " aile üye sayısı: "+v.size());
            System.out.println(v);
            System.out.println("------------------------------------");
        });

//        List<String> userNameList =  userList.stream().map(x->  x.getLogin().getUsername()).toList(); // User.class -> String.class (userName)
//        userNameList.stream().sorted().forEach(System.out::println); // a...z sıralar DİKATT!!!! sorted() asıl listeyi değiştirmez
//        System.out.println("---------------------");
//        userNameList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println); // z...a sıralar
//        System.out.println("--------     DİREKT ---------------");
//        userList.stream().sorted(Comparator.comparing(x->x.getLogin().getUsername())).forEach(
//                x-> System.out.println(x.getLogin().getUsername())
//        );


//        userList.stream().filter(y-> y.getDob().getAge()>25 && y.getDob().getAge()<50)
//                .forEach(x->{
//                    System.out.println(x.getName().getFirst()+" "+x.getDob().getAge()+ " "+ x.getGender());
//                });
//        OptionalDouble ortalama = userList.stream().filter(y-> y.getDob().getAge()>25 && y.getDob().getAge()<50)
//                .mapToDouble(x-> x.getDob().getAge()).average();
//        System.out.println(ortalama);
//        Double ortalamaD = userList.stream().filter(y-> y.getDob().getAge()>25 && y.getDob().getAge()<50)
//                .collect(Collectors.averagingDouble(u-> u.getDob().getAge()));
//        System.out.println(ortalamaD);

//        HashMap<String,List<User>> genderList = userList.stream()
//                                                        .collect(Collectors.groupingBy(
//                                                                User::getGender, //x-> x.getGender(),
//                                                                HashMap::new,
//                                                                Collectors.toList()
//                                                        ));
//
//        genderList.forEach((k,v)->{
//            System.out.println(k);
//            System.out.println(v);
//            System.out.println("-------------------------------------");
//
//        });


//        userList
//                .stream()
//                .filter(u -> u.getName().getFirst().contains("i"))
//                .forEach(u ->{
//                    System.out.println("ad....: "+ u.getName());
//                    System.out.println("email..: "+ u.getEmail());
//                });


    }
}
