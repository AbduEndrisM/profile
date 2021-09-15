package com.jeba.profile.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jeba.profile.domain.SuspendUser;
import com.jeba.profile.domain.enums.Language;
import com.jeba.profile.domain.enums.UserStatus;
import com.jeba.profile.domain.Address;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;


@Data
@Document("user")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {

    @Id
    private String id;
    @JsonProperty("phone_number")
    private String phoneNumber;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("email")
    private String email;
    @JsonProperty("password")
    private String password;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("birth_date")
    private LocalDate birthDate;
    @JsonProperty("age")
    private Integer age;

    @JsonProperty("language")
    private Language language;

    @JsonProperty("user_status")
//    @Enumerated(EnumType.STRING)
    private UserStatus userStatus;
    @JsonProperty("start_date")
    private LocalDate startDate;
    @JsonProperty("home_address")
    private Address homeAddress;
    private Address workAddress;

    private SuspendUser suspendUser;
    private LocalDateTime expireDate;

}
