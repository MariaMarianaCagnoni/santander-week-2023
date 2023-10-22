package me.dio.controller.exeception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;

/**
 * @author mariana
 * @Project: santander-week-2023
 */
@RestControllerAdvice
public class GlobalExceptionHandler {


   private final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);
    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<String> handler(NoSuchElementException notFoundException){
        return new ResponseEntity<>("Resource Id not found", HttpStatus.NO_CONTENT);
    }
    @ExceptionHandler(Throwable.class)
    public ResponseEntity<String> handlerUnexpected(Throwable unexception){
        logger.error("Unexception server error,see the logs ",unexception);
        return new ResponseEntity<>("Unexception server error", HttpStatus.NO_CONTENT);
    }
}
