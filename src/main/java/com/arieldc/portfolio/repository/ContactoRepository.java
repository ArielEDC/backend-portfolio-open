
package com.arieldc.portfolio.repository;

import com.arieldc.portfolio.model.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactoRepository extends JpaRepository<Contacto, Integer>{
    public Contacto findById(int id);
}
