package ua.ho.godex.morjov.functions;

import ua.ho.godex.morjov.myPair;

import java.util.List;

/**
 * Created by godex
 * on  24.03.2015.19:51
 * for Morjov
 */
public class Lab1 {


    /**
     * Промежуточная функцыя преобразует строки в цыфры
     * @param inputValueStr входящее значение
     * @param variantStr номер варианта
     * @return ответ
     * @throws Exception возможны ошыбки
     */
    static public Double doInterpolation(String inputValueStr, String variantStr) throws Exception {
        Double inputValue = null;
        Double variant = null;
        try {
            inputValue = MyUtils.strToDouble(inputValueStr);
        } catch (Exception e) {
            e.initCause(new Exception("Проверте правильность числа"));
        }
        try {
            variant = MyUtils.strToDouble(variantStr);
        } catch (Exception e) {
            e.initCause(new Exception("Проверте правильность варианта"));
        }
        return doInterpolation(inputValue,variant);
    }
    /**
     * Интерполяцыя
     * @param inputValue входящее значение
     * @param variant номер варианта
     * @return ответ
     * @throws Exception возможны ошыбки
     */
    static public Double doInterpolation(Double inputValue, Double variant) throws Exception {
        final List<myPair> pairList = Variants.getLab1Data(variant.intValue());
        if (inputValue < pairList.get(0).key() || inputValue > pairList.get(pairList.size() - 1).key())
            throw new IllegalArgumentException("Значение выходит за границы");
        //поиск лежыт ли на точке
        Double x0, x1, x2, y0, y1, y2;
        x1 = inputValue;
        for (int pos = 0; pos < pairList.size() - 1; pos++) {
            if (pairList.get(pos).key().equals(inputValue))
                return pairList.get(pos).value();
            else {
                //поиск меж ду какими точками
                if (pairList.get(pos).key() < inputValue && inputValue < pairList.get(pos + 1).key()) {
                    return doInterpolation(inputValue,pairList.get(pos),pairList.get(pos+1));
                }
            }
        }
        /**/
        return -1d;
    }

    /**
     * Интерполяцыя
     * @param inputValueStr
     * @param min  менше точки
     * @param max больше точки
     * @return результат интерполяции
     * @throws Exception
     */
    static public Double doInterpolation(String inputValueStr, myPair min,myPair max) throws Exception {
        return doInterpolation(MyUtils.strToDouble(inputValueStr),min,max);
    }

    static public Double doInterpolation(Double inputValueStr, myPair min,myPair max) throws Exception {
        Double x0,x1,x2,y0,y2;
        x0=min.key();
        x1=inputValueStr;
        x2=max.key();
        y0=min.value();
        y2=max.value();
        return (double) y0 + ((x1 - x0) / (x2 - x0)) * (y2 - y0);
    }
}
