package com.jeba.profile.service;

import com.jeba.profile.adapter.IUserAdapter;
import com.jeba.profile.domain.SuspendUser;
import com.jeba.profile.domain.entity.User;
import com.jeba.profile.domain.enums.UserStatus;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.FileNotFoundException;
import java.time.LocalDateTime;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService implements IUserService{

    private final IUserAdapter userAdapter;


    @Override
    public User createUser(User user) throws UnsupportedOperationException{
      if(userAdapter.findByPhoneNumber(user.getPhoneNumber())!=null){
          throw new UnsupportedOperationException("User already found");
      }
        return userAdapter.saveUser(user);
    }

    @Override
    public User saveUser(User user) {
        User userToBeUpdated = userAdapter.findByPhoneNumber(user.getPhoneNumber());
        mapNewUserFieldsPut(user, userToBeUpdated);
        return userAdapter.saveUser(userToBeUpdated);

    }



    private void mapNewUserFieldsPatch(User user, User userToBeUpdated) {
        userToBeUpdated.setFirstName(user.getFirstName());
        userToBeUpdated.setLastName(user.getLastName());
        userToBeUpdated.setEmail(user.getEmail());
//        userToBeUpdated.setBirthDate(user.getBirthDate());
//        userToBeUpdated.setAge(user.getAge());

    }

    private void mapNewUserFieldsPut(User user, User userToBeUpdated) {
        if(user.getFirstName()!=null){
            userToBeUpdated.setFirstName(user.getFirstName());
        }
        if(user.getLastName()!=null){
            userToBeUpdated.setLastName(user.getLastName());
        }
        if(user.getEmail()!=null){
            userToBeUpdated.setEmail(user.getEmail());
        }
    }

    @Override
    public User deactivate(String phoneNumber) throws FileNotFoundException {
        return userAdapter.deactivateAccount(phoneNumber);
    }


    @Override
    public User suspendUser(SuspendUser suspendUser) {

        User user = userAdapter.findByPhoneNumber(suspendUser.getPhoneNumber());
        if(user==null){
throw new UnsupportedOperationException("No user found") ;
        }

        switch (suspendUser.getSuspensionLevel()){
            case EASY:
                user.setExpireDate(LocalDateTime.now().plusDays(7));
                user.setUserStatus(UserStatus.SUSPENDED);
                break;
            case MODERATE:
                user.setExpireDate(LocalDateTime.now().plusMonths(1));
                user.setUserStatus(UserStatus.SUSPENDED);
                break;
            case HARD:
                user.setExpireDate(LocalDateTime.now().plusYears(1));
                user.setUserStatus(UserStatus.SUSPENDED);

                break;
            case HARSH:
                user.setExpireDate(LocalDateTime.now());
                user.setUserStatus(UserStatus.INACTIVE);
                break;
        }

//        user.getSuspendUser().setCode(suspendUser.getCode());
//        user.getSuspendUser().setSuspensionReason(suspendUser.getSuspensionReason());
//        user.getSuspendUser().setSuspensionLevel(suspendUser.getSuspensionLevel());
        user.setSuspendUser(suspendUser);
        return userAdapter.saveUser(user);

        // suspend user == set UserStatus to in active and set it to be active after xx days.
    }

    @Override
    public User deleteUser(String phoneNumber) {
        if(userAdapter.findByPhoneNumber(phoneNumber)==null){
            throw new UnsupportedOperationException("User Not found");
        }
        return userAdapter.deleteUser(phoneNumber);
    }


    @Override
    public User findByPhoneNumber(String phoneNumber) {
        if(phoneNumber.length()==10 && phoneNumber.charAt(0)==0){
            phoneNumber = phoneNumber.substring(1);
        }
        if(phoneNumber.charAt(0)!=9){
            return null; // TODO: throw incorrect number exception - handle it at UI level as well
        }
        return userAdapter.findByPhoneNumber(phoneNumber);
    }

    @Override
    public User findUserBy(String string) {



       /* User user = new User();
        String[] names = string.split(" ");
        if(names.length>=1){
            user.setFirstName(names[0]);
            user.setLastName(names[1]);
        }
        else {
            user.setFirstName(string);
        }
        return userAdapter.findByName(user, names.length);*/

        return userAdapter.findByPhoneNumber(string);
    }

    private void findUserByEnum(String string) {
    }



    private Boolean detectFace (){
//        https://stackoverflow.com/questions/12378567/java-face-detection-library
        return Boolean.TRUE;
    }
}
