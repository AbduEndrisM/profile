package com.jeba.profile.repository;

import com.jeba.profile.domain.entity.Location;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ILocationRepository extends MongoRepository<Location, String> {
}
