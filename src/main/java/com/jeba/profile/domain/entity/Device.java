package com.jeba.profile.domain.entity;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("device")
public class Device {
    @Id
    private String id;
    private String phoneNumber;
    private String brand;
    private String buildNumber;
    private String carrier;
    private String device;
    private String deviceId;
    private String deviceName;
    private String firstInstallTime;
    private String lastUpdateTime;
    private String manufacturer;
    private String uniqueId;
    private String version;
    private String deviceType;
    private String isLocationEnabled;
}
