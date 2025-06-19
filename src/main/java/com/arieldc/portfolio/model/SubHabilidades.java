
package com.arieldc.portfolio.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.io.Serializable;


@Entity
@Table(name = "sub_habilidades")
public class SubHabilidades implements Serializable {
    
    @Id
    @GeneratedValue (strategy=GenerationType.SEQUENCE)
    private Integer id;
    @Column(name = "sub_habilidad")
    private String subHabilidad;
    @JoinColumn(name = "Habilidadid", referencedColumnName = "id")
    @ManyToOne
    @JsonIgnoreProperties(value = "subHabilidadCollection")
    private Habilidades habilidadId;

    public SubHabilidades() {
    }

    public SubHabilidades(Integer id, String subHabilidad, Habilidades habilidadId) {
        this.id = id;
        this.subHabilidad = subHabilidad;
        this.habilidadId = habilidadId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubHabilidad() {
        return subHabilidad;
    }

    public void setSubHabilidad(String subHabilidad) {
        this.subHabilidad = subHabilidad;
    }

    public Habilidades getHabilidadId() {
        return habilidadId;
    }

    public void setHabilidadId(Habilidades habilidadId) {
        this.habilidadId = habilidadId;
    }
    
    
}
