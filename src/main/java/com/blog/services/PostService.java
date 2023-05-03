package com.blog.services;

import com.blog.entites.Post;
import com.blog.playloads.PostDto;

import java.util.List;

public interface PostService {
    //create

    PostDto createPost(PostDto postDto, Integer userId,Integer categoryId);

    //update

    PostDto updatePost(PostDto postDto, Integer postId);

    // delete

    void deletePost(Integer postId);

    //get all posts

//    PostResponse getAllPost(Integer pageNumber,Integer pageSize,String sortBy,String sortDir);
        List<PostDto> getAllPost();
    //get single post

    PostDto getPostById(Integer postId);

    //get all posts by category

    List<PostDto> getPostsByCategory(Integer categoryId);

    //get all posts by user
    List<PostDto> getPostsByUser(Integer userId);

    //search posts
    List<Post> searchPosts(String keyword);
}
