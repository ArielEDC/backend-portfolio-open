
package com.arieldc.portfolio.service;

import com.arieldc.portfolio.model.Proyectos;
import com.arieldc.portfolio.repository.ProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectosService implements IProyectosService {

    @Autowired ProyectosRepository proyRepo;
    
    @Override
    public void nuevoProy(Proyectos proy) {
        proyRepo.save(proy);
    }

    @Override
    public void editarProy(Proyectos proy) {
        proyRepo.save(proy);
    }

    @Override
    public void eliminarProy(int id) {
        proyRepo.deleteById(id);
    }

    @Override
    public Proyectos verProy(int id) {
        return proyRepo.findById(id);
    }

    @Override
    public List<Proyectos> verProyectos() {
        return proyRepo.findAll();
    }
    
}
