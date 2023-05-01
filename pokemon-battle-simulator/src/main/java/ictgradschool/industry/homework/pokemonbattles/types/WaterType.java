package ictgradschool.industry.homework.pokemonbattles.types;

public class WaterType implements IType {
    @Override
    public String getName() {
        return "Water";
    }

    @Override
    public boolean isSuperEffectiveAgainst(IType other) {
        return other.getName().equals("Fire");
    }

    @Override
    public boolean isNotVeryEffectiveAgainst(IType other) {
        return other.getName().equals("Grass");
    }
}
