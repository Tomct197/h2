package ictgradschool.industry.homework.pokemonbattles.pokemon;

import ictgradschool.industry.homework.pokemonbattles.types.GrassType;

public class Bulbasaur extends Pokemon {
    public Bulbasaur(String nickname, boolean isShiny) {
        super("Bob", nickname, isShiny, new GrassType());
    }

    public Bulbasaur(String nickname) {
        this(nickname, false);
    }
}