package com.pokemonsimulator.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="pokemon_data")
public class Pokemon {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long pokemonId;

    @Column(name="pokedex_number")
    private int pokedexNumber;
    @Column(name="pokemon_name")
    private String pokemonName;
    private String type1, type2;
    private String Abilities;//list na lang ba to?
    private int baseHp, baseAtk, baseDef, baseSpAtk, baseSpDef, baseSpeed;
    private String imageName;

}
