package edu.ilp.jvilchez.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "asignatura")
public class Asignatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "idasignatura",length = 20,nullable = false)
    private Long idasignatura;

    @Column(name="creditos",length = 100)
    private String creditos;

    @Column(name="denominacion",length = 150)
    private String denominacion;

    private int hpracticas;
    private int hteoricas;

    @Column(name="sigla",length = 15)
    private String sigla;

    @ManyToMany
    @JoinTable(name = "profesor_asignatura",joinColumns = @JoinColumn(name = "idasignatura"),
            inverseJoinColumns = @JoinColumn(name = "idprofesor"))
    private Set<Asignatura> asignaturas = new HashSet<>();
    //------------------------------------------------------------------------------------------------------------


    public Asignatura() {
    }

    public Asignatura(Long idasignatura) {
        this.idasignatura = idasignatura;
    }

    public Asignatura(Long idasignatura, String creditos, String denominacion, int hpracticas, int hteoricas, String sigla, Set<Asignatura> asignaturas) {
        this.idasignatura = idasignatura;
        this.creditos = creditos;
        this.denominacion = denominacion;
        this.hpracticas = hpracticas;
        this.hteoricas = hteoricas;
        this.sigla = sigla;
        this.asignaturas = asignaturas;
    }

    public Long getIdasignatura() {
        return idasignatura;
    }

    public void setIdasignatura(Long idasignatura) {
        this.idasignatura = idasignatura;
    }

    public String getCreditos() {
        return creditos;
    }

    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public int getHpracticas() {
        return hpracticas;
    }

    public void setHpracticas(int hpracticas) {
        this.hpracticas = hpracticas;
    }

    public int getHteoricas() {
        return hteoricas;
    }

    public void setHteoricas(int hteoricas) {
        this.hteoricas = hteoricas;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Set<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(Set<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }
}
