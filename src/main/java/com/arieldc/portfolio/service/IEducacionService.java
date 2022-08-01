
package com.arieldc.portfolio.service;

import com.arieldc.portfolio.model.Educacion;
import java.util.List;


public interface IEducacionService {
        
    public void nuevaEdu(Educacion edu);
    public void editarEdu(Educacion edu);
    public void eliminarEdu(int id);
    public Educacion verEdu(int id);
    public List<Educacion>verEdus();
}
