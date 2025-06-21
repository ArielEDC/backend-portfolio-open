package com.arieldc.portfolio.controller;

import com.arieldc.portfolio.model.SubHabilidades;
import com.arieldc.portfolio.service.IHabilidadesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
public class SubHabilidadesController {

    @Autowired
    private IHabilidadesService habServ;

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
}
