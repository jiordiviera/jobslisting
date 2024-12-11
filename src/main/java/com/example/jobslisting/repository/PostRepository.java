package com.example.jobslisting.repository;

import com.example.jobslisting.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PostRepository extends MongoRepository<Post, String>
{

}
