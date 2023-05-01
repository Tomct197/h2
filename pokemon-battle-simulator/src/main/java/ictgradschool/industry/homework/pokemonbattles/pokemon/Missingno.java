package ictgradschool.industry.homework.pokemonbattles.pokemon;

import ictgradschool.industry.homework.pokemonbattles.types.GrassType;
import ictgradschool.industry.homework.pokemonbattles.types.NormalType;

public class Missingno extends Pokemon {


    public Missingno(String nickname, boolean isShiny) {
        super("Missingno", nickname, isShiny, new NormalType());
    }
    @Override
    public void attack(Pokemon defender) {
        System.out.println(defender.getNickname() + " got a glitch and fainted!");
    }
}