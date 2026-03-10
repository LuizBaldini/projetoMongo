package com.luizbaldini.workshopmongo.service.exception;

import com.luizbaldini.workshopmongo.domain.Post;
import com.luizbaldini.workshopmongo.domain.User;
import com.luizbaldini.workshopmongo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    PostRepository repo;


    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }


}
