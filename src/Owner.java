/**
 * Represent an animal owner
 */
public class Owner implements Cloneable {
    private String name;
    private String phone;

    /**
     * Initialize the owner
     * @param name the owner name
     * @param phone the owner phone number
     */
    public Owner(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    /**
     * Get owner name
     * @return owner name
     */
    public String getName() {
        return name;
    }

    /**
     * Set owner name
     * @param name the new owner name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get owner phone number
     * @return owner phone number
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Set owner phone number
     * @param phone the new owner phone number
     */
    public void setPhone(String phone) {
        this.phone = phone;
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

        return name.equals(owner.name) && phone.equals(owner.phone);
    }

    /**
     * Clone this owner
     * @return new cloned owner
     * @throws CloneNotSupportedException
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        Owner clonedOwner = (Owner) super.clone();

        clonedOwner.name = name;
        clonedOwner.phone = phone;

        return clonedOwner;
    }

    /**
     * Get string representation of owner
     * @return string representation of owner
     */
    public String toString() {
        return String.format("Name: %s, Phone: %s", name, phone);
    }
}
