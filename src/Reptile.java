/**
 * Represent a reptile
 */
public abstract class Reptile extends Animal {
    /**
     * Initialize the reptile
     * @param name the reptile name
     * @param color the reptile color
     * @param age the reptile age
     */
    protected Reptile(String name, String color, int age) {
        super(name, color, age);
    }

    /**
     * The reptile crawling
     */
    public void crawl() {
        System.out.println(name + " crawling");
    }

    /**
     * Feed the reptile
     */
    @Override
    public void eat() {
        System.out.println(name + " chewing");
    }

    /**
     * Put the reptile to sleep
     */
    @Override
    public void sleep() {
        System.out.println(name + " sleeping");
    }
}
