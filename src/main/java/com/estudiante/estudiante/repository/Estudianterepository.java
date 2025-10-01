package com.estudiante.estudiante.repository;

import com.estudiante.estudiante.model.estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public class Estudianterepository {
    package com.estudiante.estudiante.repository;

import com.estudiante.estudiante.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface EstudianteRepository extends JpaRepository<estudiante.Estudiante, Long> {
    }
}
