import ua.ho.godex.morjov.functions.HomeWork1;
import ua.ho.godex.morjov.functions.Lab1;
import ua.ho.godex.morjov.myPair;

import java.io.File;
import java.util.Scanner;

/**
 * Created by godex_000
 * on 27.03.2015.
 * for Morjov
 */
public class run {

    static Scanner inScanner = new Scanner(System.in);
    public static void menu(){
        System.out.print("1)lab1" +
                "\n2)HW1" +
                "\n3)Lab2" +
                "\n0)exit");
        switch (inScanner.nextInt()){
            case 1:
                lab1start();
                break;
            case 2:
                HW1start();
                break;
            case 3:
                lab2start();
                break;
            case 0:
                System.exit(0);
            default:
                menu();
        }
    }
    public static void lab1start(){

    }

    public static void HW1start(){

    }

    public static void lab2start(){

    }
    public static void main(String[] args){
        File tmp=new File("HWdata.txt");
        myPair min=new myPair(15.5d,6000d),max=new myPair(19.2d,8000d);
        try {
            //System.out.print(Lab1.doInterpolation(String.valueOf(16.1993d), min, max));
            HomeWork1.doBilinearInterpolation("1", "1", tmp);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.print("\ntest_end");
    }
}
