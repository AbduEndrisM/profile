package com.jeba.profile.service;

import com.jeba.profile.domain.SuspendUser;
import com.jeba.profile.domain.entity.User;

import java.io.FileNotFoundException;

public interface IUserService {
    User createUser(User user);

    User saveUser(User user);

    User deleteUser(String phoneNumber);

    User suspendUser(SuspendUser suspendUser);


    User deactivate(String phoneNumber) throws FileNotFoundException;

    User findByPhoneNumber(String phoneNumber);

    User findUserBy(String string);


}
