package refactoring.nullobjectpattern;

/**
 * Created by twer on 3/23/14.
 */
public class Pineapple {
    private String color;
    private String height;

    public Pineapple(String color, String height) {
        this.color = color;
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public String getHeight() {
        return height;
    }
}
