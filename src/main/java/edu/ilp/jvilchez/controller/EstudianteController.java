package edu.ilp.jvilchez.controller;

import edu.ilp.jvilchez.entity.Estudiante;
import edu.ilp.jvilchez.service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("estudiante")
public class EstudianteController {
    @Autowired
    private IEstudianteService estudianteService;


    //Buscar un estudiante por su código
    @GetMapping( "/buscarEstudianteBycodigo" )
    public Estudiante buscarEstudianteByCodigo(@RequestParam String codigo) {
        return this.estudianteService.obtenerEstudiantePorCodigo (codigo);
    }

    @GetMapping("/listarByAppnombre/{appnombre}")
    public List<Estudiante> listarPorApellidoNombre(@PathVariable String appnombre){
        return this.estudianteService.listarEstudiantePorApeNombre(appnombre);
    }

}
