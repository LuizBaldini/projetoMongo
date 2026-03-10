package com.luizbaldini.workshopmongo.resources;

import com.luizbaldini.workshopmongo.domain.Post;
import com.luizbaldini.workshopmongo.domain.User;
import com.luizbaldini.workshopmongo.dto.UserDTO;
import com.luizbaldini.workshopmongo.service.UserService;
import com.luizbaldini.workshopmongo.service.exception.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/posts")
public class PostResources {

    @Autowired
    PostService service;


    @GetMapping("/{id}")
    public ResponseEntity<Post> findById(@PathVariable String id) {
        Post obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }




}