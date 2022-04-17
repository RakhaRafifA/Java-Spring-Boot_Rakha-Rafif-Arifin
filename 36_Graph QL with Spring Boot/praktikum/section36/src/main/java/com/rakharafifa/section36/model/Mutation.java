package com.rakharafifa.section36.model;

import java.util.UUID;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Mutation implements GraphQLMutationResolver {
    private PostDao postDao;

    public Post writePost(String title, String text, String category, String author) {
        Post post = new Post();
        post.setId(UUID.randomUUID().toString());
        post.setTitle(title);
        post.setText(text);
        post.setCategory(category);
        post.setAuthor(author);
        postDao.savePost(post);

        return post;
    }
}
