package ua.ho.godex.morjov.functions;

import ua.ho.godex.morjov.Trio;

import java.util.List;

/**
 * Created by godex on 24.03.2015.
 */
public class HomeWork1 {

    static public Double doHomeWork(String input1ValueStr, String input2ValueStr, String variantStr) throws Exception {
        Double input1Value, input2Value = null;
        int variant = 0;
        try {
            input1Value = Double.parseDouble(input1ValueStr);
            input2Value = Double.parseDouble(input2ValueStr);
        } catch (Exception e) {
            e.initCause(new Exception("Проверте правильность чисел"));
        }
        try {
            variant = Integer.parseInt(variantStr);
        } catch (Exception e) {
            e.initCause(new Exception("Проверте правильность варианта"));
        }
        final List<Trio> pairList = Variants.getHW1Data(variant);
        return 2d;
    }
}
