package com.arieldc.portfolio.controller;

import com.arieldc.portfolio.model.ExperienciaLaboral;
import com.arieldc.portfolio.service.IExpLabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
public class ExperienciaController {

    @Autowired
    private IExpLabService expServ;

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
}
