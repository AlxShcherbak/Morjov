package ua.ho.godex.morjov.functions;

import ua.ho.godex.morjov.myPair;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by godex on 24.03.2015.
 */
public class Lab1 {
    List<myPair> pairList;

    static public Double doInterpolation(String inputValueStr, String variantStr) throws Exception {
        Double inputValue = null;
        int variant = 0;
        try {
            inputValue = Double.parseDouble(inputValueStr);
        } catch (Exception e) {
            e.initCause(new Exception("Проверте правильность числа"));
        }
        try {
            variant = Integer.parseInt(variantStr);
        } catch (Exception e) {
            e.initCause(new Exception("Проверте правильность варианта"));
        }
        final List<myPair> pairList = Variants.getLab1Data(variant);
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
                    x0 = pairList.get(pos).key();
                    x2 = pairList.get(pos + 1).key();
                    y0 = pairList.get(pos).value();
                    y2 = pairList.get(pos + 1).value();
                    return y0 + ((x1 - x0) / (x2 - x0)) * (y2 - y0);
                }
            }
        }
        /**/
        return -1d;
    }
}
