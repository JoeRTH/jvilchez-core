package edu.ilp.jvilchez.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name="direccion")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Direccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_direccion", length = 10)
    private Long id_direccion;

    @Column(name="calle", length = 100, nullable = false)
    private  String calle;

    @Column(name="ciudad",length = 100)
    private String ciudad;

    @Column(name="codigopostal",length = 100)
    private String codigopostal;

    @Column(name="estado",length = 100)
    private String estado;

    @Column(name="pais",length = 100)
    private String pais;

    public Direccion() {
    }

    public Direccion(Long id_direccion) {
        this.id_direccion = id_direccion;
    }

    public Direccion(Long id_direccion, String calle, String ciudad, String codigopostal, String estado, String pais) {
        this.id_direccion = id_direccion;
        this.calle = calle;
        this.ciudad = ciudad;
        this.codigopostal = codigopostal;
        this.estado = estado;
        this.pais = pais;
    }

    public Long getId_direccion() {
        return id_direccion;
    }

    public void setId_direccion(Long id_direccion) {
        this.id_direccion = id_direccion;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCodigopostal() {
        return codigopostal;
    }

    public void setCodigopostal(String codigopostal) {
        this.codigopostal = codigopostal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

}
