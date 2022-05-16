
package com.arieldc.portfolio.service;

import com.arieldc.portfolio.model.Persona;
import com.arieldc.portfolio.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{
    
    @Autowired
    private PersonaRepository persoRepo;

    @Override
    public void nuevaPersona(Persona persona) {
        persoRepo.save(persona);
    }

    @Override
    public Persona verPersona(int id) {
        return persoRepo.findById(id);
    }

    @Override
    public void editarPersona(Persona persona) {
        persoRepo.save(persona);    
    }

    @Override
    public void eliminarPersona(int id) {
        persoRepo.deleteById(id);
    }
    
    public List<Persona> verPersonas(){
        return persoRepo.findAll();
    }
}
