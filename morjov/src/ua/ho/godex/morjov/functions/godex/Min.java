package ua.ho.godex.morjov.functions.godex;

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

        double[] mass={-1.0, -0.8, -0.6, -0.4, -0.2, 0.0, 0.2, 0.4, 0.6, 0.8, 1.0};
        double[] mass2={1.82, 1.49, 1.24, 1.05, 0.95, 0.96, 0.94, 1.05, 1.24, 1.49, 1.82};

        Scanner in = new Scanner(System.in);
        double znach;
        boolean f = false;

        while(!f) {
            System.out.print("Enter starting value X: ");
            znach = in.nextDouble();
            if(znach < -1.0 || znach > 1.0) {
                System.out.println("Your value is out of range.");
                break;
            }
            else {
                f = true;
            }

            int j =  Min.search(mass, znach);

            double max = 0;
            double grad = 0;
            double grad2 = 0;
            double point = 0;
            int a = 3;
            int count = 0;

            while(true) {
                grad = (mass2[j + 1]- mass2[j]) / (mass[j + 1] - mass[j]);
                if (grad < 0) {
                    grad2 = (mass2[j + a + 1]- mass2[j + a])/(mass[j + a + 1] - mass[j + a]);
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
                    grad2 = (mass2[j - a + 1]- mass2[j - a])/(mass[j - a + 1] - mass[j - a]);
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
            System.out.println("Minimum of F(X) = " + max + " at X = " +  point);
            System.out.println("Iterations made = " + count);
        }
    }
}
