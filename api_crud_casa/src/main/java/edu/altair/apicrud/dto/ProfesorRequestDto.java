package edu.altair.apicrud.dto;

public record ProfesorRequestDto(
    String nombre,
    String apellidos,
    String dni,
    String emailCentro,
    String emailPersonal,
    String tlfPersonal
) {}