package edu.altair.apicrud.exceptions;

public class DNIAlreadyExistsException extends RuntimeException {

    public DNIAlreadyExistsException(String mensaje) {
        super(mensaje);
    }
}