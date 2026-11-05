package edu.altair.apicrud.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import edu.altair.apicrud.dto.ProfesorRequestDto;
import edu.altair.apicrud.dto.ProfesorResponseDto;
import edu.altair.apicrud.services.ProfesorService;

@RestController
@RequestMapping("/api/profesores")
public class ProfesorController {

    private final ProfesorService profesorService;

    public ProfesorController(ProfesorService profesorService) {
        this.profesorService = profesorService;
    }

    // 1. READ ALL
    @GetMapping
    public ResponseEntity<List<ProfesorResponseDto>> obtenerTodos() {
        return ResponseEntity.ok(profesorService.obtenerTodos());
    }

    // 2. READ BY ID
    @GetMapping("/{id}")
    public ResponseEntity<ProfesorResponseDto> obtenerPorId(@PathVariable Long id) {
        return ResponseEntity.ok(profesorService.obtenerPorId(id));
    }

    // 3. CREATE
    @PostMapping
    public ResponseEntity<ProfesorResponseDto> crear(
            @RequestBody ProfesorRequestDto requestDto) {

        ProfesorResponseDto creado = profesorService.crear(requestDto);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(creado);
    }

    // 4. UPDATE
    @PutMapping("/{id}")
    public ResponseEntity<ProfesorResponseDto> actualizar(
            @PathVariable Long id,
            @RequestBody ProfesorRequestDto requestDto) {

        ProfesorResponseDto actualizado = profesorService.actualizar(id, requestDto);

        return ResponseEntity.ok(actualizado);
    }

    // 5. DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {

        profesorService.eliminar(id);

        return ResponseEntity.noContent().build();
    }
}