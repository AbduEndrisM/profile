package com.jeba.profile.repository;

import com.jeba.profile.domain.PhoneNumber;
import com.jeba.profile.domain.Profile;
import com.jeba.profile.domain.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends MongoRepository<User, String> {

    User findByPhoneNumber(String phoneNumber);
    User deleteByPhoneNumber(String phoneNumber);

//
//    @Query("Select * from user WHERE first_name=:firstName")
//    User findUserByFirstName(String firstName);
//
//    @Query("Select * from user WHERE first_name=:firstName AND last_name=:lastName")
//    User findUserByFirstNameAndLastName(String firstName, String lastName);

//    @Query("Select * from user WHERE phone_number=:phoneNumber")
//    User findUserByPhoneNumber(String phoneNumber);

//FIND
//    Optional<List<Profile>> findAllByUserStatus(UserStatus userStatus);
//
//    @Query("Select * from profile where first_name =:firstName" )
//    Optional<Profile> findProfileByFirstName(String firstName);
//
//
//    Optional<Profile> findProfileByPhoneNumber_PhoneNumber(String phoneNumber);
//    Optional<Profile> findProfileByEmail(String email);
//    Profile insertOne(Profile profile);


    //INSERT


    //SUSPEND


    //DELETE can be done using email or phone number.
//    Profile deleteProfileByPhoneNumber_PhoneNumber (String phoneNumber);
//    Profile deleteProfileByEmail(String email);
    //    Optional<Profile> findProfileByPhoneNumber_PhoneNumber(String phoneNumber);

}


















