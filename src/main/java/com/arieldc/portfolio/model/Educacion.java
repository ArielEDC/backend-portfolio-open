
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
@Table(name = "educacion")
@NamedQueries({
    @NamedQuery(name = "Educacion.findAll", query = "SELECT e FROM Educacion e"),
    @NamedQuery(name = "Educacion.findById", query = "SELECT e FROM Educacion e WHERE e.id = :id"),
    @NamedQuery(name = "Educacion.findByInstitucion", query = "SELECT e FROM Educacion e WHERE e.institucion = :institucion"),
    @NamedQuery(name = "Educacion.findByTitulo", query = "SELECT e FROM Educacion e WHERE e.titulo = :titulo"),
    @NamedQuery(name = "Educacion.findByFechaInicio", query = "SELECT e FROM Educacion e WHERE e.fechaInicio = :fechaInicio"),
    @NamedQuery(name = "Educacion.findByFechaFin", query = "SELECT e FROM Educacion e WHERE e.fechaFin = :fechaFin"),
    @NamedQuery(name = "Educacion.findByImagen", query = "SELECT e FROM Educacion e WHERE e.imagen = :imagen"),
    @NamedQuery(name = "Educacion.findByPersonaid", query = "SELECT e FROM Educacion e WHERE e.personaid = :personaid")})
public class Educacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue (strategy=GenerationType.SEQUENCE)
    private Integer id;
    
    @Column(name = "institucion")
    private String institucion;
    
    @Column(name = "titulo")
    private String titulo;
    
    @Column(name = "fecha_inicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    
    @Column(name = "fecha_fin")
    @Temporal(TemporalType.DATE)
    private Date fechaFin;
    
    @Column(name= "img")
    private String imagen;
    
    @JoinColumn(name = "Persona_id", referencedColumnName = "id")
    @ManyToOne
    @JsonIgnoreProperties(value = {"educacionCollection","proyectosCollection", "experienciaLaboralCollection","habilidadesCollection"})
    private Persona personaid;

    public Educacion() {
    }

    public Educacion(Integer id, String institucion, String titulo, Date fechaInicio, Date fechaFin, String imagen, Persona personaid) {
        this.id = id;
        this.institucion = institucion;
        this.titulo = titulo;
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

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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
