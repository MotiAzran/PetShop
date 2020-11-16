/*
 * The main file of the program
 */

import java.util.ArrayList;

/**
 * The main class of the program
 */
public class Main {

    /**
     * The function entry point.
     * Initializes pets and print info about them
     *
     * @param args command line arguments
     * @throws CloneNotSupportedException
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        // b.
        ArrayList<Animal> pets = new ArrayList<>();

        // Add pets to the pets list
        pets.add(new Dog("Rexi", "Black", 12, new Owner("Moti", "0521111111")));
        pets.add(new Dog("Boni", "Brown", 7, new Owner("Moti", "0521111111")));
        pets.add(new Chameleon("Liz", "Green", 5));
        pets.add(new Dog("Tyson", "Gold", 1, new Owner("Moti", "0521111111")));
        pets.add(new Eagle("Igy", "Grey", 3));

        for (Animal pet : pets) {
            // Print pet info
            System.out.printf("%s turn\n", pet.getName());
            System.out.printf("Details: %s\n", pet);

            // Feed the pet
            pet.eat();

            // The pet does unique actions
            if (pet instanceof Mammal) {
                ((Mammal) pet).noise();
            } else if (pet instanceof Poultry) {
                ((Poultry)pet).fly();
            } else if (pet instanceof Reptile) {
                ((Reptile)pet).crawl();
            }

            // Put animal to sleep
            pet.sleep();
            System.out.println();
        }

        // c.
        // Create a dog and clone it
        Dog dog1 = new Dog("Rexi", "Black", 12, new Owner("Moti", "0521111111"));
        Dog dog2 = (Dog)dog1.clone();

        // Print dogs information
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println();

        // Set cloned dog owner
        dog2.setOwner(new Owner("Shoval", "0522222222"));

        // Print dogs info
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println();

        // Create dog and clone it
        dog1 = new Dog("Rexi", "Black", 12, new Owner("Moti", "0521111111"));
        dog2 = (Dog)dog1.clone();

        // Print dog information
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println();

        // Set cloned dog owner
        dog2.getOwner().setName("Shoval");
        dog2.getOwner().setPhone("05222222222");

        // Print dog information
        System.out.println(dog1);
        System.out.println(dog2);
    }
}
