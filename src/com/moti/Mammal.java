package com.moti;

public abstract class Mammal extends Animal {
    protected Mammal(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    abstract public String toString();

    @Override
    abstract public boolean equals(Object other);

    public abstract void noise();

    @Override
    public void eat() {
        System.out.println(_name + " suckling");
    }

    @Override
    public void sleep() {
        System.out.println("Zzz");
    }
}
