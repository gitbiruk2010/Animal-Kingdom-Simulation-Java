// Define the Dog class, which extends the Animal class
public class Dog extends Animal {
    // Constructor to initialize a Dog object with name and age
    public Dog(String name, int age) {
        super(name, age);
    }

    // Overriding the makeSound method to define the specific sound for a Dog
    @Override
    public void makeSound() {
        if (age < 1) {
            System.out.println(name + " is too young to bark.");
        } else {
            System.out.println(name + " says: Woof!");
        }
    }

    // Dog-specific behavior: fetch
    public void fetch() {
        if (age < 1) {
            System.out.println(name + " is too young to fetch.");
        } else {
            System.out.println(name + " is fetching the ball.");
        }
    }
}
