package com.moti;

/**
 * Represent a poultry
 */
public abstract class Poultry extends Animal {

    /**
     * Initialize the poultry
     * @param name the poultry name
     * @param color the poultry color
     * @param age the poultry age
     */
    protected Poultry(String name, String color, int age) {
        super(name, color, age);
    }

    /**
     * Get string representation of the poultry
     * @return string representation of the poultry
     */
    @Override
    abstract public String toString();

    /**
     * Checks if the poultry is equal the other poultry
     * @param other the other poultry to compare
     * @return true if the poultices are the same, otherwise false
     */
    @Override
    abstract public boolean equals(Object other);

    public void fly() {
        System.out.println(_name + " flying");
    }

    /**
     * Feed the poultry
     */
    @Override
    public void eat() {
        System.out.println(_name + " eating");
    }

    /**
     * Put the poultry to sleep
     */
    @Override
    public void sleep() {
        System.out.println(_name + " resting");
    }
}
