
package com.arieldc.portfolio.service;

import com.arieldc.portfolio.model.Contacto;
import java.util.List;


public interface IContactoService {
    
    public void nuevoContacto(Contacto cont);
    public void editarContacto(Contacto cont);
    public void eliminarContacto(int id);
    public Contacto verContacto(int id);
    public List<Contacto> verContactos();
    
}
