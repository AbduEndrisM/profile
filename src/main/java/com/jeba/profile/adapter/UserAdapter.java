package com.jeba.profile.adapter;

import com.jeba.profile.domain.PhoneNumber;
import com.jeba.profile.domain.Profile;
import com.jeba.profile.domain.entity.User;
import com.jeba.profile.domain.enums.UserFindEnum;
import com.jeba.profile.domain.enums.UserStatus;
import com.jeba.profile.repository.IUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.io.FileNotFoundException;
import java.time.LocalDate;

@Service
@RequiredArgsConstructor
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

    User user = userRepository.findByPhoneNumber(phoneNumber);
//User user = new User();
    if(user ==null){
        throw new FileNotFoundException("user not found"); //TODO
    }
//        return userRepository.deactivateAccount(user);
    return userRepository.findByPhoneNumber(phoneNumber);
    }


    @Override
    public User deleteUser(String phoneNumber) {
        return userRepository.deleteByPhoneNumber(phoneNumber);
    }


    @Override
    public User findByPhoneNumber(String phoneNumber) {

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

//    Object
//    getUser(string);

    return null;
}


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
