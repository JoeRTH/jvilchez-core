package edu.ilp.jvilchez.dao;

import edu.ilp.jvilchez.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IEstudianteDao extends JpaRepository<Estudiante,Long> {

    @Query("SELECT e FROM Estudiante e WHERE e.codigo = :codigo")
    Estudiante obtenerEstudiantePorCodigo(@Param("codigo") String codigo);


    //Lista estudiante por apellido o nombre
    @Query("SELECT e FROM Estudiante e WHERE e.nombre LIKE CONCAT('%',:appnombre,'%') OR e.apellido LIKE CONCAT('%',:appnombre,'%') ")
    List<Estudiante> listarEstudiantesByAppNombre(@Param("appnombre") String appnombre);
}
