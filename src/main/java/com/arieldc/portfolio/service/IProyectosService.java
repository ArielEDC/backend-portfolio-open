
package com.arieldc.portfolio.service;

import com.arieldc.portfolio.model.Proyectos;
import java.util.List;


public interface IProyectosService {
    
    
    public void nuevoProy(Proyectos proy);
    public void editarProy(Proyectos proy);
    public void eliminarProy(int id);
    public Proyectos verProy(int id);
    public List<Proyectos>verProyectos();
}
