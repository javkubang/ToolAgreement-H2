package com.avee.h2.api.model;

  @ControllerAdvice
  public class RentalExceptionHandler {

      @ExceptionHandler(IllegalArgumentException.class)
      public ResponseEntity<String> handleIllegalArgumentException(IllegalArgumentException ex) {
          return ResponseEntity.badRequest().body(ex.getMessage());
      }
  }

