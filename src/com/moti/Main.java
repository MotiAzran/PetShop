package com.moti;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        // b.
        ArrayList<Animal> pets = new ArrayList<>();

        pets.add(new Dog("Rexi", "Black", 12, new Owner("Moti", "0521111111")));
        pets.add(new Dog("Boni", "Brown", 7, new Owner("Moti", "0521111111")));
        pets.add(new Lizard("Liz", "Green", 5));
        pets.add(new Dog("Tyson", "Gold", 1, new Owner("Moti", "0521111111")));
        pets.add(new Eagle("Igy", "Grey", 3));

        for (Animal pet : pets) {
            System.out.println("%s turn\n", pet.get_name());
            System.out.printf("Details: %s\n", pet);

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

        System.out.println();

        d1 = new Dog("Rexi", "Black", 12, new Owner("Moti", "0521111111"));
        d2 = (Dog)d1.clone();

        System.out.println(d1);
        System.out.println(d2);

        System.out.println();

        d2.get_owner().set_name("Shoval");
        d2.get_owner().set_phone("05222222222");

        System.out.println(d1);
        System.out.println(d2);
    }
}
