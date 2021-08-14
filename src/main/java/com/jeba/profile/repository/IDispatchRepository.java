package com.jeba.profile.repository;

import com.jeba.profile.domain.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IDispatchRepository extends MongoRepository<User, String> {
}
