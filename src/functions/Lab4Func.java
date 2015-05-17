package functions;

import functions.classes.LabXFxIteration;

import java.util.HashMap;

/**
 * Created by Alx Shcherbak on 15.05.2015.
 */
public class Lab4Func {

    public LabXFxIteration lagrangePolinomSearchMin(double delta) {
        Lab4Func lop = new Lab4Func();
        return lop.minimumSearch(delta);
    }


    public static void main(String... arg) {
        Lab4Func lop = new Lab4Func();
        //HashMap<Double, Double> lagrange = lop.lagrange();
        double delta = 0.1;
        LabXFxIteration minSet = lop.minimumSearch(delta);
        System.out.println("Minimum - delta = " + delta +
                "\n" + "X = " + minSet.getX() +
                "\n" + "Y = " + minSet.getfX());
    }

    public HashMap<Double, Double> lagrange() {
/*
        double[] x = {0d, 0.125d, 0.25d, 0.375d, 0.5d, 0.625d, 0.75d, 0.875d, 1, 1.5d};
        double[] fX = {9850, 8850, 8070, 8370, 9550, 6330, 5800, 5270, 4750, 4000};
*/

        double[] x = {0d, 0.25d, 0.5d, 0.875d, 1, 1.5d};
        double[] fX = {9850, 8070, 9550, 5270, 4750, 4000};


        HashMap<Double, Double> returnValue = new HashMap<Double, Double>();
        for (double d = 0; d <= 1.55; d += 0.05) {
            returnValue.put(d, fPolinomLagrange(d, x, fX));
        }

        /*for (double d = 0; d <= 1.55; d += 0.05) {
            System.out.println(d + "|" + returnValue.get(d));
        }

        /*for (double d = 0; d <= 1.55; d += 0.1) {
            System.out.print(d + "|");
        }
        System.out.println();
        for (double d = 0; d <= 1.55; d += 0.1) {
            System.out.print(returnValue.get(d) + "|");
        }*/
        return returnValue;
    }

    private double fPolinomLagrange(double arg, double[] x, double[] y) {
        double result = 0;
        for (int i = 0; i < x.length; i++) {
            double k = 1;
            for (int j = 0; j < y.length; j++) {
                if (j != i) {
                    k *= (arg - x[j]) / (x[i] - x[j]);
                }
            }
            result += k * y[i];
        }
        return result;
    }

    private LabXFxIteration minimumSearch(double delta) {
        double[] x = {0d, 0.25d, 0.5d, 0.875d, 1, 1.5d};
        double[] fX = {9850, 8070, 9550, 5270, 4750, 4000};

        double minX = x[0],
                minY = fX[0];

        for (double xS = minX; xS < x[x.length - 1] + 0.05; xS += delta) {
            if (minY > fPolinomLagrange(xS, x, fX)) {
                minX = xS;
                minY = fPolinomLagrange(xS, x, fX);
            }
        }
        return new LabXFxIteration(minX, minY);
    }
}
