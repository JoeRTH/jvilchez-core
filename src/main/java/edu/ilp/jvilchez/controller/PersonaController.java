package edu.ilp.jvilchez.controller;

import edu.ilp.jvilchez.dao.IPersonaDao;
import edu.ilp.jvilchez.entity.Persona;
import edu.ilp.jvilchez.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("persona")
public class PersonaController {
    @Autowired
    private IPersonaService personaService;
    @GetMapping("/listarpersona")
    public List<Persona> listaPersonas(){
        return this.personaService.listarPersonas();

    }
}
