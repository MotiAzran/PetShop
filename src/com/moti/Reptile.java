package com.moti;

public abstract class Reptile implements Animal {
    protected String _name;
    protected String _color;
    protected int _age;

    protected Reptile(String name, String color, int age) {
        _name = name;
        _color = color;
        _age = age;
    }

    @Override
    abstract public String toString();

    @Override
    abstract public boolean equals(Object other);

    @Override
    abstract public Animal clone();

    public void crawl() {
        System.out.println(_name + " crawling");
    }

    @Override
    public void eat() {
        System.out.println(_name + " eating");
    }

    @Override
    public void sleep() {
        System.out.println(_name + " sleeping");
    }

    public String get_name() {
        return _name;
    }

    public String get_color() {
        return _color;
    }

    public int get_age() {
        return _age;
    }

    public void set_name(String name) {
        _name = name;
    }

    public void set_color(String color) {
        _color = color;
    }

    public void set_age(int age) {
        _age = age;
    }
}
