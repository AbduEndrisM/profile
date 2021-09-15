package com.jeba.profile.exception;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class UserExceptionHandler {

  @ExceptionHandler(MemberNotFoundException.class)
  public ResponseEntity<Object> handleMemberNotFoundException(MemberNotFoundException ex, WebRequest wr){
    return ((ResponseEntity.BodyBuilder)ResponseEntity.notFound()).body(errorResponse(ex));
  }

 /* @ExceptionHandler(MemberSaveException.class)
  public ResponseEntity<Object> handleMemberSaveException(MemberSaveException ex, WebRequest wr){
    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse(ex));
  }

  @ExceptionHandler(InvalidMembershipIdException.class)
  public ResponseEntity<ReturnDetail> handleInvalidMembershipIdException(InvalidMembershipIdException ex, WebRequest wr){
    return ResponseEntity.badRequest().body(errorResponse(ex));
  }

  @ExceptionHandler(Exception.class)
  public ResponseEntity<ReturnDetail> handleInvalidMembershipIdException(Exception ex, WebRequest wr){
    return ResponseEntity.badRequest().build();
  }
*/
  private static ReturnDetail errorResponse(AppException ex ) {
   ReturnDetail returnDetail = new ReturnDetail();
    returnDetail.setErrorMsg(ex.getMessage());
    returnDetail.setErrorSource("registration-service");
    returnDetail.setErrorCode(ex.getErrCode());
    return returnDetail;
  }


}
