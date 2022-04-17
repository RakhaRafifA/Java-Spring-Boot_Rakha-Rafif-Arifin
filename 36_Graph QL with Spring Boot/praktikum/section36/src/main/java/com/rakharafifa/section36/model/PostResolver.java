package com.rakharafifa.section36.model;

import com.coxautodev.graphql.tools.GraphQLResolver;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class PostResolver implements GraphQLResolver<Post> {
    private AuthorDao authorDao;

    public Author getAuthor(Post post) {
        return authorDao.getAuthor(post.getAuthor()).orElseThrow(RuntimeException::new);
    }
}
