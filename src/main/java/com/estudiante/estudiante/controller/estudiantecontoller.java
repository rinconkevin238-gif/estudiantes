package com.estudiante.estudiante.controller;

public class estudiantecontoller {
    package com.estudiante.estudiante.controller;

import com.estudiante.estudiante.model.Estudiante;
import com.estudiante.estudiante.repository.EstudianteRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("/estudiantes")
    public class EstudianteController {

        private final EstudianteRepository repository;

        public EstudianteController(EstudianteRepository repository) {
            this.repository = repository;
        }

        @GetMapping
        public List<Estudiante> getAll() {
            return repository.findAll();
        }

        @PostMapping
        public Estudiante create(@RequestBody Estudiante estudiante) {
            return repository.save(estudiante);
        }

        @GetMapping("/{id}")
        public Estudiante getById(@PathVariable Long id) {
            return repository.findById(id).orElse(null);
        }
    }
}
