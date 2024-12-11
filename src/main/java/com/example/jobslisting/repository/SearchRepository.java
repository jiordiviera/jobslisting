package com.example.jobslisting.repository;

import com.example.jobslisting.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);
}
