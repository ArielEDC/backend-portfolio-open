
package com.arieldc.portfolio.service;

import com.arieldc.portfolio.model.Educacion;
import com.arieldc.portfolio.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService{

    @Autowired EducacionRepository eduRepo;
    
    @Override
    public void nuevaEdu(Educacion edu) {
        eduRepo.save(edu);
    }

    @Override
    public void editarEdu(Educacion edu) {
        eduRepo.save(edu);
    }

    @Override
    public void eliminarEdu(int id) {
        eduRepo.deleteById(id);
    }

    @Override
    public Educacion verEdu(int id) {
        return eduRepo.findById(id);
    }

    @Override
    public List<Educacion> verEdus() {
        return eduRepo.findAll();
    }
    
}
