package com.dev.java.EventClean.infra.exceptions;

import com.dev.java.EventClean.core.exceptions.DuplicateKeyException;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerExceptionHandler {

  @ExceptionHandler(DuplicateKeyException.class)
  public ResponseEntity<Map<String, String>> handleDuplicateKeyException(DuplicateKeyException e) {
    Map<String, String> response = Map.of("error", "Identificador duplciado", "message", e.getMessage());
    return ResponseEntity.status(HttpStatus.CONFLICT).body(response);
  }
}
