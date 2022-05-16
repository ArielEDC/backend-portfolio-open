
package com.arieldc.portfolio.service;

import com.arieldc.portfolio.model.Habilidades;
import com.arieldc.portfolio.model.SubHabilidades;
import java.util.List;


public interface IHabilidadesService {
    
    public void nuevaHab(Habilidades hab);
    public void editarHab(Habilidades hab);
    public void eliminarHab(int id);
    public Habilidades verHabilidad(int id);
    public List<Habilidades>verHabilidades();
    
    public void nuevaSubHab(SubHabilidades subhab);
    public void editarSubHab(SubHabilidades hab);
    public void eliminarSubHab(int id);
    public SubHabilidades verSubHabilidad(int id);
    public List<SubHabilidades>verSubHabilidades();
    
}
