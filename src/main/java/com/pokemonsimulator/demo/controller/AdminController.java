package com.pokemonsimulator.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
    
    @GetMapping("/admin")
    public String admin() {
        return "/admin";
    }

    @GetMapping("/admin/pokemonlist")
    public String pokemonList(){
        return "pokemon-home-page";
    }
}
