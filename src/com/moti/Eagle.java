package com.moti;

public class Eagle extends Poultry {
    public Eagle(String name, String color, int age, Owner owner) {
        super(name, color, age, owner);
    }

    @Override
    public String toString() {
        return String.format("Eagle named %s, %d years old, own by %s in color %s", _name, _age, _owner.get_name(), _color);
    }

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
        Eagle e = (Eagle)other;

        return _name.equals(e._name) && _color.equals(e._color) && _age == e._age && _owner.equals(e._owner);
    }

    @Override
    public Animal clone() {
        return new Eagle(_name.toString(), _color.toString(), _age, _owner.clone());
    }
}
