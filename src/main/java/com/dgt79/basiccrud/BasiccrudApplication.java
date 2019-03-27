package com.dgt79.basiccrud;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.Instant;
import java.util.stream.Stream;

@SpringBootApplication
public class BasiccrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasiccrudApplication.class, args);
    }


    @Bean
    ApplicationRunner init(ADomainRepository repository) {
        return args -> {
            Stream.of("Ferrari", "Jaguar")
                    .forEach(ref -> {
                        repository.save(new ADomain(null, Instant.now(), ref, 1));
                    });
            repository.findAll().forEach(System.out::println);
        };
    }
}
