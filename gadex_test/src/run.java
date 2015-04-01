import ua.ho.godex.morjov.functions.HomeWork1;
import ua.ho.godex.morjov.functions.Lab1;
import ua.ho.godex.morjov.functions.Lab2Func;

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
                "\n0)exit" +
                "\n");
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
        String tmp,xStr,yStr;
        System.out.print("X->");
        xStr = inScanner.next();
        System.out.print("Y->");
        yStr = inScanner.next();
        try {
            System.out.print("Ansver=" + HomeWork1.doBilinearInterpolation(xStr, yStr, new File("HWdata.txt")).toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void lab2start() {
        Double start, end, par3;
        Integer method;
        String tmp;
        System.out.print("Start->");
        tmp = inScanner.next();
        start = Double.valueOf(tmp);
        System.out.print("End->");
        tmp = inScanner.next();
        end = Double.valueOf(tmp);
        System.out.print("method 1)gold  2)Fibona4i->");
        tmp = inScanner.next();
        method = Integer.valueOf(tmp);
        try {
        switch (method){
            case 1:
                System.out.print("Погрешность->");
                tmp = inScanner.next();
                par3 = Double.valueOf(tmp);
                System.out.print("Ansver=" + new Lab2Func().goldenCut(start, end, par3));
                break;
            case 2:
                System.out.print("Iteration->");
                tmp = inScanner.next();
                par3 = Double.valueOf(tmp);
                System.out.print("Ansver=" + new Lab2Func().fibonacci(start,end,par3));
                break;
            default:
                menu();
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        File tmp = new File("HWdata.txt");
        menu();
    }
}
