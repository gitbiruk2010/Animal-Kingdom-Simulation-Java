// Main class to execute the Animal kingdom simulation
// This class tests the functionality of all the Animal subclasses (Dog, Cat, Bird).

public class AnimalKingdomSimulation {
    public static void main(String[] args) {
        // ===========================================
        // Normal Test Cases: Testing with typical animals
        // ===========================================

        // Create an array to hold normal animals (Dog, Cat, Bird)
        Animal[] animals = new Animal[3];

        // Instantiate Dog, Cat, and Bird objects with sample data and add them to the array
        animals[0] = new Dog("Bobby", 5);   // Dog named Bobby, age 5
        animals[1] = new Cat("Milo", 3);    // Cat named Milo, age 3
        animals[2] = new Bird("Ruth", 2);   // Bird named Ruth, age 2

        // Loop through the array and call common methods (eat, sleep, makeSound)
        // Also, call the specific method for each animal type (fetch, scratch, fly)
        System.out.println("### Normal Test Cases ###\n");
        for (Animal animal : animals) {
            animal.displayInfo();  // Display animal info (name and age)
            animal.eat();          // Call the general eat method
            animal.sleep();        // Call the general sleep method
            animal.makeSound();    // Call the specific sound method

            // Use switch-case to invoke the animal-specific behavior
            switch (animal) {
                case Dog dog -> dog.fetch();    // Call dog-specific behavior (fetch)
                case Cat cat -> cat.scratch();  // Call cat-specific behavior (scratch)
                case Bird bird -> bird.fly();   // Call bird-specific behavior (fly)
                default -> {
                    // This case should not be reached, as the animal should match one of the types
                }
            }

            System.out.println(); // Blank line for readability between animals
        }

        // ===========================================
        // Edge Test Cases: Testing with unusual or boundary cases
        // ===========================================

        // Create an array to hold edge test cases (young and older animals)
        Animal[] edgeTestCases = new Animal[3];

        // Test case 1: A young dog with age 1
        edgeTestCases[0] = new Dog("Roger", 0);   // Dog named Roger, age 1

        // Test case 2: A newborn cat with age 0
        edgeTestCases[1] = new Cat("Leah", 0);    // Cat named Leah, age 0

        // Test case 3: An older bird with age 10
        edgeTestCases[2] = new Bird("Blue", 0);  // Bird named Blue, age 10

        // Loop through edge test cases to see how the program handles different ages
        System.out.println("### Edge Test Cases ###\n");
        for (Animal animal : edgeTestCases) {
            animal.displayInfo();  // Display info for edge test animals
            animal.eat();          // Call eat method
            animal.sleep();        // Call sleep method
            animal.makeSound();    // Call the specific sound method for each animal
            if (animal instanceof Bird) {
                ((Bird) animal).fly(); // Ensures the fly() method for Bird is called
            }
            System.out.println();  // Blank line for readability between test cases
        }
    }
}
