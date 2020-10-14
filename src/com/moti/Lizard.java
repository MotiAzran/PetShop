package com.moti;

/**
 * Represent a lizard
 */
public class Lizard extends Reptile {

    /**
     * Initialize the lizard
     * @param name the lizard name
     * @param color the lizard color
     * @param age the lizard age
     */
    protected Lizard(String name, String color, int age) {
        super(name, color, age);
    }

    /**
     * Get lizard string representation
     * @return string representation of the lizard
     */
    @Override
    public String toString() {
        return String.format("Lizard named %s, %d years old, in color %s", _name, _age, _color);
    }

    /**
     * Checks if two lizards are the same
     * @param other the other lizard to compare
     * @return true if the lizards are the same, otherwise false
     */
    @Override
    public boolean equals(Object other) {
        if (other == this) {
            // The same instance passed as parameter
            return true;
        }

        if (!(other instanceof Lizard)) {
            // The object is not a Lizard
            return false;
        }

        // The object is a lizard, and a different instance
        Lizard lizard = (Lizard)other;

        return _name.equals(lizard._name) && _color.equals(lizard._color) && _age == lizard._age;
    }
}
