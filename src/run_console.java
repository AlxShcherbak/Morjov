import ua.ho.godex.morjov.functions.MyUtils;

import java.io.File;
import java.util.Scanner;

/**
 * Created by Bohdan Povlenko
 * on  17.05.2015.12:02
 * for Morjov
 *
 * @author Bohdan Povlenko
 */
public class run_console {

        static File tmpFile = new File("HWdata6.txt");
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
            x = MyUtils.strToDouble(tmp);
            System.out.print("Variant->");
            tmp = inScanner.next();
            var = MyUtils.strToDouble(tmp);
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
                System.out.print("Ansver=" + HomeWork1.doBilinearInterpolation(xStr, yStr, tmpFile).toString());
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
            start = MyUtils.strToDouble(tmp);
            System.out.print("End->");
            tmp = inScanner.next();
            end = MyUtils.strToDouble(tmp);
            System.out.print("method 1)gold  2)Fibona4i->");
            tmp = inScanner.next();
            method = Integer.valueOf(tmp);
            try {
                switch (method){
                    case 1:
                        System.out.print("to4nosty->");
                        tmp = inScanner.next();
                        par3 = MyUtils.strToDouble(tmp);
                        System.out.print("Ansver=" + new Lab2Func().goldenCut(start, end, par3));
                        break;
                    case 2:
                        System.out.print("Iteration->");
                        tmp = inScanner.next();
                        par3 = MyUtils.strToDouble(tmp);
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
            menu();
        }


}
