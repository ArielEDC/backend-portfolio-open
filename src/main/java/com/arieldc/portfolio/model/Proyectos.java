
package com.arieldc.portfolio.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name = "proyectos")

@NamedQueries({
    @NamedQuery(name = "Proyectos.findAll", query = "SELECT p FROM Proyectos p"),
    @NamedQuery(name = "Proyectos.findById", query = "SELECT p FROM Proyectos p WHERE p.id = :id"),
    @NamedQuery(name = "Proyectos.findByNombre", query = "SELECT p FROM Proyectos p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Proyectos.findByDescripcion", query = "SELECT p FROM Proyectos p WHERE p.descripcion = :descripcion"),
    @NamedQuery(name = "Proyectos.findByLink", query = "SELECT p FROM Proyectos p WHERE p.link = :link"),
    @NamedQuery(name = "Proyectos.findByPersonaid", query = "SELECT p FROM Proyectos p WHERE p.personaid = :personaid")})
public class Proyectos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue (strategy=GenerationType.SEQUENCE)
    private Integer id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "link")
    private String link;
    @JoinColumn(name = "Persona_id", referencedColumnName = "id")
    @ManyToOne
    @JsonIgnoreProperties(value =  {"educacionCollection","proyectosCollection", "experienciaLaboralCollection","habilidadesCollection"})
    private Persona personaid;

    public Proyectos() {
    }

    public Proyectos(Integer id, String nombre, String descripcion, String link, Persona personaid) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.link = link;
        this.personaid = personaid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Persona getPersonaid() {
        return personaid;
    }

    public void setPersonaid(Persona personaid) {
        this.personaid = personaid;
    }

   
}
