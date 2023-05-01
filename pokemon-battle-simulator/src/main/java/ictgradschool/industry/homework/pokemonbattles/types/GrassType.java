package ictgradschool.industry.homework.pokemonbattles.types;

public class GrassType implements IType {
    @Override
    public String getName() {
        return "Grass";
    }

    @Override
    public boolean isSuperEffectiveAgainst(IType other) {
        return other.getName().equals("Water");
    }

    @Override
    public boolean isNotVeryEffectiveAgainst(IType other) {
        return other.getName().equals("Fire");
    }
}
