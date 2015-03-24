package ua.ho.godex.morjov;

/**
 * Created by godex on 24.03.2015.
 */
public class Trio {

    private Double key;
    private Double value1;
    private Double value2;

    public Trio(Double aKey, Double aValueX, Double aValueY) {
        key = aKey;
        value1 = aValueX;
        value2 = aValueY;
    }

    public Double key() {
        return key;
    }

    public Double valueX() {
        return value1;
    }

    public Double valueY() {
        return value1;
    }
}
