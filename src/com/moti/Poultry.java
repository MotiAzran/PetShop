package com.moti;

public abstract class Poultry implements Animal {
    protected String _name;
    protected String _color;
    protected int _age;
    protected Owner _owner;

    protected Poultry(String name, String color, int age, Owner owner) {
        _name = name;
        _color = color;
        _age = age;
        _owner = owner;
    }

    @Override
    abstract public String toString();

    @Override
    abstract public boolean equals(Object other);

    @Override
    abstract public Animal clone();

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

    public String get_name() {
        return _name;
    }

    public String get_color() {
        return _color;
    }

    public int get_age() {
        return _age;
    }

    public Owner get_owner() {
        return _owner;
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

    public void set_owner(Owner owner) {
        _owner = owner;
    }
}
