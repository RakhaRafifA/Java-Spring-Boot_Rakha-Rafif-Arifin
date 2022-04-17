package com.rakharafifa.section36.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Post {
    public String id;
    public String title;
    public String text;
    public String category;
    public String author;
}
