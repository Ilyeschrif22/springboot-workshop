package com.spring_jpa_keywords.config;

import com.spring_jpa_keywords.entities.Projet;
import com.spring_jpa_keywords.repository.ProjetRepository;
import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseInitializer {

    @Bean
    CommandLineRunner initDatabase(ProjetRepository projetRepository) {
        return args -> {
            if (projetRepository.count() == 0) {
                Faker faker = new Faker();
                for (int i = 0; i < 100; i++) {
                    Projet p = new Projet();
                    p.setNom(faker.app().name());
                    p.setCode("PRJ-" + faker.number().digits(5));
                    projetRepository.save(p);
                }
            }
        };
    }
}
