
package com.arieldc.portfolio.controller;


import com.arieldc.portfolio.model.Persona;
import com.arieldc.portfolio.service.IPersonaService;
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
@RestController
public class PersonaController {
    
    @Autowired 
    private IPersonaService persoServ;    


    // Persona
    @GetMapping("/persona/ver/{id}")
    public Persona verPersona(@PathVariable int id){
        return persoServ.verPersona(id);
    }
    @GetMapping("/persona/ver")
    public List<Persona> verPersonas(){
        return persoServ.verPersonas();
    }
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

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/persona/borrar/{id}")
    public void eliminarPersona(@PathVariable int id){
        persoServ.eliminarPersona(id);
    }

}
