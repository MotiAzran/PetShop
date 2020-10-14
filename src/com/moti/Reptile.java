package com.moti;

/**
 * Represent a reptile
 */
public abstract class Reptile extends Animal {

    /**
     * Initialize the reptile
     * @param name the reptile name
     * @param color the reptile color
     * @param age the reptile age
     */
    protected Reptile(String name, String color, int age) {
        super(name, color, age);
    }

    /**
     * Get string representation of the reptile
     * @return string representation of the reptile
     */
    @Override
    abstract public String toString();

    /**
     * Checks if the reptile is equal the other reptile
     * @param other the other reptile to compare
     * @return true if the reptiles are the same, otherwise false
     */
    @Override
    abstract public boolean equals(Object other);

    /**
     * The reptile crawling
     */
    public void crawl() {
        System.out.println(_name + " crawling");
    }

    /**
     * Feed the reptile
     */
    @Override
    public void eat() {
        System.out.println(_name + " chewing");
    }

    /**
     * Put the reptile to sleep
     */
    @Override
    public void sleep() {
        System.out.println(_name + " sleeping");
    }
}
