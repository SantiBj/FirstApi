package com.FirstApi.web.controllers;

import com.FirstApi.web.dtos.share.LibroDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "api/")
public class LibroController {

    @GetMapping("{id}")
    public String getBook(@PathVariable Integer id){
        System.out.println(id);
        return "Hello World";
    }
}
