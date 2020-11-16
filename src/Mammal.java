/**
 * Represent a mammal
 */
public abstract class Mammal extends Animal {
    /**
     * Initialize the mammal
     * @param name the mammal name
     * @param color the mammal color
     * @param age the mammal age
     */
    protected Mammal(String name, String color, int age) {
        super(name, color, age);
    }

    /**
     * Make noise with the mammal
     */
    public abstract void noise();

    /**
     * Feed the mammal
     */
    @Override
    public void eat() {
        System.out.println(name + " suckling");
    }

    /**
     * Put the mammal to sleep
     */
    @Override
    public void sleep() {
        System.out.println("Zzz");
    }
}
