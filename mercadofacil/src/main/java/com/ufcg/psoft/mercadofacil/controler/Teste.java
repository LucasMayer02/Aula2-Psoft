package com.ufcg.psoft.mercadofacil.controler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/exemplo")

public class Teste {

    @GetMapping("/helloworld")
    public ResponseEntity < String > get(){
        return ResponseEntity.ok("Hello World!");
    }

}
