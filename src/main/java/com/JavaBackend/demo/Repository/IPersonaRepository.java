package com.JavaBackend.demo.Repository;

import com.JavaBackend.demo.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long>{
    
}
