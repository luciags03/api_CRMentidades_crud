package edu.altair.apicrud.exceptions;

public class ProfesorNotFoundException extends RuntimeException {

    public ProfesorNotFoundException(String mensaje) {
        super(mensaje);
    }
}