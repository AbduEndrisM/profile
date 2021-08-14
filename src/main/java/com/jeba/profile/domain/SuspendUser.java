package com.jeba.profile.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jeba.profile.domain.enums.SuspensionLevel;
import lombok.Data;

@Data
public class SuspendUser {

    @JsonProperty(value = "phone_number")
    private String phoneNumber;
    @JsonProperty(value = "email")
    private String email;
    @JsonProperty(value = "suspension_level")
    private SuspensionLevel suspensionLevel;
    //private String suspensionLevel;
    @JsonProperty(value = "suspension_reason")
    private String suspensionReason;
    @JsonProperty(value = "code")
    private String code;
}
