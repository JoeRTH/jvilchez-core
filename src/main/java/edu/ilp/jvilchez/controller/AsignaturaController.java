package edu.ilp.jvilchez.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.ilp.jvilchez.entity.Asignatura;
import edu.ilp.jvilchez.service.IAsignaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("asignatura")
public class AsignaturaController {
        @Autowired
        private IAsignaturaService asignaturaService;

        @Autowired
        private ObjectMapper objectMapper;

    @PostMapping("/registra")
    public String registraAsignatura(@RequestBody String jsonAsignatura) throws JsonProcessingException{
        Asignatura asignatura = this.objectMapper.readValue(jsonAsignatura, Asignatura.class);
        this.asignaturaService.guardaAsignatura(asignatura);
        return "Asignatura guardad";
    }

    @GetMapping("/listaAsignaturas")
    public List<Asignatura>listaAsignatura(){ return this.asignaturaService.listaAsignatura();}
}
