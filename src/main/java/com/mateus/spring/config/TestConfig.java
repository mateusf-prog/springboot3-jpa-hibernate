package com.mateus.spring.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.mateus.spring.entities.User;

import repositories.UserRepository;

@Configuration      // define que a classe é uma classe de configuração
@Profile("test")    // define que essa classe só vai rodar a configuração quando estiver no perfil test
public class TestConfig implements CommandLineRunner {
    
    @Autowired      // identificar e fornecer automaticamente uma instância do tipo apropriado para ser injetada nesse ponto.
    private UserRepository userRepository;

    @Override   // tudo que for colocado nesse método será executado quando a aplicação for iniciada
    public void run(String... args) throws Exception {

        User u1 = new User(1L, "Mateus", "mateus@gmail.com", "225544", "123456");
        User u2 = new User(2L, "Alex", "Alex@gmail.com", "441122", "654321");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
