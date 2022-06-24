package edu.ilp.jvilchez.service;

import edu.ilp.jvilchez.entity.Asignatura;

import java.util.List;

public interface IAsignaturaService {
    //Registrar
    Asignatura guardaAsignatura(Asignatura asignatura);
    //Listar
    List<Asignatura> listaAsignatura();
}
