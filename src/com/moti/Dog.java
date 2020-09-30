package com.moti;

public class Dog extends Mammal {
    private Owner _owner;

    public Dog(String name, String color, int age, Owner owner) throws CloneNotSupportedException {
        super(name, color, age);

        _owner = (Owner) owner.clone();
    }

    @Override
    public String toString() {
        return String.format("Dog named %s, %d years old, in color %s - Owner details: %s - %s",
                _name, _age, _color, _owner.get_name(), _owner.get_phone());
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
    public Object clone()  throws CloneNotSupportedException {
        Dog d = (Dog) super.clone();

        d._owner = (Owner) _owner.clone();

        return d;
    }

    @Override
    public void noise() {
        System.out.println(_name + " Barking");
    }

    public Owner get_owner() {
        return _owner;
    }

    public void set_owner(Owner owner) throws CloneNotSupportedException {
        _owner = (Owner) owner.clone();
    }
}
