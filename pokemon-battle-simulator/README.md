# Pokémon Battle Simulator (25 marks)

In this question, we would like to create a simple battle simulator for a Pokémon game. We will do this by appropriately using our knowledge of arrays, classes, and interfaces.

Once parts **Part A** through **Part D** have been complete, the program's output should appear similar to the following (though it is random and will be different each time the program is run):

```text
Simulating 10 random battles.
**Cinder** (Charmander) attacked Charla (Charmander).
Raindrop (Squirtle) attacked **Cinder** (Charmander). It's super effective!
Charla (Charmander) attacked Raindrop (Squirtle). It's not very effective...
Charla (Charmander) attacked Raindrop (Squirtle). It's not very effective...
Charla (Charmander) attacked Rosebud (Bulbasaur). It's super effective!
Rosebud (Bulbasaur) attacked Raindrop (Squirtle). It's super effective!
Raindrop (Squirtle) attacked **Cinder** (Charmander). It's super effective!
Rosebud (Bulbasaur) attacked Raindrop (Squirtle). It's super effective!
Rosebud (Bulbasaur) attacked Charla (Charmander). It's not very effective...
Charla (Charmander) attacked Raindrop (Squirtle). It's not very effective...
```

### Part A: Types (4 marks)

In the game of Pokémon, each Pokémon has one or more types, which determines how strong that monster might be against other Pokémon. We will use different implementations of an *interface* to represent types.

1. Examine the provided `IType` interface, and `FireType` class. Make the `FireType` class implement the `IType` interface. Fire types are super-effective against Grass types - notice how this information is represented in the provided implementation.

2. Add a new method to the `IType` interface, called `isNotVeryEffectiveAgainst()`. This method should take a single `IType` instance as an argument, and should return a `boolean` value.

3. Make the `FireType` class appropriately implement this new method. Fire types are not very effective against Water types.

4. Add two new classes to your program - `GrassType` and `WaterType`. Make each of these implement the `IType` interface, and add all necessary method implementations according to the following requirements:
    - Grass types are super-effective against Water types, and not very effective against Fire types.
    - Water types are super-effective against Fire types, and not very effective against Grass types.

### Part B: Pokémon (5 marks)

There are many species of Pokémon. We will represent different species of Pokémon using different *subclasses* of an abstract `Pokemon` class. All Pokémon have a species name, a nickname, a type, and a *shiny* status.

1. Examine the provided `Pokemon` class. Override the `toString()` method such that it returns the Pokémon's *nickname*, with its *species name* following, in brackets. If the Pokémon is *shiny*, then its nickname should be surrounded with double-asterisks (`**`). For example:
    - If a Pokémon's nickname is "Bob", its species name is "Bulbasaur", and it is non-shiny, then `toString()` should return `"Bob (Bulbasaur)"`.
    - If a Pokémon's nickname is   "Carl", its species name is "Charmander", and it is shiny, then `toString()` should return `"**Carl** (Charmander)"`.

2. Examine the provided `Charmander` class for inspiration. Then, implement two new classes: `Squirtle` and `Bulbasaur`. These classes should be implemented according to the following requirements:
    - Each class should have *two* constructors - one to allow the caller to specify the nickname and shiny status, while the other one should only allow the caller to specify the nickname (and the shiny status should default to `false`).
    - Squirtle is a Water type.
    - Bulbasaur is a Grass type.

### Part C: Attack and defense (5 marks)

We will now add the ability for Pokémon to attack each other. To do this, add a new method called `attack()` to the `Pokemon` class. This method should take a single `Pokemon` as an argument (which represents the defending Pokémon). It doesn't need to return anything (it will simply print values to the console).

The method should be implemented according to the following specifications:

1. A message should be printed stating that the attacker (`this` Pokémon) attacked the defender.

2. If the attacker's type is super-effective or not very effective against the defender's type, the message should additionally state "It's super effective!" or "It's not very effective...", as appropriate.

See the sample output above for further examples.

### Part D: Battle simulator (6 marks)

Now that we've built the class hierarchy for Pokémon and Types, we'll complete the battle simulator itself. Code to complete **Part D** and **Part E** should be implemented in the `PokemonBattleSimulator` class. We will complete the functionality of the program by performing the following steps:

1. Initially, complete the `createPokemonArray()` method. This method should create an array big enough to store at least *four* Pokémon. The method should then populate the array with some Pokémon, and return the array. The Pokémon you add to the array are up to you, as long as you adhere to the following requirements:
    - The array must contain at least one Charmander.
    - The array must contain at least one Squirtle.
    - The array must contain at least one Bulbasaur.
    - At least one Pokémon in the array must be shiny.

2. Complete the `simulateRandomBattle()` method. This method accepts an array of `Pokemon` objects as an argument. It should randomly select two *different* Pokémon from the array - one as the attacker, and one as the defender. The method should then have the attacker attack the defender (by calling the appropriate method with the appropriate arguments).

3. Complete the `simulateMultipleRandomBattles()` method. This method should simulate the given number of random battles, with the given array of Pokémon.

### Part E: Custom Attacks (5 marks)

Once the base program is complete (steps **Part A** through **Part D**), we will extend the program to add an extra species of Pokémon with custom attack behaviour. To do this, perform the following steps:

1. Add a new type, called `NormalType`. The Normal type is neither "super-effective" nor "not very effective" against any other type.

2. Add a new Pokémon, called `Missingno`. Missingno is Normal type, and is *always* shiny. Different Missingno's may still have different nicknames.

3. Missingno's attack behaviour is different than a normal Pokémon's. If Missingno attacks any other Pokémon, regardless of the defenfer's type, a message should be printed of the form "DEFENDER got a glitch and fainted!". See the example output below for further details.

4. Modify the `createPokemonArray()` method to include a `Missingno` instance in the array, in addition to the Pokémon already required for part Part D.

Once question one is complete, the program's output should appear similar to the following (though it is random and will be different each time the program is run):

```text
Simulating 10 random battles.
Charla (Charmander) attacked **Hax0r** (Missingno).
Charla (Charmander) attacked **Cinder** (Charmander).
**Cinder** (Charmander) attacked Raindrop (Squirtle). It's not very effective...
Charla (Charmander) attacked **Hax0r** (Missingno).
Charla (Charmander) attacked Rosebud (Bulbasaur). It's super effective!
Raindrop (Squirtle) attacked **Cinder** (Charmander). It's super effective!
Charla (Charmander) attacked **Cinder** (Charmander).
**Hax0r** (Missingno) attacked Rosebud (Bulbasaur). Rosebud (Bulbasaur) got a glitch and fainted!
**Hax0r** (Missingno) attacked Rosebud (Bulbasaur). Rosebud (Bulbasaur) got a glitch and fainted!
Charla (Charmander) attacked Rosebud (Bulbasaur). It's super effective!
```
