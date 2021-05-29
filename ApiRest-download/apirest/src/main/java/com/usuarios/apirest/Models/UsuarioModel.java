package com.usuarios.apirest.Models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuarios_api")
public class UsuarioModel implements Serializable{

    /**
     *
     */
    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name_completed;

    private String password;

    private String confirmPassUser;

    private String nameUser;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName_completed() {
        return name_completed;
    }

    public void setName_completed(String name_completed) {
        this.name_completed = name_completed;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassUser() {
        return confirmPassUser;
    }

    public void setConfirmPassUser(String confirmPassUser) {
        this.confirmPassUser = confirmPassUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

  
    

}
    
