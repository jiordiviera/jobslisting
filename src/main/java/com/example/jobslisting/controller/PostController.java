package com.example.jobslisting.controller;

import com.example.jobslisting.model.Post;
import com.example.jobslisting.repository.PostRepository;
import com.example.jobslisting.repository.SearchRepositoryImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    final
    PostRepository postRepository;

    final
    SearchRepositoryImpl searchRepository;

    public PostController(PostRepository postRepository, SearchRepositoryImpl searchRepository) {
        this.postRepository = postRepository;
        this.searchRepository = searchRepository;
    }

    //    @ApiIgnore
    @RequestMapping(value = "/")
    public String Home() {
        return "hello world";
    }

    @GetMapping("/all-posts")
    public List<Post> getAllPosts() {

        return postRepository.findAll();
    }

    @GetMapping("/post/{text}")
    public List<Post> search(@PathVariable String text) {
        return searchRepository.findByText(text);
    }

    @PostMapping("/post")
    public Post addPost(@RequestBody Post post) {
        return postRepository.save(post);
    }
}
