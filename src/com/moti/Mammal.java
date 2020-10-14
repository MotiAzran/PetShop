package com.moti;

/**
 * Represent a mammal
 */
public abstract class Mammal extends Animal {
    /**
     * Initialize the mammal
     * @param name the mammal name
     * @param color the mammal color
     * @param age the mammal age
     */
    protected Mammal(String name, String color, int age) {
        super(name, color, age);
    }

    /**
     * Get mammal string representation
     * @return string representation of the mammel
     */
    @Override
    abstract public String toString();

    /**
     * Checks if the mammal is equal the other mammal
     * @param other the other mammal to compare
     * @return true if the mammals are the same, otherwise false
     */
    @Override
    abstract public boolean equals(Object other);

    /**
     * Make noise with the mammal
     */
    public abstract void noise();

    /**
     * Feed the mammal
     */
    @Override
    public void eat() {
        System.out.println(_name + " suckling");
    }

    /**
     * Put the mammal to sleep
     */
    @Override
    public void sleep() {
        System.out.println("Zzz");
    }
}
