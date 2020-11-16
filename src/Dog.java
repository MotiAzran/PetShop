/**
 * Represent a dog
 */
public class Dog extends Mammal {
    // The dog owner
    protected Owner owner;

    /**
     * Initialize the dog
     * @param name the dog name
     * @param color the dog color
     * @param age the dog age
     * @param owner the dog owner
     * @throws CloneNotSupportedException
     */
    public Dog(String name, String color, int age, Owner owner) throws CloneNotSupportedException {
        super(name, color, age);

        this.owner = (Owner) owner.clone();
    }

    /**
     * Get dog string representation
     * @return string representation of the dog
     */
    @Override
    public String toString() {
        return String.format("%s, Owner: %s", super.toString(), owner);
    }

    /**
     * Checks if two dogs are the same
     * @param other the other dog to compare
     * @return true if the dogs are the same, otherwise false
     */
    @Override
    public boolean equals(Object other) {
        if (!super.equals(other)) {
            return false;
        }

        if (!(other instanceof Dog)) {
            // The object is not a Dog
            return false;
        }

        // The object is a dog, and a different instance
        Dog dog = (Dog)other;

        // We checked all the other fields at the super function
        return owner.equals(dog.owner);
    }

    /**
     * Clone the dog
     * @return a new cloned dog
     * @throws CloneNotSupportedException
     */
    @Override
    public Object clone()  throws CloneNotSupportedException {
        Dog clonedDog = (Dog) super.clone();

        clonedDog.owner = (Owner) owner.clone();

        return clonedDog;
    }

    /**
     * The dog is barking
     */
    @Override
    public void noise() {
        System.out.println(name + " Barking");
    }

    /**
     * Get the dog owner
     * @return the dog owner
     */
    public Owner getOwner() {
        return owner;
    }

    /**
     * Set the dog owner
     * @param owner the new dog owner
     */
    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
