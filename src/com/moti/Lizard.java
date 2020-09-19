package com.moti;

public class Lizard extends Reptile {
    protected Lizard(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public String toString() {
        return String.format("Lizard named %s, %d years old, in color %s", _name, _age, _color);
    }

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
        Lizard l = (Lizard)other;

        return _name.equals(l._name) && _color.equals(l._color) && _age == l._age;
    }

    @Override
    public Animal clone() {
        return new Lizard(_name.toString(), _color.toString(), _age);
    }
}
