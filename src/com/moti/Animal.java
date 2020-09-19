package com.moti;

public interface Animal {
    void eat();
    void sleep();
    String toString();
    boolean equals(Object other);
    Animal clone();

    String get_name();
    String get_color();
    int get_age();

    void set_name(String name);
    void set_color(String color);
    void set_age(int age);
}
