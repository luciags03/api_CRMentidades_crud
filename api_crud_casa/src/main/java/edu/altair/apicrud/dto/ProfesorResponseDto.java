package edu.altair.apicrud.dto;

public record ProfesorResponseDto(
    Long idProfesor,
    String nombre,
    String apellidos,
    String dni,
    String emailCentro,
    String emailPersonal,
    String tlfPersonal
) {}