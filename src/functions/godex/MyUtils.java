package functions.godex;

/**
 * Created by godex_000
 * on  01.04.2015.16:31
 * for Morjov
 */
public class MyUtils {
    public static Double strToDouble(String string){
        return Double.valueOf(string.replace(",","."));
    }
}
