
package com.arieldc.portfolio.service;

import com.arieldc.portfolio.model.Persona;
import java.util.List;


public interface IPersonaService {
    
    public void nuevaPersona(Persona persona);
    public Persona verPersona(int id);
    public void editarPersona(Persona persona);
    public void eliminarPersona(int id);
    public List<Persona> verPersonas();
    
    
}
