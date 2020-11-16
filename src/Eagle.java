/**
 * Represent an eagle
 */
public class Eagle extends Poultry {

    /**
     * Initialize the eagle
     * @param name the eagle name
     * @param color the eagle color
     * @param age the eagle age
     */
    public Eagle(String name, String color, int age) {
        super(name, color, age);
    }

    public void glide() {
        System.out.println(name + " gliding");
    }

    @Override
    public boolean equals(Object other) {
        return super.equals(other) && (other instanceof Eagle);
    }
}
