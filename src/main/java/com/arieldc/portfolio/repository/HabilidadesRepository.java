
package com.arieldc.portfolio.repository;

import com.arieldc.portfolio.model.Habilidades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabilidadesRepository extends JpaRepository<Habilidades, Integer>{
    public Habilidades findById(int id);
}
