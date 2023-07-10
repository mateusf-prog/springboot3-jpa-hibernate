package com.mateus.spring.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mateus.spring.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    
    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Maria", "maria@gmail.com", "858486", "8899");
        return ResponseEntity.ok().body(u);

        // .ok retorna com sucesso, .body o corpo da resposta o usuario u
    }
}

/* controlador Rest que responde no caminho /users */