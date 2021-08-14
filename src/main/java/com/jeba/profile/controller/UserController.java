package com.jeba.profile.controller;

import com.jeba.profile.domain.PhoneNumber;
import com.jeba.profile.domain.SuspendUser;
import com.jeba.profile.domain.entity.User;
import com.jeba.profile.domain.enums.UserStatus;
import com.jeba.profile.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.FileNotFoundException;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/user/")
public class UserController {

    private final IUserService userService;

    @PostMapping(value = "create", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    //just phone number
    public User createUser(@RequestBody User user) {
        user.setPhoneNumber(user.getPhoneNumber().replaceAll("\\s", "").trim());
        user.setUserStatus(UserStatus.ACTIVE);
        System.out.println("LOG: UserController: createUser(): phoneNumber " + user.getPhoneNumber());
        return userService.createUser(user);
    }

    @PutMapping(value = "save", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    //save info during/after sign-up
    public User saveUser(@RequestBody User user) {
        user.setPhoneNumber(user.getPhoneNumber().replaceAll("\\s", ""));
        System.out.println("LOG: UserController: saveUser(): phoneNumber " + user.getPhoneNumber());

        return userService.saveUser(user);
    }
/*    //TODO: DO WE REALLY NEED THIS?
    @PatchMapping(value = "update", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    //update info after sign-up
    public User updateUser(@RequestBody @Valid User user) {
        user.setPhoneNumber(user.getPhoneNumber().replaceAll("\\s", "").trim());
        return userService.updateUser(user);
    }*/


    @PutMapping(value = "suspend", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public User suspendUser(@RequestBody SuspendUser suspendUser) {
        suspendUser.setPhoneNumber(suspendUser.getPhoneNumber().replaceAll("\\s", ""));
        return userService.suspendUser(suspendUser);
    }
    @PutMapping(value = "deactivate", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public User deactivateAccount(@RequestBody PhoneNumber phoneNumber) throws FileNotFoundException {

        phoneNumber.setPhoneNumber(phoneNumber.getPhoneNumber().replaceAll("\\s", ""));
        System.out.println("LOG: UserController: deactivateAccount(): phoneNumber " + phoneNumber.getPhoneNumber());
        return userService.deactivate(phoneNumber.getPhoneNumber());
    }


    @DeleteMapping(value = "delete", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public User deleteUser(@RequestBody PhoneNumber phoneNumber) {
        phoneNumber.setPhoneNumber(phoneNumber.getPhoneNumber().replaceAll("\\s", ""));
        System.out.println("LOG: UserController: deleteUser(): phoneNumber " + phoneNumber.getPhoneNumber());

        return userService.deleteUser(phoneNumber.getPhoneNumber());
    }


    @GetMapping("get")
    public User findByPhoneNumber(@RequestBody String phoneNumber) {
        return userService.findByPhoneNumber(phoneNumber);
    }


    @GetMapping("findUserBy")
    public User findUserBy(@RequestBody String string) {
        return userService.findUserBy(string);
    }


}
