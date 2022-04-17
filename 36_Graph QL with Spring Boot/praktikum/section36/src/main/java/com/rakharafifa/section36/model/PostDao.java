package com.rakharafifa.section36.model;

import java.util.List;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class PostDao {
    private List<Post> posts;

    public List<Post> getRecentPosts(int count, int offset){
        return posts.stream().skip(offset).limit(count).collect(Collectors.toList());
    }

    public List<Post> getAuthorPosts(String author) {
        return posts.stream().filter(post -> author.equals(post.getAuthor())).collect(Collectors.toList());
    }

    public void savePost(Post post) {
        posts.add(0, post);
    }
}
