package com.muhammet;

import com.muhammet.etity.Log;
import com.muhammet.etity.User;

public class Runner_FileEdit {
    private final static String URL = "/Users/muhammetalikaya/BOOST_JAVA_13/JAVASE/Java13_038_Serilestirme_DosyaIslemleri/src/main/resources/user.txt";
    public static void main(String[] args) {
        FileEdit<User> file = new FileEdit<>();
        User user = new User("Ahmet","Akara","0556");
        file.write(user,URL);

        new FileEdit<User>().write(new User("Ali","İzmir",""),URL);

        file.read(URL).ifPresent(System.out::println);

    }
}
