package ictgradschool.industry.homework.pokemonbattles;

import ictgradschool.industry.homework.pokemonbattles.pokemon.*;

import java.util.Random;

public class PokemonBattleSimulator {
    /**
     * Runs the program.
     */
    private void start() {
        Pokemon[] pokemon = createPokemonArray();

        simulateMultipleRandomBattles(10, pokemon);
    }

    /**
     * Creates an array of Pokemon to use elsewhere in this program.
     *
     * @return an array of Pokemon
     */
    private Pokemon[] createPokemonArray() {
        Pokemon[] pokemon = new Pokemon[6];
        pokemon[0] = new Charmander("Charla", true);
        pokemon[1] = new Squirtle("Raindrop", false);
        pokemon[2] = new Bulbasaur("Rosebud", false);
        pokemon[3] = new Charmander("**Cinder**", false);
        pokemon[4] = new Squirtle("Splash", true);
        pokemon[5] = new Missingno("**Hax0r**", true);
        return pokemon;
    }


    /**
     * Simulates the given number of random battles with the Pokemon in the given array.
     *
     * @param numBattles the number of battles to simulate
     * @param pokemon    the array of Pokemon from which attackers and defenders should be selected.
     */
    private void simulateMultipleRandomBattles(int numBattles, Pokemon[] pokemon) {
        System.out.println("Simulating " + numBattles + " random battles.");
        for (int i = 1; i <= numBattles; i++) {
            System.out.println("Battle " + i + ":");
            simulateRandomBattle(pokemon);
        }

    }

    /**
     * Simulates a single random battle, by picking two Pokemon at random from the given array, and making
     * one attack the other.
     *
     * @param pokemon the array of Pokemon from which the attacker and defender should be selected.
     */
    private void simulateRandomBattle(Pokemon[] pokemon) {
        Random rand = new Random();
        int attackerIndex = rand.nextInt(pokemon.length);
        int defenderIndex = rand.nextInt(pokemon.length);
        while (attackerIndex == defenderIndex) {
            defenderIndex = rand.nextInt(pokemon.length);
        }
        Pokemon attacker = pokemon[attackerIndex];
        Pokemon defender = pokemon[defenderIndex];
        System.out.println("Battle: " + attacker.toString() + " attacked " + defender.toString());

        attacker.attack(defender);
    }


    /**
     * Program entry point. DO NOT EDIT!
     */
    public static void main(String[] args) {
        new PokemonBattleSimulator().start();
    }
}
