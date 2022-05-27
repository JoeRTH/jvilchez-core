package edu.ilp.jvilchez.service;

import edu.ilp.jvilchez.entity.Estudiante;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IEstudianteService {

    Estudiante obtenerEstudiantePorCodigo(String codigo);

    List<Estudiante> listarEstudiantePorApeNombre(String apenombre);
}
