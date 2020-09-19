package com.moti;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // b.
        ArrayList<Animal> pets = new ArrayList<>();

        pets.add(new Dog("Rexi", "Black", 12, new Owner("Moti", "0521111111")));
        pets.add(new Dog("Boni", "Brown", 7, new Owner("Moti", "0521111111")));
        pets.add(new Lizard("Liz", "Green", 5));
        pets.add(new Dog("Tyson", "Grey", 1, new Owner("Moti", "0521111111")));
        pets.add(new Eagle("Igy", "Blue", 3, new Owner("Moti", "0521111111")));

        for (Animal pet : pets) {
            System.out.println(pet.get_name() + " turn");
            System.out.println("Details: " + pet.toString());

            pet.eat();

            if (pet instanceof Mammal) {
                ((Mammal) pet).noise();
            } else if (pet instanceof Poultry) {
                ((Poultry)pet).fly();
            } else if (pet instanceof Reptile) {
                ((Reptile)pet).crawl();
            }

            System.out.println();
        }

        // c.
        Dog d1 = new Dog("Rexi", "Black", 12, new Owner("Moti", "0521111111"));
        Dog d2 = (Dog)d1.clone();

        System.out.println(d1);
        System.out.println(d2);
        
        System.out.println();

        d2.set_owner(new Owner("Shoval", "0522222222"));

        System.out.println(d1);
        System.out.println(d2);
    }
}
