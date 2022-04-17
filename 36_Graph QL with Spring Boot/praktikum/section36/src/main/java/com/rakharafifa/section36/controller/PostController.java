package com.rakharafifa.section36.controller;

import java.util.ArrayList;
import java.util.List;

import com.rakharafifa.section36.model.Post;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class PostController {
    
    @QueryMapping
    List<Post> posts(){
        List<Post> posts = new ArrayList<>();
        posts.add(new Post("1", "One Piece", "Kaizoku oni ore wa naru", "Komik", "Eiichiro Oda"));
        return posts;
    }
}
