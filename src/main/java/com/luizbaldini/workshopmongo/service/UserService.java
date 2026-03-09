package com.luizbaldini.workshopmongo.service;

import com.luizbaldini.workshopmongo.domain.User;
import com.luizbaldini.workshopmongo.dto.UserDTO;
import com.luizbaldini.workshopmongo.repository.UserRepository;
import com.luizbaldini.workshopmongo.service.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.objenesis.ObjenesisException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }


    public User findById(String id){
        Optional<User> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado")) ;
    }

    public User insert(User obj){
       return repo.insert(obj);
    }

    public User fromDTO(UserDTO objDto){
        return  new User(objDto.getId(), objDto.getName(),objDto.getEmail());
    }
}
