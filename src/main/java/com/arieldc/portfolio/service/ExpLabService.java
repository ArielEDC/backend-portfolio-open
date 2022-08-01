
package com.arieldc.portfolio.service;

import com.arieldc.portfolio.model.ExperienciaLaboral;
import com.arieldc.portfolio.repository.ExpLabRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpLabService implements IExpLabService{

    @Autowired ExpLabRepository expRepo;
    
    @Override
    public void nuevaExp(ExperienciaLaboral exp) {
        expRepo.save(exp);
    }

    @Override
    public void editarExp(ExperienciaLaboral exp) {
        expRepo.save(exp);
    }

    @Override
    public void eliminarExp(int id) {
        expRepo.deleteById(id);
    }

    @Override
    public ExperienciaLaboral verExp(int id) {
        return expRepo.findById(id);
    }

    @Override
    public List<ExperienciaLaboral> verExps() {
        return expRepo.findAll();
    }
    
}
