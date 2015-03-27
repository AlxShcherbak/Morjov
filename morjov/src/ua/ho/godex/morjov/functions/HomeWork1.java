package ua.ho.godex.morjov.functions;

import ua.ho.godex.morjov.Trio;

import java.io.File;
import java.util.List;

/**
 * Created by godex on 24.03.2015.
 */
public class HomeWork1 {
    static public Double doBilinearInterpolation(String input1ValueStr, String input2ValueStr, String variantStr) throws Exception {
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

    static public Double doBilinearInterpolation(String inputXStr, String inputYStr, File variantFile) throws Exception {
        Double inputX = null, inputY = null;
        int variant = 0;
        try {
            inputX = Double.parseDouble(inputXStr);
            inputY = Double.parseDouble(inputYStr);
        } catch (Exception e) {
            e.initCause(new Exception("Проверте правильность чисел"));
        }
        List<Trio> pairList = null;
        try {
            pairList = Variants.getHW1Data(variantFile);
        } catch (Exception e) {
            e.initCause(new Exception("Проверте правильность пути к фалу"));
        }
        //проверка диапазона
        if (inputX < pairList.get(0).posX() || inputX > pairList.get(pairList.size() - 1).posX()) {
            throw new Exception("X вне диапазона");
        }
        if (inputY < pairList.get(0).posY() || inputY > pairList.get(pairList.size() - 1).posY()) {
            throw new Exception("Y вне диапазона");
        }
        //нахождения диапазона где точка проверка диапазона
        Double yMin = null, yMax = null, xMin = null, xMax = null;
        Trio q11 = null, q12 = null, q21 = null, q22 = null;
        //find yMin yMax
        for (int pos = 0; pos < pairList.size() - 1; pos++) {
            if (pairList.get(pos).posY() < inputY && inputY < pairList.get(pos + 1).posY()) {
                yMin = pairList.get(pos).posY();
                yMax = pairList.get(pos + 1).posY();
            }
            if (pairList.get(pos).posX() < inputX && inputX < pairList.get(pos + 1).posX()) {
                xMin = pairList.get(pos).posX();
                xMax = pairList.get(pos + 1).posX();
            }
        }
        //Выбрать точки
        for (Trio trio : pairList) {
            if (trio.posX().equals(xMin) && trio.posY().equals(yMin))
                q11 = trio;
            if (trio.posX().equals(xMax) && trio.posY().equals(yMin))
                q21 = trio;
            if (trio.posX().equals(xMin) && trio.posY().equals(yMax))
                q12 = trio;
            if (trio.posX().equals(xMax) && trio.posY().equals(yMax))
                q22 = trio;
        }
        Trio r1, r2, p;
        Double x2 = xMax, x1 = xMin, y2 = yMax, y1 = yMin, x = inputX,y=inputY;
        r1 = new Trio(inputX, yMin, ((x2 - x) / (x2 - x1)) * q11.value() + ((x - x1) / (x2 - x1)) * q21.value());
        r2 = new Trio(inputX, yMax, ((x2 - x) / (x2 - x1)) * q12.value() + ((x - x1) / (x2 - x1)) * q22.value());
        p = new Trio(inputX, inputY,((y2-y)/(y2-y1))*r1.value()+((y-y1)/(y2-y1))*r2.value());
        return p.value();
    }
}
