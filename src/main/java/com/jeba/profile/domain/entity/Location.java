package com.jeba.profile.domain.entity;

import com.jeba.profile.domain.Coords;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Document("location")
public class Location {
    @Id
    private String id;
    private Coords coords;
    private Boolean mocked;
//    private LocalDateTime timeStamp;
    private String timeStamp; //TODO
}
