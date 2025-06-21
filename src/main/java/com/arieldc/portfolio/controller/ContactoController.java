package com.arieldc.portfolio.controller;

import com.arieldc.portfolio.model.Contacto;
import com.arieldc.portfolio.service.IContactoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class ContactoController {

    @Autowired
    private IContactoService contServ;
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
