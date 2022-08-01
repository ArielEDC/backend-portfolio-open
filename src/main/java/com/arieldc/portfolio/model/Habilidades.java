
package com.arieldc.portfolio.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "habilidades")

@NamedQueries({
    @NamedQuery(name = "Habilidades.findAll", query = "SELECT h FROM Habilidades h"),
    @NamedQuery(name = "Habilidades.findById", query = "SELECT h FROM Habilidades h WHERE h.id = :id"),
    @NamedQuery(name = "Habilidades.findByPersonaid", query = "SELECT h FROM Habilidades h WHERE h.personaid = :personaid")})
public class Habilidades implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue (strategy=GenerationType.SEQUENCE)
    private Integer id;
    @Column(name = "habilidad")
    private String habilidad;
    @JoinColumn(name = "Persona_id", referencedColumnName = "id")
    @ManyToOne
    @JsonIgnoreProperties(value =  {"educacionCollection","proyectosCollection", "experienciaLaboralCollection","habilidadesCollection"})
    private Persona personaid;
    
    @OneToMany(mappedBy = "habilidadId")
    @JsonIgnoreProperties(value = "Persona")
    private Collection<SubHabilidades> subHabilidadCollection;

    public Habilidades() {
    }

    public Habilidades(Integer id, String habilidad, Persona personaid) {
        this.id = id;
        this.habilidad = habilidad;
        this.personaid = personaid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public Persona getPersonaid() {
        return personaid;
    }

    public void setPersonaid(Persona personaid) {
        this.personaid = personaid;
    }

    
    
}
