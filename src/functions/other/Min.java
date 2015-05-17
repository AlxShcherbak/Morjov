package functions.other;

import java.util.Arrays;
import java.util.Scanner;

public class Min {

    public static int search(double[] array, double arg) {
        int key = Arrays.binarySearch(array, arg);
        if (key >= 0) {
            return key;
        } else {
            return -(key + 1);
        }
    }

    public static void main(String[] args) {

        double[] mass = {0, 0.125, 0.25, 0.375, 0.5, 0.625, 0.75, 0.875, 1, 1.5};
        double[] mass2 = {9850, 8850, 8070, 7370, 6850, 6330, 5800, 5270, 4750, 4000};

        Scanner in = new Scanner(System.in);
        String tmp;
        double znach;
        boolean f = false;

        while (!f) {
            System.out.print("Enter starting value X: ");

            tmp = in.next();
            znach = Double.parseDouble(tmp);
            if (znach < mass[0] || znach > mass[mass.length - 1]) {
                System.out.println("Your value is out of range.");
                break;
            } else {
                f = true;
            }

            int j = Min.search(mass, znach);

            double max = 0;
            double grad = 0;
            double grad2 = 0;
            double point = 0;
            int a = 3;
            int count = 0;

            while (true) {
                grad = (mass2[j + 1] - mass2[j]) / (mass[j + 1] - mass[j]);
                if (grad < 0) {
                    grad2 = (mass2[j + a + 1] - mass2[j + a]) / (mass[j + a + 1] - mass[j + a]);
                    if (grad2 < 0) {
                        j = j + a;
                    } else {
                        a = a - 1;
                    }
                    if (a == 0) {
                        max = mass2[j + 1];
                        point = mass[j + 1];
                        break;
                    }
                } else {
                    grad2 = (mass2[j - a + 1] - mass2[j - a]) / (mass[j - a + 1] - mass[j - a]);
                    if (grad2 > 0) {
                        j = j - a;
                    } else {
                        a = a - 1;
                    }
                    if (a == 0) {
                        max = mass2[j];
                        point = mass[j];
                        break;
                    }
                }
                count = count + 1;
            }
            System.out.println("Minimum of F(X) = " + max + " at X = " + point);
            System.out.println("Iterations made = " + count);
        }
    }
}
