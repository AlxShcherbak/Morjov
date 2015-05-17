package functions.godex;

/**
 * Created by godex on 24.03.2015.
 */
public class Trio {

    private Double val;
    private Double pos1;
    private Double pos2;

    public Trio(Double posX, Double posY, Double aVal) {
        val = aVal;
        pos1 = posX;
        pos2 = posY;
    }

    public Trio(Integer posX, Integer posY, Integer aVal) {
        val = (double) aVal;
        pos1 = (double) posX;
        pos2 = (double) posY;
    }

    public Double value() {
        return val;
    }

    public Double posX() {
        return pos1;
    }

    public Double posY() {
        return pos2;
    }

    @Override
    public String toString() {
        return "X="+pos1+" Y="+pos2+" val="+val;
    }
}
