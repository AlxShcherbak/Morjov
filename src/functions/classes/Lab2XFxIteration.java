package functions.classes;

import javafx.scene.control.TextField;

/**
 * Created by Alx Shcherbak on 22.03.2015.
 */
public class Lab2XFxIteration {
    private double x;
    private double fX;
    private long iteration;

    public Lab2XFxIteration(double x, double fX, long iteration) {
        this.x = x;
        this.fX = fX;
        this.iteration = iteration;
    }

    public void iterationDo() {
        this.iteration++;
    }

    public void printInForm(TextField outputX, TextField outputFX, TextField outputIteration) {
        outputX.setText(String.valueOf(this.x));
        outputFX.setText(String.valueOf(this.fX));
        outputIteration.setText(String.valueOf(this.iteration));
    }

    @Override
    public String toString() {
        return "Lab2XFxIteration{" +
                "x=" + x +
                ", fX=" + fX +
                ", iteration=" + iteration +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Lab2XFxIteration that = (Lab2XFxIteration) o;

        if (Double.compare(that.fX, fX) != 0) return false;
        if (iteration != that.iteration) return false;
        if (Double.compare(that.x, x) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(x);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(fX);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) (iteration ^ (iteration >>> 32));
        return result;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getfX() {
        return fX;
    }

    public void setfX(double fX) {
        this.fX = fX;
    }

    public long getIteration() {
        return iteration;
    }

    public void setIteration(long iteration) {
        this.iteration = iteration;
    }
}
