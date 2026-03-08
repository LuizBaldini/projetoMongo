package com.luizbaldini.workshopmongo.service;

import com.luizbaldini.workshopmongo.domain.User;
import com.luizbaldini.workshopmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }


}
