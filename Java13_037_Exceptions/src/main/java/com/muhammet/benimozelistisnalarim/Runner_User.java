package com.muhammet.benimozelistisnalarim;

public class Runner_User {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        User user = userRepository.getUserByName("Muhammet2");
        System.out.println("User ıd........: "+ user.getId());
        System.out.println("USer name......: "+ user.getName());
    }
}
