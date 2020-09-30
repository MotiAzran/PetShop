package com.moti;

public abstract class Animal implements Cloneable {
    protected String _name;
    protected String _color;
    protected int _age;

    protected Animal(String name, String color, int age) {
        _name = name;
        _color = color;
        _age = age;
    }

    abstract public void eat();
    abstract public void sleep();

    @Override
    abstract public boolean equals(Object other);

    @Override
    public Object clone() throws CloneNotSupportedException {
        Animal a = (Animal) super.clone();

        a._name = _name;
        a._color = _color;
        a._age = _age;

        return a;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String name) {
        _name = name;
    }

    public String get_color() {
        return _color;
    }

    public void set_color(String color) {
        _color = color;
    }

    public int get_age() {
        return _age;
    }

    public void set_age(int age) {
        _age = age;
    }
}
