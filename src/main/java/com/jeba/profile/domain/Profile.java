package com.jeba.profile.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jeba.profile.domain.enums.Gender;
import com.jeba.profile.domain.enums.UserStatus;
import com.jeba.profile.domain.enums.UserType;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Profile {

    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("email")
    private String email;
    @JsonProperty("start_date")
    private LocalDateTime startDate;
    private PhoneNumber phoneNumber;

    private Gender gender;
    private UserStatus userStatus;
    private UserType userType;
    private Address homeAddress;
    private Address workAddress;

}
