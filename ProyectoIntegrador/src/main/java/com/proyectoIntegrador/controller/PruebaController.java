package com.proyectoIntegrador.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/prueba/v1")
@RequiredArgsConstructor
public class PruebaController {
	
	@PostMapping(value = "demo")
    public String welcome()
    {
        return "Welcome from secure endpoint";
    }
}
