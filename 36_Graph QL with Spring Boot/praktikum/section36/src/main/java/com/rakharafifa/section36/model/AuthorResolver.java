package com.rakharafifa.section36.model;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLResolver;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class AuthorResolver implements GraphQLResolver<Author> {
    private PostDao postDao;

    public List<Post> getPosts(Author author) {
        return postDao.getAuthorPosts(author.getId());
    }
}
