// Define the Cat class, which extends the Animal class
public class Cat extends Animal {
    // Constructor to initialize a Cat object with a name and age
    public Cat(String name, int age) {
        super(name, age);
    }

    // Overriding the makeSound method to define the specific sound for a Cat
    @Override
    public void makeSound() {
        if (age == 0) {
            System.out.println(name + " is too young to meow.");
        } else {
            System.out.println(name + " says: Meow!");
        }
    }

    // Cat-specific behavior: scratch
    public void scratch() {
        if (age < 1) {
            System.out.println(name + " is too young to scratch.");
        } else {
            System.out.println(name + " is scratching.");
        }
    }
}
