
package com.arieldc.portfolio.service;

import com.arieldc.portfolio.model.Habilidades;
import com.arieldc.portfolio.model.SubHabilidades;
import com.arieldc.portfolio.repository.HabilidadesRepository;
import com.arieldc.portfolio.repository.SubHabilidadesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadesService implements IHabilidadesService{

    @Autowired
    private HabilidadesRepository habRepo;
    @Autowired
    private SubHabilidadesRepository shabRepo;
    
    @Override
    public void nuevaHab(Habilidades hab) {
       habRepo.save(hab);
    }

    @Override
    public void editarHab(Habilidades hab) {
       habRepo.save(hab);
    }

    @Override
    public void eliminarHab(int id) {
        habRepo.deleteById(id);
    }

    @Override
    public Habilidades verHabilidad(int id) {
        return habRepo.findById(id);
    }

    @Override
    public List<Habilidades> verHabilidades() {
        return habRepo.findAll();
    }

    @Override
    public void nuevaSubHab(SubHabilidades subhab) {
        shabRepo.save(subhab);
    }

    @Override
    public void editarSubHab(SubHabilidades subhab) {
        shabRepo.save(subhab);
    }

    @Override
    public void eliminarSubHab(int id) {
        shabRepo.deleteById(id);
    }

    @Override
    public SubHabilidades verSubHabilidad(int id) {
        return shabRepo.findById(id);
    }

    @Override
    public List<SubHabilidades> verSubHabilidades() {
        return shabRepo.findAll();
    }
    
}
