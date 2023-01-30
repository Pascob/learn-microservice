package com.pascob.ms4;

import com.pascob.ms4.entities.Book;
import com.pascob.ms4.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Ms4Application {

    public static void main(String[] args) {
        SpringApplication.run(Ms4Application.class, args);
    }

    @Bean
    public CommandLineRunner initBook(BookRepository bookRepository){
        return args -> {
            bookRepository.saveAll(
                    List.of(
                            new Book("Les Frasques d'Ebinto", null, 72),
                            new Book("Madame Bovary", null, 300),
                            new Book("Une vie de boy", null, 80)
                    )
            );
        };
    }

}
