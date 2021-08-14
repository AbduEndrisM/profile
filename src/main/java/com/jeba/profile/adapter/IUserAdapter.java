package com.jeba.profile.adapter;

import com.jeba.profile.domain.PhoneNumber;
import com.jeba.profile.domain.Profile;
import com.jeba.profile.domain.SuspendUser;
import com.jeba.profile.domain.entity.User;

import java.io.FileNotFoundException;

public interface IUserAdapter {

    User saveUser(User user);

    User updateUser(User user );

    User deactivateAccount(String phoneNumber) throws FileNotFoundException;

    User suspendUser(User user);

    User deleteUser(String phoneNumber);

    User findByPhoneNumber(String phoneNumber);

//    User findByName(User user, int names);

    User findUserBy(String string);
}
