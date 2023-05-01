package ictgradschool.industry.homework.pokemonbattles.pokemon;

import ictgradschool.industry.homework.pokemonbattles.types.IType;

public abstract class Pokemon {
    private String speciesName;
    private String nickname;
    private boolean isShiny;
    private IType type;

    public Pokemon(String speciesName, String nickname, boolean isShiny, IType type) {
        this.speciesName = speciesName;
        this.nickname = nickname;
        this.isShiny = isShiny;
        this.type = type;
    }
    public void attack(Pokemon defender) {
        System.out.printf("%s attacked %s!\n", this, defender);

        IType attackerType = this.getType();
        IType defenderType = defender.getType();

        if (attackerType.isSuperEffectiveAgainst(defenderType)) {
            System.out.println("It's super effective!");
        } else if (attackerType.isNotVeryEffectiveAgainst(defenderType)) {
            System.out.println("It's not very effective...");
        }
    }
    public String getSpeciesName() {
        return speciesName;
    }

    public String getNickname() {
        return nickname;
    }

    public boolean isShiny() {
        return isShiny;
    }

    public IType getType() {
        return type;
    }

    @Override
    public String toString() {
        if (isShiny) {
            return String.format("**%s** (%s)", nickname, speciesName);
        } else {
            return String.format("%s (%s)", nickname, speciesName);
        }
    }
}

