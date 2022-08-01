
package com.arieldc.portfolio.repository;

import com.arieldc.portfolio.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepository extends JpaRepository<Educacion, Integer> {
    public Educacion findById(int id);
}
