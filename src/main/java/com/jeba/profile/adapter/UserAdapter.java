package com.jeba.profile.adapter;

import com.jeba.profile.domain.PhoneNumber;
import com.jeba.profile.domain.Profile;
import com.jeba.profile.domain.entity.User;
import com.jeba.profile.domain.enums.UserFindEnum;
import com.jeba.profile.domain.enums.UserStatus;
<<<<<<< HEAD
import com.jeba.profile.exception.MemberNotFoundException;
import com.jeba.profile.repository.IUserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
=======
import com.jeba.profile.repository.IUserRepository;
import lombok.RequiredArgsConstructor;
>>>>>>> 95ace55bb7762c02623c0d90962014b502d30331
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.io.FileNotFoundException;
import java.time.LocalDate;
<<<<<<< HEAD
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
=======

@Service
@RequiredArgsConstructor
>>>>>>> 95ace55bb7762c02623c0d90962014b502d30331
public class UserAdapter implements IUserAdapter {

    private final IUserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User suspendUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User deactivateAccount(String phoneNumber) throws FileNotFoundException {

<<<<<<< HEAD
        User user = userRepository.findByPhoneNumber(phoneNumber);
//User user = new User();
        if (user == null) {
            log.error("user not found with phone nnumber: "+ phoneNumber);
            throw new FileNotFoundException("user not found"); //TODO
        }
//        return userRepository.deactivateAccount(user);
        log.info("user returned: "+ user);
        return userRepository.findByPhoneNumber(phoneNumber);
=======
    User user = userRepository.findByPhoneNumber(phoneNumber);
//User user = new User();
    if(user ==null){
        throw new FileNotFoundException("user not found"); //TODO
    }
//        return userRepository.deactivateAccount(user);
    return userRepository.findByPhoneNumber(phoneNumber);
>>>>>>> 95ace55bb7762c02623c0d90962014b502d30331
    }


    @Override
    public User deleteUser(String phoneNumber) {
        return userRepository.deleteByPhoneNumber(phoneNumber);
    }


    @Override
    public User findByPhoneNumber(String phoneNumber) {

<<<<<<< HEAD
//        phoneNumber = phoneNumber.replaceAll("\\s", "").trim();

        User user = userRepository.findByPhoneNumber(phoneNumber);

        if (user == null)

            throw new MemberNotFoundException(UUID.randomUUID().toString());
        else
            return user;
    }

    /*    @Override
        public User findByName(User user, int names) {

            if (names==1)
            return userRepository.findUserByFirstName(user.getFirstName());
            else
                return userRepository.findUserByFirstNameAndLastName(user.getFirstName(), user.getLastName());
        }*/
    @Override
    public User findUserBy(String string) {
=======
        phoneNumber = phoneNumber.replaceAll("\\s", "").trim();

        return userRepository.findByPhoneNumber(phoneNumber);
    }

/*    @Override
    public User findByName(User user, int names) {

        if (names==1)
        return userRepository.findUserByFirstName(user.getFirstName());
        else
            return userRepository.findUserByFirstNameAndLastName(user.getFirstName(), user.getLastName());
    }*/
@Override
public User findUserBy(String string) {
>>>>>>> 95ace55bb7762c02623c0d90962014b502d30331

//    Object
//    getUser(string);

<<<<<<< HEAD
        return null;
    }
=======
    return null;
}
>>>>>>> 95ace55bb7762c02623c0d90962014b502d30331


    /*public User getUser(UserFindEnum e, Object obj){
        //        https://www.tabnine.com/code/java/classes/demo.UserRepository

        switch(e.ordinal()){
            case 0:
                return userRepository.findByName(obj);
            case 1:
                return userRepository.findByEmail(obj);
            case 2:
                return userRepository.findByEmail(obj);
            default:
                break;
        }

    }*/
}
