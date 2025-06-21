package com.arieldc.portfolio.controller;

import com.arieldc.portfolio.model.Habilidades;
import com.arieldc.portfolio.service.IHabilidadesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
public class HabilidadesController {

    @Autowired
    private IHabilidadesService habServ;

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
}
