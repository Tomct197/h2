package ictgradschool.industry.homework.pokemonbattles.pokemon;

import ictgradschool.industry.homework.pokemonbattles.types.WaterType;

public class Squirtle extends Pokemon {
    public Squirtle(String nickname, boolean isShiny) {
        super("Squirtle", nickname, isShiny, new WaterType());
    }

    public Squirtle(String nickname) {
        this(nickname, false);
    }
}
