package com.pascob.ms3;

import com.pascob.ms3.entities.Author;
import com.pascob.ms3.repositories.AuthorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Ms3Application {

    public static void main(String[] args) {
        SpringApplication.run(Ms3Application.class, args);
    }

    @Bean
    public CommandLineRunner initAuthor(AuthorRepository authorRepository){
        return args -> {
            authorRepository.saveAll(
                    List.of(
                            new Author("KABORE", "Pascal", "pascob.pk@gmail.com"),
                            new Author("EZA", "Boto", "ezaboto@gmail.com"),
                            new Author("BA", "Mariama", "mariamaba@gmail.com")
                    )
            );
        };
    }

}
