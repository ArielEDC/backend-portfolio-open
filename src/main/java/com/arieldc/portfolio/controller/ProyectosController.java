package com.arieldc.portfolio.controller;

import com.arieldc.portfolio.model.Proyectos;
import com.arieldc.portfolio.service.IProyectosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
public class ProyectosController {

    @Autowired
    private IProyectosService proyServ;
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
}
