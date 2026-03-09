package com.luizbaldini.workshopmongo.repository;

import com.luizbaldini.workshopmongo.domain.Post;
import com.luizbaldini.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
