
package com.arieldc.portfolio.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "experiencia_laboral")
@NamedQueries({
    @NamedQuery(name = "ExperienciaLaboral.findAll", query = "SELECT e FROM ExperienciaLaboral e"),
    @NamedQuery(name = "ExperienciaLaboral.findById", query = "SELECT e FROM ExperienciaLaboral e WHERE e.id = :id"),
    @NamedQuery(name = "ExperienciaLaboral.findByTrabajo", query = "SELECT e FROM ExperienciaLaboral e WHERE e.trabajo = :trabajo"),
    @NamedQuery(name = "ExperienciaLaboral.findByEmpresa", query = "SELECT e FROM ExperienciaLaboral e WHERE e.empresa = :empresa"),
    @NamedQuery(name = "ExperienciaLaboral.findByDescripcion", query = "SELECT e FROM ExperienciaLaboral e WHERE e.descripcion = :descripcion"),
    @NamedQuery(name = "ExperienciaLaboral.findByFechaInicio", query = "SELECT e FROM ExperienciaLaboral e WHERE e.fechaInicio = :fechaInicio"),
    @NamedQuery(name = "ExperienciaLaboral.findByFechaFin", query = "SELECT e FROM ExperienciaLaboral e WHERE e.fechaFin = :fechaFin"),
    @NamedQuery(name = "ExperienciaLaboral.findByImagen", query = "SELECT e FROM ExperienciaLaboral e WHERE e.imagen = :imagen"),
    @NamedQuery(name = "ExperienciaLaboral.findByPersonaid", query = "SELECT e FROM ExperienciaLaboral e WHERE e.personaid = :personaid")})
public class ExperienciaLaboral implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue (strategy=GenerationType.SEQUENCE)
    private Integer id;
    @Column(name = "trabajo")
    private String trabajo;
    @Column(name = "empresa")
    private String empresa;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "fecha_inicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Column(name = "fecha_fin")
    @Temporal(TemporalType.DATE)
    private Date fechaFin;
    @Column(name = "img")
    private String imagen;
    
    @JoinColumn(name = "Persona_id", referencedColumnName = "id")
    @ManyToOne
    @JsonIgnoreProperties(value =  {"educacionCollection","proyectosCollection", "experienciaLaboralCollection","habilidadesCollection"})
    private Persona personaid;

    public ExperienciaLaboral() {
    }

    public ExperienciaLaboral(Integer id, String trabajo, String empresa, String descripcion, Date fechaInicio, Date fechaFin,String imagen, Persona personaid) {
        this.id = id;
        this.trabajo = trabajo;
        this.empresa = empresa;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.imagen = imagen;
        this.personaid = personaid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
    
    public String getImagen(){
        return imagen;
    }
    
    public void setImagen(String imagen){
        this.imagen = imagen;
    }

    public Persona getPersonaid() {
        return personaid;
    }

    public void setPersonaid(Persona personaid) {
        this.personaid = personaid;
    }
    
    
    
}

    