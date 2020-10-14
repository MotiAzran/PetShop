package com.moti;

/**
 * Represent a dog
 */
public class Dog extends Mammal {
    // The dog owner
    private Owner _owner;

    /**
     * Initialize the dog
     * @param name the dog name
     * @param color the dog color
     * @param age the dog age
     * @param owner the dog owner
     * @throws CloneNotSupportedException
     */
    public Dog(String name, String color, int age, Owner owner) throws CloneNotSupportedException {
        super(name, color, age);

        _owner = (Owner) owner.clone();
    }

    /**
     * Get dog string representation
     * @return string representation of the dog
     */
    @Override
    public String toString() {
        return String.format("Dog named %s, %d years old, in color %s - Owner details: %s - %s",
                _name, _age, _color, _owner.getName(), _owner.getPhone());
    }

    /**
     * Checks if two dogs are the same
     * @param other the other dog to compare
     * @return true if the dogs are the same, otherwise false
     */
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
        Dog dog = (Dog)other;

        return _name.equals(dog._name) && _color.equals(dog._color) && _age == dog._age && _owner.equals(dog._owner);
    }

    /**
     * Clone the dog
     * @return a new cloned dog
     * @throws CloneNotSupportedException
     */
    @Override
    public Object clone()  throws CloneNotSupportedException {
        Dog clonedDog = (Dog) super.clone();

        clonedDog._owner = (Owner) _owner.clone();

        return clonedDog;
    }

    /**
     * The dog is barking
     */
    @Override
    public void noise() {
        System.out.println(_name + " Barking");
    }

    /**
     * Get the dog owner
     * @return the dog owner
     */
    public Owner getOwner() {
        return _owner;
    }

    /**
     * Set the dog owner
     * @param owner the new dog owner
     */
    public void setOwner(Owner owner) {
        _owner = owner;
    }
}
