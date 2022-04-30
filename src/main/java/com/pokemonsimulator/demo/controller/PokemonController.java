package com.pokemonsimulator.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PokemonController {
    
    @GetMapping("/admin/addpokemon")
    public String addPokemon(){
        return "addpokemon";
    }

}
