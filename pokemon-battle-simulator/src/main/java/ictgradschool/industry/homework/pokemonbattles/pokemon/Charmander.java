package ictgradschool.industry.homework.pokemonbattles.pokemon;

import ictgradschool.industry.homework.pokemonbattles.types.FireType;

public class Charmander extends Pokemon {
    public Charmander(String nickname, boolean isShiny) {
        super("Charmander", nickname, isShiny, new FireType());
    }

    public Charmander(String nickname) {
        this(nickname, false);
    }
}
