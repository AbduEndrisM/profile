package com.jeba.profile.repository;

import com.jeba.profile.domain.entity.Device;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDeviceRepository extends MongoRepository<Device, String> {
}
