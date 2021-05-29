package com.usuarios.apirest.Repositorys;

import java.util.Optional;

import com.usuarios.apirest.Models.UsuarioModel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {

    Optional<UsuarioModel> findById(String string);

    
     
 } 
