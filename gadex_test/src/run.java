import ua.ho.godex.morjov.functions.Lab1;

import java.io.File;
import java.util.Scanner;

/**
 * Created by godex
 * on  24.03.2015.19:50
 * for Morjov
 */
public class run {

    static Scanner inScanner = new Scanner(System.in);

    public static void menu() {
        System.out.print("\n1)lab1" +
                "\n2)HW1" +
                "\n3)Lab2" +
                "\n0)exit");
        switch (inScanner.nextInt()) {
            case 1:
                lab1start();
                menu();
                break;
            case 2:
                HW1start();
                menu();
                break;
            case 3:
                lab2start();
                menu();
                break;
            case 0:
                System.exit(0);
            default:
                menu();
        }
    }

    public static void lab1start() {
        Double x, var;
        String tmp;
        System.out.print("x->");
        tmp = inScanner.next();
        x = Double.valueOf(tmp);
        System.out.print("Variant->");
        tmp = inScanner.next();
        var = Double.valueOf(tmp);
        try {
            System.out.print("Ansver=" + Lab1.doInterpolation(x, var));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void HW1start() {

    }

    public static void lab2start() {

    }

    public static void main(String[] args) {
        File tmp = new File("HWdata.txt");
        menu();
    }
}
