/**
 * Represent a poultry
 */
public abstract class Poultry extends Animal {
    /**
     * Initialize the poultry
     * @param name the poultry name
     * @param color the poultry color
     * @param age the poultry age
     */
    protected Poultry(String name, String color, int age) {
        super(name, color, age);
    }

    /**
     * Make the poultry fly
     */
    public void fly() {
        System.out.println(name + " flying");
    }

    /**
     * Make the poultry glide
     */
    public void glide() {
        System.out.println(name + " gliding");
    }

    /**
     * Feed the poultry
     */
    @Override
    public void eat() {
        System.out.println(name + " eating");
    }

    /**
     * Put the poultry to sleep
     */
    @Override
    public void sleep() {
        System.out.println(name + " resting");
    }
}
