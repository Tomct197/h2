package ictgradschool.industry.homework.pokemonbattles.types;


public class NormalType implements IType{
    public String getName() {
        return "Normal";
    }
    public boolean isSuperEffectiveAgainst(IType type) {
        return false;
    }


    public boolean isNotVeryEffectiveAgainst(IType type) {
        return false;
    }
}

