package com.moti;

public class Dog extends Mammal {
    public Dog(String name, String color, int age, Owner owner) {
        super(name, color, age, owner);
    }

    @Override
    public String toString() {
        return String.format("Dog named %s, %d years old, own by %s in color %s", _name, _age, _owner.get_name(), _color);
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            // The same instance passed as parameter
            return true;
        }

        if (!(other instanceof Dog)) {
            // The object is not a Dog
            return false;
        }

        // The object is a dog, and a different instance
        Dog d = (Dog)other;

        return _name.equals(d._name) && _color.equals(d._color) && _age == d._age && _owner.equals(d._owner);
    }

    @Override
    public Animal clone() {
        return new Dog(_name.toString(), _color.toString(), _age, _owner.clone());
    }

    @Override
    public void noise() {
        System.out.println(_name + " Barking");
    }
}
