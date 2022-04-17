package com.rakharafifa.section36.config;

import java.util.ArrayList;
import java.util.List;

import com.rakharafifa.section36.model.Author;
import com.rakharafifa.section36.model.AuthorDao;
import com.rakharafifa.section36.model.AuthorResolver;
import com.rakharafifa.section36.model.Mutation;
import com.rakharafifa.section36.model.Post;
import com.rakharafifa.section36.model.PostDao;
import com.rakharafifa.section36.model.PostResolver;
import com.rakharafifa.section36.model.Query;

import org.springframework.context.annotation.Bean;

public class GraphqlConfiguration {
    @Bean
    public PostDao postDao(){
        List<Post> posts = new ArrayList<>();
        for (int postId = 0; postId < 10; postId++){
            for (int authorId = 0; authorId < 10; ++authorId) {
                Post post = new Post();
                post.setId("Post" + authorId + postId);
                post.setTitle("Post " + authorId + ":" + postId);
                post.setText("Post " + postId + " + by author " + authorId);
                post.setAuthor("Author" + authorId);
                posts.add(post);
            }
        }
        return new PostDao(posts);
    }

    @Bean
    public AuthorDao authorDao() {
        List<Author> authors = new ArrayList<>();
        for (int authorId = 0; authorId < 10; ++authorId) {
            Author author = new Author();
            author.setId("Author" + authorId);
            author.setName("Author " + authorId);
            author.setThumbnail("http://example.com/authors/" + authorId);
            authors.add(author);
        }
        return new AuthorDao(authors);
    }

    @Bean
    public PostResolver postResolver(AuthorDao authorDao) {
        return new PostResolver(authorDao);
    }

    @Bean
    public AuthorResolver authorResolver(PostDao postDao) {
        return new AuthorResolver(postDao);
    }

    @Bean
    public Query query(PostDao postDao) {
        return new Query(postDao);
    }

    @Bean
    public Mutation mutation(PostDao postDao) {
        return new Mutation(postDao);
    }
}
