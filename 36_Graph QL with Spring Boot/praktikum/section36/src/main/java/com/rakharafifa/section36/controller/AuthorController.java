package com.rakharafifa.section36.controller;

import java.util.ArrayList;
import java.util.List;

import com.rakharafifa.section36.model.Author;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class AuthorController {
    
    @QueryMapping
    List<Author> authors(){
        List<Author> authors = new ArrayList<>();
        authors.add(new Author("1", "Eiichiro Oda", "photo"));
        return authors;
    }
}
