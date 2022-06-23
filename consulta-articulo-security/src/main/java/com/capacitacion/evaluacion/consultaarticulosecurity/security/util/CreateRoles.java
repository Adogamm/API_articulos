package com.capacitacion.evaluacion.consultaarticulosecurity.security.util;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.capacitacion.evaluacion.consultaarticulosecurity.security.entity.Rol;
import com.capacitacion.evaluacion.consultaarticulosecurity.security.enums.RolNombre;
import com.capacitacion.evaluacion.consultaarticulosecurity.security.service.RolService;

@Component
public class CreateRoles implements CommandLineRunner {

    @Autowired
    RolService rolService;

    @Override
    public void run(String... args) throws Exception {
        Rol rolAdmin = new Rol(RolNombre.ROLE_ADMIN);
        Rol rolUser = new Rol(RolNombre.ROLE_USER);
        Optional<Rol> radm = rolService.getByRolNombre(RolNombre.ROLE_ADMIN);
        Optional<Rol> ruse = rolService.getByRolNombre(RolNombre.ROLE_USER);

        if(radm.isPresent()) {
        	System.out.println("Ya esta registrado el rol de admin");
        }else {
        	rolService.save(rolAdmin);
        }
        if(ruse.isPresent()) {
        	System.out.println("Ya esta registrado el rol de user");
        }else {
        	rolService.save(rolUser);
        }
    }
}
