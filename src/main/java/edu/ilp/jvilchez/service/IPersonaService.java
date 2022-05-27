package edu.ilp.jvilchez.service;

import edu.ilp.jvilchez.entity.Persona;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IPersonaService {
    //listar persona
    List<Persona> listarPersonas();

}
