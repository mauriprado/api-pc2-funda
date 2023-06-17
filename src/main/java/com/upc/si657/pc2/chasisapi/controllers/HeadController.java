package com.upc.si657.pc2.chasisapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("head")
public class HeadController {
    @GetMapping
    public String head() {
        return "Servicio disponible.";
    }
}
