
package com.arieldc.portfolio.service;

import com.arieldc.portfolio.model.ExperienciaLaboral;
import java.util.List;


public interface IExpLabService {
    
    public void nuevaExp(ExperienciaLaboral exp);
    public void editarExp(ExperienciaLaboral exp);
    public void eliminarExp(int id);
    public ExperienciaLaboral verExp(int id);
    public List<ExperienciaLaboral>verExps();
}
