package ictgradschool.industry.homework.pokemonbattles.types;

public class FireType implements IType {
    @Override
    public String getName() {
        return "Fire";
    }

    @Override
    public boolean isSuperEffectiveAgainst(IType other) {
        return (other.getName().equals("Grass"));
    }
    public boolean isNotVeryEffectiveAgainst(IType other) {
        return other.getName().equals("Water");
    }
}
