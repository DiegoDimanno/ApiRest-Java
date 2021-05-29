package com.usuarios.apirest.Controllers;

import java.util.List;
import java.util.Optional;

import com.usuarios.apirest.Models.UsuarioModel;
import com.usuarios.apirest.Repositorys.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value = "Api Rest Usuarios")
@CrossOrigin(origins = "*")
public class UsuarioController {

    @Autowired
    UsuarioRepository usuarioRepository;

    @GetMapping("/usuarios")
    @ApiOperation(value = "Retorna uma lista de usuarios")
    public List<UsuarioModel> listaUsuario() {
        return usuarioRepository.findAll();
    }

    @GetMapping("/usuario/{id}")
    @ApiOperation(value = "Retorna usuario buscado por Id")
    public Optional<UsuarioModel> ListaUsuarioUnico(@PathVariable(value = "id") Long id) {
        return usuarioRepository.findById(id);
    }

    @PostMapping("/usuario")
    @ApiOperation(value = "Salva um novo usuario")
    public UsuarioModel salvarUsuario(@RequestBody UsuarioModel usuario) {
        return usuarioRepository.save(usuario);
    }

    @DeleteMapping("/usuario")
    @ApiOperation(value = "Deleta usuario")
    public void deletarUsuario(@RequestBody UsuarioModel usuario) {
        usuarioRepository.delete(usuario);
    }

    @PutMapping("/usuario")
    @ApiOperation(value = "Atualiza os dados de um usuario")
    public UsuarioModel atualizarUsuario(@RequestBody UsuarioModel usuario) {
        return usuarioRepository.save(usuario);
    }

}
