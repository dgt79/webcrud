package com.dgt79.basiccrud;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ADomainController {
    private ADomainRepository repository;

    public ADomainController(ADomainRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/cars")
    public Collection<ADomain> domains() {
        return repository.findAll();
    }
}
