package edu.ilp.jvilchez.service.impl;

import edu.ilp.jvilchez.dao.IPersonaDao;
import edu.ilp.jvilchez.entity.Persona;
import edu.ilp.jvilchez.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonaServiceImpl  implements IPersonaService {
    @Autowired
    private IPersonaDao personaDao;

    @Override
    public List<Persona> listarPersonas() {
        return this.personaDao.findAll();
    }
}
