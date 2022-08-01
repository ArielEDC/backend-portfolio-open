
package com.arieldc.portfolio.repository;

import com.arieldc.portfolio.model.SubHabilidades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubHabilidadesRepository extends JpaRepository<SubHabilidades, Integer>{
    public SubHabilidades findById(int id);
}
