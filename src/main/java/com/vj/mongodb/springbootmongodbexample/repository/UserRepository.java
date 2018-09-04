package com.vj.mongodb.springbootmongodbexample.repository;

import com.vj.mongodb.springbootmongodbexample.document.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<Users, Integer> {
}
