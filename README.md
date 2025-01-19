# Animal Kingdom Simulation

## Overview
This is a simple Java program to simulate the behavior of different animals in an animal kingdom. It uses **Object-Oriented Programming (OOP)** concepts such as **inheritance** and **method overriding** to model animals and their behaviors.

The program includes a base class `Animal`, and several subclasses like `Dog`, `Cat`, and `Bird`. Each animal has specific behaviors like barking, meowing, or flying. The program demonstrates the use of these classes with both **normal** and **edge** test cases.

## Features
- **Base class `Animal`** with general methods (`eat`, `sleep`, `makeSound`).
- **Subclasses** for specific animals: `Dog`, `Cat`, and `Bird`.
- Each subclass has its own specific behavior (e.g., `fetch()` for dogs, `scratch()` for cats, and `fly()` for birds).
- **Normal Test Cases**: Animals with normal ages are tested for typical behavior.
- **Edge Test Cases**: Animals with extreme ages are tested, such as very young or very old animals.

## Classes

### `Animal.java`
This is the **base class** that:
- Contains common properties (`name` and `age`) for all animals.
- Has methods like `eat()`, `sleep()`, and an abstract method `makeSound()` to be overridden by subclasses.
- Includes a method `displayInfo()` to display the animal's name and age.

### `Dog.java`
This subclass represents a dog. It:
- Overrides the `makeSound()` method to print "Woof!".
- Has a `fetch()` method to simulate a dog fetching a ball.
- Checks if the dog is too old (over 15 years) to fetch.

### `Cat.java`
This subclass represents a cat. It:
- Overrides the `makeSound()` method to print "Meow!".
- Has a `scratch()` method to simulate a cat scratching.
- Handles cases where the cat is too young to meow or scratch (age 0).

### `Bird.java`
This subclass represents a bird. It:
- Overrides the `makeSound()` method to print "Chirp!".
- Has a `fly()` method to simulate the bird flying.
- If the bird is too young (age 0), it can’t fly.
- Birds older than 9 years fly slowly due to age.

### `AnimalKingdomSimulation.java`
This is the **main class** that:
- Creates instances of `Dog`, `Cat`, and `Bird` with different ages.
- Calls methods like `eat()`, `sleep()`, and `makeSound()`.
- Calls the specific behavior methods (`fetch()`, `scratch()`, `fly()`) depending on the animal type.
- Includes both **normal** and **edge** test cases.

## Running the Program
1. **Clone this repository** or download the source code files.
2. Compile and run the Java classes in the following order:
    - `Animal.java` (base class)
    - `Dog.java`, `Cat.java`, `Bird.java` (subclasses)
    - `AnimalKingdomSimulation.java` (main class)

