package com.relations.crud.service;

import com.relations.crud.model.Post;
import com.relations.crud.repository.IPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService implements IPostService{

    @Autowired
    private IPostRepository postRepository;

    @Override
    public void crearPost(Post post) {
        postRepository.save(post);
    }
}
