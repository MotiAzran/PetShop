/**
 * Animal abstract class, represent a general animal
 * It's name, color and age
 */
public abstract class Animal implements Cloneable {
    protected String name;
    protected String color;
    protected int age;

    /**
     * Initialize the object
     * @param name the animal name
     * @param color the animal color
     * @param age the animal age
     */
    protected Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    /**
     * Feed the animal
     */
    abstract public void eat();

    /**
     * Put the animal to sleep
     */
    abstract public void sleep();

    /**
     * Get animal string representation
     * @return string representation of the animal
     */
    @Override
    public String toString() {
        return String.format("Name: %s, Age: %d, Color: %s", name, age, color);
    }

    /**
     * Checks if the animal is the same as other
     * @param other the other animal to compare
     * @return true if the animals are the same, otherwise false
     */
    @Override
    public boolean equals(Object other) {
        if (other == this) {
            // The same instance passed as parameter
            return true;
        } else if (null == other) {
            return false;
        }

        if (!(other instanceof Animal)) {
            // The object is not a Dog
            return false;
        }

        Animal animal = (Animal) other;

        return name.equals(animal.name) && age == animal.age && color.equals(animal.color);
    }

    /**
     * Clone the animal
     * @return new cloned animal
     * @throws CloneNotSupportedException
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        Animal clonedAnimal = (Animal) super.clone();

        clonedAnimal.name = this.name;
        clonedAnimal.color = this.color;
        clonedAnimal.age = this.age;

        return clonedAnimal;
    }

    /**
     * Get the animal name
     * @return the animal name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the animal name
     * @param name the animal new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the animal color
     * @return the animal color
     */
    public String getColor() {
        return color;
    }

    /**
     * Set the animal color
     * @param color the animal new color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Get the animal age
     * @return the animal age
     */
    public int getAge() {
        return age;
    }

    /**
     * Set the animal age
     * @param age the animal new age
     */
    public void setAge(int age) {
        this.age = age;
    }
}
