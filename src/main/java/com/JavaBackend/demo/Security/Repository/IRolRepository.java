package com.JavaBackend.demo.Security.Repository;


import com.JavaBackend.demo.Security.Entity.Rol;
import com.JavaBackend.demo.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
