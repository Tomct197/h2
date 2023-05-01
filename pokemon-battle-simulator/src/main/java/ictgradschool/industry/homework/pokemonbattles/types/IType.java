package ictgradschool.industry.homework.pokemonbattles.types;

public interface IType {
    String getName();

    boolean isSuperEffectiveAgainst(IType other);

    boolean isNotVeryEffectiveAgainst(IType other);

}
