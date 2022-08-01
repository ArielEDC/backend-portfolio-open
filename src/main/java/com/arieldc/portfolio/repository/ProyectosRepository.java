
package com.arieldc.portfolio.repository;

import com.arieldc.portfolio.model.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectosRepository extends JpaRepository<Proyectos, Integer>{
    
    public Proyectos findById(int id);
}
