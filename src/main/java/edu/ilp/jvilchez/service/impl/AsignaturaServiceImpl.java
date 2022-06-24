package edu.ilp.jvilchez.service.impl;

import edu.ilp.jvilchez.dao.IAsignaturaDao;
import edu.ilp.jvilchez.entity.Asignatura;
import edu.ilp.jvilchez.service.IAsignaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AsignaturaServiceImpl implements IAsignaturaService {

    @Autowired
    private IAsignaturaDao asignaturaDao;

    @Override
    public Asignatura guardaAsignatura(Asignatura asignatura) {
        return this.asignaturaDao.save(asignatura);
    }

    @Override
    public List<Asignatura> listaAsignatura() {
        return this.asignaturaDao.findAll();
    }
}
