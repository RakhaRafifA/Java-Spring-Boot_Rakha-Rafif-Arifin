package com.rakharafifa.section36.model;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Query implements GraphQLQueryResolver {
    private PostDao postDao;

    public List<Post> getRecentPosts(int count, int offset){
        return postDao.getRecentPosts(count, offset);
    }
    
}
