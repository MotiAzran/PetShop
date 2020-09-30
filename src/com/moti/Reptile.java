package com.moti;

public abstract class Reptile extends Animal {

    protected Reptile(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    abstract public String toString();

    @Override
    abstract public boolean equals(Object other);

    public void crawl() {
        System.out.println(_name + " crawling");
    }

    @Override
    public void eat() {
        System.out.println(_name + " chewing");
    }

    @Override
    public void sleep() {
        System.out.println(_name + " sleeping");
    }
}
