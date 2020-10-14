package com.moti;

/**
 * Animal abstract class, represent a general animal
 * It's name, color and age
 */
public abstract class Animal implements Cloneable {
    protected String _name;
    protected String _color;
    protected int _age;

    /**
     * Initialize the object
     * @param name the animal name
     * @param color the animal color
     * @param age the animal age
     */
    protected Animal(String name, String color, int age) {
        _name = name;
        _color = color;
        _age = age;
    }

    /**
     * Feed the animal
     */
    abstract public void eat();

    /**
     * Put the animal to sleep
     */
    abstract public void sleep();

    /**
     * Checks if the animal is the same as other
     * @param other the other animal to compare
     * @return true if the animals are the same, otherwise false
     */
    @Override
    abstract public boolean equals(Object other);

    /**
     * Clone the animal
     * @return new cloned animal
     * @throws CloneNotSupportedException
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        Animal clonedAnimal = (Animal) super.clone();

        clonedAnimal._name = _name;
        clonedAnimal._color = _color;
        clonedAnimal._age = _age;

        return clonedAnimal;
    }

    /**
     * Get the animal name
     * @return the animal name
     */
    public String getName() {
        return _name;
    }

    /**
     * Set the animal name
     * @param name the animal new name
     */
    public void setName(String name) {
        _name = name;
    }

    /**
     * Get the animal color
     * @return the animal color
     */
    public String getColor() {
        return _color;
    }

    /**
     * Set the animal color
     * @param color the animal new color
     */
    public void setColor(String color) {
        _color = color;
    }

    /**
     * Get the animal age
     * @return the animal age
     */
    public int getAge() {
        return _age;
    }

    /**
     * Set the animal age
     * @param age the animal new age
     */
    public void setAge(int age) {
        _age = age;
    }
}
