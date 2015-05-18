package functions.godex;

import java.util.List;


/**
 * Created by Bohdan Povlenko
 * on  17.05.2015.14:13
 * for Morjov
 *
 * @author Bohdan Povlenko
 */
public class Lab5Func {

    private static double f(double x){
        return (x*x*Math.sqrt(x)-5*Math.sqrt(x)*x+x*x+x-6);
    }

    public static double in(List<myPair> pairList,Double x0,Double x1,int variant) throws Exception {
        //List<myPair> pairList = Variants.getLab1Data(variant);
        //bubbleSortInvert(pairList);
        Double f0,f1,h,b,ff,c,x;
        Integer k,p,i,n;


        return -1;
    }



    public static void main(String... args) {
        int[] ars = {3, 1, 0, 5, 4, 6, 7, 8, 9, 2};
        bubbleSortInvert(ars);
        for (int el : ars) {
            System.out.print("|" + el);
        }


    }

    public static void bubbleSortInvert(int[] arr) {
    /*Внешний цикл каждый раз сокращает фрагмент массива,
      так как внутренний цикл каждый раз ставит в конец
      фрагмента максимальный элемент*/
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
            /*Сравниваем элементы попарно,
              если они имеют неправильный порядок,
              то меняем местами*/
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    public static void bubbleSortInvert(List<myPair> arr) {
    /*Внешний цикл каждый раз сокращает фрагмент массива,
      так как внутренний цикл каждый раз ставит в конец
      фрагмента максимальный элемент*/
        for (int i = arr.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
            /*Сравниваем элементы попарно,
              если они имеют неправильный порядок,
              то меняем местами*/
                if (arr.get(j).value() > arr.get(j + 1).value()) {
                    myPair tmp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, tmp);
                }
            }
        }
    }

    public static void bubbleSort(int[] arr) {
    /*Внешний цикл каждый раз сокращает фрагмент массива,
      так как внутренний цикл каждый раз ставит в конец
      фрагмента максимальный элемент*/
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
            /*Сравниваем элементы попарно,
              если они имеют неправильный порядок,
              то меняем местами*/
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

}
