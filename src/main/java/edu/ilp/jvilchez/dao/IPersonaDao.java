package edu.ilp.jvilchez.dao;

import edu.ilp.jvilchez.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IPersonaDao extends JpaRepository<Persona, Long> {

}
