package com.moti;

public class Owner {
    private String _name;
    private String _phone;

    public Owner(String name, String phone) {
        _name = name;
        _phone = phone;
    }

    public String get_name() {
        return _name;
    }

    public String get_phone() {
        return _phone;
    }

    public void set_name(String name) {
        _name = name;
    }

    public void set_phone(String phone) {
        _phone = phone;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            // The parameter is same instance
            return true;
        }

        if (!(other instanceof Owner)) {
            // The parameter is not an Owner
            return false;
        }

        Owner o = (Owner)other;

        return _name.equals(o._name) && _phone.equals(o._phone);
    }

    @Override
    public Owner clone() {
        return new Owner(_name.toString(), _phone.toString());
    }
}
