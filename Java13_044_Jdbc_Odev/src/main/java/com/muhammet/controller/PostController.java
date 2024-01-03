package com.muhammet.controller;

import com.muhammet.entity.Post;
import com.muhammet.repository.PostRepository;
import com.muhammet.repository.UserRepository;
import com.muhammet.utility.Constants;

import java.util.Scanner;
public class PostController {
    private PostRepository postRepository;
    private UserRepository userRepository;
    public PostController(){
        postRepository = new PostRepository();
        userRepository = new UserRepository();
    }
    public void creteNewPost(){
        System.out.println("""
                **********************************
                ****** POST PAYLAŞMA EKRANI ******
                **********************************
                
                """);
        System.out.print("Başlık......: ");
        String title = new Scanner(System.in).nextLine();
        System.out.print("Yorum.......: ");
        String comment = new Scanner(System.in).nextLine();
        System.out.print("Resim.......: ");
        String imageUrl = new Scanner(System.in).nextLine();
        Post post = new Post(Constants.loginUser.getId(), title, comment, imageUrl);
        postRepository.save(post);
        System.out.println("POST BAŞARIYLA PAYLAŞILDI");
    }

    public void getAllPosts(){
        System.out.println("""
                **********************************
                ****** TÜM POSTLARINIZ ***********
                **********************************
                
                """);
        postRepository.findAll().forEach(p->{
            System.out.println("**********************************");
            System.out.println("User: "+ userRepository.findById(p.getUserid()).get().getUsername());
            System.out.println("*     "+ p.getTitle()+"          ");
            System.out.println("*     "+ p.getPostComment()+"    ");
            System.out.println("**********************************");
            System.out.println();
        });
    }
}
