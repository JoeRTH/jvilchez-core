package edu.ilp.jvilchez.service.impl;

import edu.ilp.jvilchez.dao.IEstudianteDao;
import edu.ilp.jvilchez.entity.Estudiante;
import edu.ilp.jvilchez.service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EstudianteServiceImpl implements IEstudianteService {
    @Autowired
    private IEstudianteDao estudianteDao;

    @Override
    public Estudiante obtenerEstudiantePorCodigo(String codigo) {
        return this.estudianteDao.obtenerEstudiantePorCodigo(codigo);
    }
    @Override
    public List<Estudiante> listarEstudiantePorApeNombre(String apenombre) {
        return this.estudianteDao.listarEstudiantesByAppNombre(apenombre);
    }

}
