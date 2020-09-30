package com.moti;

public abstract class Poultry extends Animal {

    protected Poultry(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    abstract public String toString();

    @Override
    abstract public boolean equals(Object other);

    public void fly() {
        System.out.println(_name + " flying");
    }

    @Override
    public void eat() {
        System.out.println(_name + " eating");
    }

    @Override
    public void sleep() {
        System.out.println(_name + " resting");
    }
}
