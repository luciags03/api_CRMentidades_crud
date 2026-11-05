package edu.altair.apicrud.services;

import java.util.List;

import edu.altair.apicrud.dto.ProfesorRequestDto;
import edu.altair.apicrud.dto.ProfesorResponseDto;

public interface ProfesorService {

    List<ProfesorResponseDto> obtenerTodos();

    ProfesorResponseDto obtenerPorId(Long id);

    ProfesorResponseDto crear(ProfesorRequestDto requestDto);

    ProfesorResponseDto actualizar(Long id, ProfesorRequestDto requestDto);

    void eliminar(Long id);
}