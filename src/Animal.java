// Base class for all animals. Provides basic properties and behavior for animals.
public abstract class Animal {
    // Properties: name and age of the animal
    protected String name;
    protected int age;

    // Constructor to initialize name and age
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // General behavior for eating
    public void eat() {
        System.out.println(name + " is eating.");
    }

    // General behavior for sleeping
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    // Abstract method for making sound, which will be implemented in each subclass
    public abstract void makeSound();

    // Display basic information about the animal (name and age)
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
