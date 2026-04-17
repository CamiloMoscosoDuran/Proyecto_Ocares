package com.practica.api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(origins = "*") // Importante para que Angular pueda conectar
public class PersonaController {
    @Autowired
    private PersonaRepository repository;

    @GetMapping("/datos")
    public List<Persona> getDatos() {
        return repository.findAll();
    }
}
