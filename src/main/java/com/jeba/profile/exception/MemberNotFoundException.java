package com.jeba.profile.exception;

import lombok.Getter;

@Getter
public class MemberNotFoundException extends AppException {

  public MemberNotFoundException(String correlationId) {
    super(correlationId, "No Matching User found for the given phone number", 404);
  }
}
