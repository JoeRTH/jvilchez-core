package edu.ilp.jvilchez.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table (name = "profesor")
//PrimaryKeyJoinColumn(referencedColumnName = "IDPERSONA")
public class Profesor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "idprofesor",length = 20,nullable = false)
    private Long idProfesor;

    @Column(name = "salario", length = 100, nullable = false)
    private Double salario;

    @OneToOne
    @JoinColumn(name = "idpersona",referencedColumnName = "idpersona")
    private Persona persona;

    @ManyToMany
    @JoinTable(name = "profesor_asignatura",joinColumns = @JoinColumn(name = "idprofesor"),
            inverseJoinColumns = @JoinColumn(name = "idasignatura"))
    private Set<Asignatura> asignaturas = new HashSet<>();

    public Profesor() {
    }

    public Profesor(Long idProfesor) {
        this.idProfesor = idProfesor;
    }

    public Profesor(Long idProfesor, Double salario, Persona persona, Set<Asignatura> asignaturas) {
        this.idProfesor = idProfesor;
        this.salario = salario;
        this.persona = persona;
        this.asignaturas = asignaturas;
    }

    public Long getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(Long idProfesor) {
        this.idProfesor = idProfesor;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Set<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(Set<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }
}