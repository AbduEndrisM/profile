package com.jeba.profile.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Address {

    @JsonProperty("house_number")
    private String houseNumber;
    @JsonProperty("street")
    private String street;
    @JsonProperty("sub_city")
    private String subCity;
    @JsonProperty("city")
    private String city;
    @JsonProperty("country")
    private String country;

}
