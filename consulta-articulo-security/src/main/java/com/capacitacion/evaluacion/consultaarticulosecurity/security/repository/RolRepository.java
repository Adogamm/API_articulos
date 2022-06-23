package com.capacitacion.evaluacion.consultaarticulosecurity.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capacitacion.evaluacion.consultaarticulosecurity.security.entity.Rol;
import com.capacitacion.evaluacion.consultaarticulosecurity.security.enums.RolNombre;

import java.util.Optional;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {

    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
