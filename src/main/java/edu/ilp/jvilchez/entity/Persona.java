package edu.ilp.jvilchez.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "persona")
@Inheritance( strategy = InheritanceType.JOINED )
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpersona", length = 10)
    private Long idpersona;

    @Column(name = "nombre", length = 100, nullable = false)
    private String nombre;

    @Column(name = "apellido", length = 100, nullable = false)
    private String apellido;

    @Column(name = "telefono", length = 100, nullable = false)
    private String telefono;

    @Column(name="email", length = 100)
    private String email;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Direccion direccion;


    public Persona() {
    }

    //--------------------------------------------------------------------------------------------------------
    public Persona(Long idpersona) {
        this.idpersona = idpersona;
    }

    //--------------------------------------------------------------------------------------------------------

    public Persona(String nombre, String apellido, String telefono, String email, Direccion direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
    }

    //--------------------------------------------------------------------------------------------------------


    public Long getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(Long idpersona) {
        this.idpersona = idpersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}