package com.jeba.profile.exception;

import lombok.Data;

@Data
public class ReturnDetail {

    private String errorMsg;
    private String errorSource;
    private Integer errorCode;

}
