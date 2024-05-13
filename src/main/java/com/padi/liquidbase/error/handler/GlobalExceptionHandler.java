package com.padi.liquidbase.error.handler;

import com.padi.liquidbase.error.OkException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

  private static final Logger EXECPTION_LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);

  @ExceptionHandler(value = OkException.class)
  @ResponseStatus(value = HttpStatus.OK)
  public ResponseEntity<Object> handleOkException(OkException exception, WebRequest webRequest){
    HttpHeaders httpHeaders = new HttpHeaders();
    HttpStatus httpStatus = HttpStatus.OK;

    EXECPTION_LOGGER.warn("OkException ::: {}", exception.getMessage());
    return handleExceptionInternal(exception, exception, httpHeaders, httpStatus,webRequest);
  }
}
