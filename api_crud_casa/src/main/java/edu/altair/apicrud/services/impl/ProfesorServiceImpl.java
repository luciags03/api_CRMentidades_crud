package edu.altair.apicrud.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.altair.apicrud.dto.ProfesorRequestDto;
import edu.altair.apicrud.dto.ProfesorResponseDto;
import edu.altair.apicrud.entities.Profesor;
import edu.altair.apicrud.exceptions.DNIAlreadyExistsException;
import edu.altair.apicrud.exceptions.ProfesorNotFoundException;
import edu.altair.apicrud.repositories.ProfesorRepository;
import edu.altair.apicrud.services.ProfesorService;

@Service
public class ProfesorServiceImpl implements ProfesorService {

    private final ProfesorRepository profesorRepository;

    public ProfesorServiceImpl(ProfesorRepository profesorRepository) {
        this.profesorRepository = profesorRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<ProfesorResponseDto> obtenerTodos() {
        return profesorRepository.findAll()
                .stream()
                .map(this::mapToResponseDto)
                .toList();
    }

    @Override
    @Transactional(readOnly = true)
    public ProfesorResponseDto obtenerPorId(Long id) {
        Profesor profesor = profesorRepository.findById(id)
                .orElseThrow(() -> new ProfesorNotFoundException(
                        "Profesor no encontrado con ID: " + id));

        return mapToResponseDto(profesor);
    }

    @Override
    @Transactional
    public ProfesorResponseDto crear(ProfesorRequestDto dto) {

        if (profesorRepository.existsByDni(dto.dni())) {
            throw new DNIAlreadyExistsException(
                    "Ya existe un profesor con el DNI: " + dto.dni());
        }

        Profesor nuevoProfesor = new Profesor();

        nuevoProfesor.setNombre(dto.nombre());
        nuevoProfesor.setApellidos(dto.apellidos());
        nuevoProfesor.setdni(dto.dni());
        nuevoProfesor.setEmailCentro(dto.emailCentro());
        nuevoProfesor.setEmailPersonal(dto.emailPersonal());
        nuevoProfesor.setTlfPersonal(dto.tlfPersonal());

        Profesor guardado = profesorRepository.save(nuevoProfesor);

        return mapToResponseDto(guardado);
    }

    @Override
    @Transactional
    public ProfesorResponseDto actualizar(Long id, ProfesorRequestDto dto) {

        Profesor profesorExistente = profesorRepository.findById(id)
                .orElseThrow(() -> new ProfesorNotFoundException(
                        "Profesor no encontrado con ID: " + id));

        if (!profesorExistente.getdni().equalsIgnoreCase(dto.dni())
                && profesorRepository.existsByDni(dto.dni())) {
            throw new DNIAlreadyExistsException(
                    "El DNI " + dto.dni() + " ya está en uso.");
        }

        profesorExistente.setNombre(dto.nombre());
        profesorExistente.setApellidos(dto.apellidos());
        profesorExistente.setdni(dto.dni());
        profesorExistente.setEmailCentro(dto.emailCentro());
        profesorExistente.setEmailPersonal(dto.emailPersonal());
        profesorExistente.setTlfPersonal(dto.tlfPersonal());

        Profesor actualizado = profesorRepository.save(profesorExistente);

        return mapToResponseDto(actualizado);
    }

    @Override
    @Transactional
    public void eliminar(Long id) {

        if (!profesorRepository.existsById(id)) {
            throw new ProfesorNotFoundException(
                    "Imposible eliminar. Profesor no encontrado con ID: " + id);
        }

        profesorRepository.deleteById(id);
    }

    private ProfesorResponseDto mapToResponseDto(Profesor profesor) {
        return new ProfesorResponseDto(
                profesor.getidProfesor(),
                profesor.getNombre(),
                profesor.getApellidos(),
                profesor.getdni(),
                profesor.getEmailCentro(),
                profesor.getEmailPersonal(),
                profesor.getTlfPersonal()
        );
    }
}