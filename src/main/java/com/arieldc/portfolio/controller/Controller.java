
package com.arieldc.portfolio.controller;

import com.arieldc.portfolio.model.Contacto;
import com.arieldc.portfolio.model.Educacion;
import com.arieldc.portfolio.model.ExperienciaLaboral;
import com.arieldc.portfolio.model.Habilidades;
import com.arieldc.portfolio.model.Persona;
import com.arieldc.portfolio.model.Proyectos;
import com.arieldc.portfolio.model.SubHabilidades;
import com.arieldc.portfolio.service.IContactoService;
import com.arieldc.portfolio.service.IEducacionService;
import com.arieldc.portfolio.service.IExpLabService;
import com.arieldc.portfolio.service.IHabilidadesService;
import com.arieldc.portfolio.service.IPersonaService;
import com.arieldc.portfolio.service.IProyectosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RequestMapping("/app")
@RestController
public class Controller {
    
    @Autowired 
    private IPersonaService persoServ;    
    @Autowired 
    private IHabilidadesService habServ;
    @Autowired
    private IProyectosService proyServ;
    @Autowired
    private IEducacionService eduServ;
    @Autowired
    private IExpLabService expServ;
    @Autowired
    private IContactoService contServ;
    
    
    // Persona
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/persona/nuevo")
    public void nuevaPersona(@RequestBody Persona per){
        persoServ.nuevaPersona(per);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/persona/editar")
    public void editarPersona(@RequestBody Persona per){
        persoServ.editarPersona(per);
    }
    @GetMapping("/persona/ver/{id}")
    public Persona verPersona(@PathVariable int id){
        return persoServ.verPersona(id);
    }
    @GetMapping("/persona/ver")
    public List<Persona> verPersonas(){
        return persoServ.verPersonas();
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/persona/borrar/{id}")
    public void eliminarPersona(@PathVariable int id){
        persoServ.eliminarPersona(id);
    }
    
    // Habilidades (agregar entidad sub-habilidades)
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/habilidad/nueva")
    public void nuevaHab(@RequestBody Habilidades hab){
        habServ.nuevaHab(hab);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/habilidad/editar")
    public void editarHab(@RequestBody Habilidades hab){
        habServ.editarHab(hab);
    }        
    @GetMapping("/habilidad/ver/{id}")
    public Habilidades verHabilidad(@PathVariable int id){
        return habServ.verHabilidad(id);
    }
    @GetMapping("/habilidad/ver")
    public List<Habilidades> verHabilidades(){
        return habServ.verHabilidades();
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/habilidad/borrar/{id}")
    public void eliminarHab(@PathVariable int id){
        habServ.eliminarHab(id);
    }
    
    // SubHabilidades
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/subhabilidad/nueva")
    public void nuevaSubHab(@RequestBody SubHabilidades hab){
        habServ.nuevaSubHab(hab);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/subhabilidad/editar")
    public void editarSubHab(@RequestBody SubHabilidades hab){
        habServ.editarSubHab(hab);
    }        
    @GetMapping("/subhabilidad/ver/{id}")
    public SubHabilidades verSubHabilidad(@PathVariable int id){
        return habServ.verSubHabilidad(id);
    }
    @GetMapping("/subhabilidad/ver")
    public List<SubHabilidades> verSubHabilidades(){
        return habServ.verSubHabilidades();
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/subhabilidad/borrar/{id}")
    public void eliminarSubHab(@PathVariable int id){
        habServ.eliminarSubHab(id);
    }
    
    // Proyectos
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/proyecto/nuevo")
    public void nuevoProy(@RequestBody Proyectos proy){
        proyServ.nuevoProy(proy);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/proyecto/editar")
    public void editarProy(@RequestBody Proyectos proy){
        proyServ.editarProy(proy);
    }
    @GetMapping("/proyecto/ver/{id}")
    public Proyectos verProy(@PathVariable int id){
        return proyServ.verProy(id);
    }
    @GetMapping("/proyecto/ver")
    public List<Proyectos> verProyectos(){
        return proyServ.verProyectos();
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/proyecto/borrar/{id}")
    public void borrarProy(@PathVariable int id){
        proyServ.eliminarProy(id);
    }
    
    // Educacion
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/educacion/nuevo")
    public void nuevaEdu(@RequestBody Educacion edu){
        eduServ.nuevaEdu(edu);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/educacion/editar")
    public void editarEdu(@RequestBody Educacion edu){
        eduServ.editarEdu(edu);
    }
    @GetMapping("/educacion/ver/{id}")
    public Educacion verEdu(@PathVariable int id){
        return eduServ.verEdu(id);
    }
    @GetMapping("/educacion/ver")
    public List<Educacion> verEdus(){
        return eduServ.verEdus();
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/educacion/borrar/{id}")
    public void borrarEdu(@PathVariable int id){
        eduServ.eliminarEdu(id);
    }
    
    
    // Experiencia Laboral
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/experiencia/nuevo")
    public void nuevaExp(@RequestBody ExperienciaLaboral exp){
        expServ.nuevaExp(exp);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/experiencia/editar")
    public void editarExp(@RequestBody ExperienciaLaboral exp){
        expServ.editarExp(exp);
    }
    @GetMapping("/experiencia/ver/{id}")
    public ExperienciaLaboral verExp(@PathVariable int id){
        return expServ.verExp(id);
    }
    @GetMapping("/experiencia/ver")
    public List<ExperienciaLaboral> verExps(){
        return expServ.verExps();
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/experiencia/borrar/{id}")
    public void borrarExp(@PathVariable int id){
        expServ.eliminarExp(id);
    }
    
    // Contacto
    @PostMapping("/contacto/nuevo")
    public void nuevoContacto(@RequestBody Contacto cont){
        contServ.nuevoContacto(cont);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/contacto/editar")
    public void editarContacto(@RequestBody Contacto cont){
        contServ.editarContacto(cont);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/contacto/ver/{id}")
    public Contacto verContacto(@PathVariable int id){
        return contServ.verContacto(id);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/contacto/ver")
    public List<Contacto> verContactos(){
        return contServ.verContactos();
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/contacto/borrar/{id}")
    public void borrarContacto(@PathVariable int id){
        contServ.eliminarContacto(id);
    }
    
}
