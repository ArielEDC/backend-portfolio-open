
package com.arieldc.portfolio.repository;

import com.arieldc.portfolio.model.ExperienciaLaboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpLabRepository extends JpaRepository<ExperienciaLaboral, Integer>{
    public ExperienciaLaboral findById(int id);
}
