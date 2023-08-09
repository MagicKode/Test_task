package com.example.numberscounter.exceptionHandler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import java.util.NoSuchElementException;

@ControllerAdvice(annotations = {RestController.class})
public class ApplicationExceptionHandler {

    @ExceptionHandler(value = {NoSuchElementException.class})
    public ResponseEntity<String> handleNoSuchElementException(NoSuchElementException exception) {
        String message = "No counter with such id";
        return ResponseEntity.status(404).body(message);
    }

    @ExceptionHandler(value = {MethodArgumentNotValidException.class})
    public ResponseEntity<String> handleValidationError(MethodArgumentNotValidException exception) {
        String message = "Check input fields";
        return ResponseEntity.status(400).body(message);
    }
}
