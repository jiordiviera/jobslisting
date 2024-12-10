package com.example.jobslisting.controller;

import com.example.jobslisting.model.Post;
import com.example.jobslisting.repository.PostRepository;
import org.springframework.web.bind.annotation.*;
//import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

@RestController
public class PostController {

    final
    PostRepository postRepository;

    public PostController(PostRepository postRepository) {
        this.postRepository = postRepository;
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

    @GetMapping("/posts/{text}")
    public List<Post> search(@PathVariable String text) {
return postRepository.findAll();
    }

    @PostMapping("/post")
    public Post addPost(@RequestBody Post post) {
        return postRepository.save(post);
    }
}
