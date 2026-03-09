package com.luizbaldini.workshopmongo.repository;

import com.luizbaldini.workshopmongo.domain.User;
import com.luizbaldini.workshopmongo.dto.UserDTO;
import org.springframework.data.domain.Limit;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
