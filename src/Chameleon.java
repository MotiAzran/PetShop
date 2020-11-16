/**
 * Represent a lizard
 */
public class Chameleon extends Reptile {

    /**
     * Initialize the chameleon
     * @param name the chameleon name
     * @param color the chameleon color
     * @param age the chameleon age
     */
    public Chameleon(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public boolean equals(Object other) {
        return super.equals(other) && (other instanceof Chameleon);
    }
}
