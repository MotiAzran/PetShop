package com.moti;

/**
 * Represent an eagle
 */
public class Eagle extends Poultry {

    /**
     * Initialize the eagle
     * @param name the eagle name
     * @param color the eagle color
     * @param age the eagle age
     */
    public Eagle(String name, String color, int age) {
        super(name, color, age);
    }

    /**
     * Get eagle string representation
     * @return string representation of the eagle
     */
    @Override
    public String toString() {
        return String.format("Eagle named %s, %d years old, in color %s", _name, _age, _color);
    }

    /**
     * Checks if two eagles are the same
     * @param other the other eagle to compare
     * @return true if the eagles are the same, otherwise false
     */
    @Override
    public boolean equals(Object other) {
        if (other == this) {
            // The same instance passed as parameter
            return true;
        }

        if (!(other instanceof Eagle)) {
            // The object is not an Eagle
            return false;
        }

        // The object is an eagle, and a different instance
        Eagle eagle = (Eagle)other;

        return _name.equals(eagle._name) && _color.equals(eagle._color) && _age == eagle._age;
    }
}
