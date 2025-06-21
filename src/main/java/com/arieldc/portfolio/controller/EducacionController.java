package com.arieldc.portfolio.controller;

import com.arieldc.portfolio.model.Educacion;
import com.arieldc.portfolio.service.IEducacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
public class EducacionController {

    @Autowired
    private IEducacionService eduServ;
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
}
