package com.jeba.profile.config;

import com.jeba.profile.repository.IUserRepository;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackageClasses = IUserRepository.class)
public class MongoDBConfig {
}
