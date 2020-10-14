package com.moti;

/**
 * Represent an animal owner
 */
public class Owner implements Cloneable {
    private String _name;
    private String _phone;

    /**
     * Initialize the owner
     * @param name the owner name
     * @param phone the owner phone number
     */
    public Owner(String name, String phone) {
        _name = name;
        _phone = phone;
    }

    /**
     * Get owner name
     * @return owner name
     */
    public String getName() {
        return _name;
    }

    /**
     * Set owner name
     * @param name the new owner name
     */
    public void setName(String name) {
        _name = name;
    }

    /**
     * Get owner phone number
     * @return owner phone number
     */
    public String getPhone() {
        return _phone;
    }

    /**
     * Set owner phone number
     * @param phone the new owner phone number
     */
    public void setPhone(String phone) {
        _phone = phone;
    }

    /**
     * Checks if the owner is the same as other owner
     * @param other the other owner to compare
     * @return true if the owners are the same, otherwise false
     */
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

        Owner owner = (Owner) other;

        return _name.equals(owner._name) && _phone.equals(owner._phone);
    }

    /**
     * Clone this owner
     * @return new cloned owner
     * @throws CloneNotSupportedException
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        Owner clonedOwner = (Owner) super.clone();

        clonedOwner._name = _name;
        clonedOwner._phone = _phone;

        return clonedOwner;
    }
}
