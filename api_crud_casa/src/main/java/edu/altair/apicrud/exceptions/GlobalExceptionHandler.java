package edu.altair.apicrud.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ProfesorNotFoundException.class)
    public ProblemDetail handleProfesorNotFound(ProfesorNotFoundException ex) {

        return ProblemDetail.forStatusAndDetail(
                HttpStatus.NOT_FOUND,
                ex.getMessage()
        );
    }

    @ExceptionHandler(DNIAlreadyExistsException.class)
    public ProblemDetail handleDNIAlreadyExists(DNIAlreadyExistsException ex) {

        return ProblemDetail.forStatusAndDetail(
                HttpStatus.CONFLICT,
                ex.getMessage()
        );
    }
}