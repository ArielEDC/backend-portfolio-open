
package com.arieldc.portfolio.service;

import com.arieldc.portfolio.model.Contacto;
import com.arieldc.portfolio.repository.ContactoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactoService implements IContactoService{

    @Autowired ContactoRepository contRepo;
    
    @Override
    public void nuevoContacto(Contacto cont) {
        contRepo.save(cont);
    }

    @Override
    public void editarContacto(Contacto cont) {
        contRepo.save(cont);
    }

    @Override
    public void eliminarContacto(int id) {
        contRepo.deleteById(id);
    }

    @Override
    public Contacto verContacto(int id) {
        return contRepo.findById(id);
    }

    @Override
    public List<Contacto> verContactos() {
        return contRepo.findAll();
    }
    
}
