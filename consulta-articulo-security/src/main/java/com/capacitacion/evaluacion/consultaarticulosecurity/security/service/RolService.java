package com.capacitacion.evaluacion.consultaarticulosecurity.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capacitacion.evaluacion.consultaarticulosecurity.security.entity.Rol;
import com.capacitacion.evaluacion.consultaarticulosecurity.security.enums.RolNombre;
import com.capacitacion.evaluacion.consultaarticulosecurity.security.repository.RolRepository;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class RolService {

    @Autowired
    RolRepository rolRepository;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return  rolRepository.findByRolNombre(rolNombre);
    }

    public void save(Rol rol){
        rolRepository.save(rol);
    }
}
