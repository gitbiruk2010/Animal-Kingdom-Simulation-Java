// Define the Bird class, which extends the Animal class
public class Bird extends Animal {
    // Constructor to initialize a Bird object with a name and age
    public Bird(String name, int age) {
        super(name, age);
    }

    // Overriding the makeSound method to define the specific sound for a Bird
    @Override
    public void makeSound() {
        System.out.println(name + " says: Chirp!");
    }

    // Bird-specific behavior: fly
    public void fly() {
        // If the bird is too young (under 1 year), it can't fly
        if (age < 1) {
            System.out.println(name + " is too young to fly.");
        }
        // If the bird is older than 9 years, it flies slowly
        else if (age > 9) {
            System.out.println(name + " is flying slowly due to old age.");
        }
        // Otherwise, it flies normally
        else {
            System.out.println(name + " is flying.");
        }
    }
}
