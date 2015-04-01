package ua.ho.godex.morjov.functions;

import ua.ho.godex.morjov.Trio;
import ua.ho.godex.morjov.myPair;

import java.io.File;
import java.util.List;

/**
 * Created by godex
 * on  24.03.2015.19:50
 * for Morjov
 */
public class HomeWork1 {
    private final static boolean debug=true;//Выводить доп инфо
    /**
     * Сделать билинейною интерполяцыю
     * с предварительной конвертировкой строки в числа
     * вариант береться с
     *
     * @param input1ValueStr строка с Х
     * @param input2ValueStr строка с У
     * @param variantStr     Номер варианта
     * @return рузультат интерполяцыи
     * @throws Exception ошыбки почему не удалось выполнить интерполяцыю
     * @see Variants тут даные для вариантов
     */
    @Deprecated
    static public Double doBilinearInterpolation(String input1ValueStr, String input2ValueStr, String variantStr) throws Exception {
        Double input1Value = null, input2Value = null;
        int variant = 0;
        try {
            input1Value = MyUtils.strToDouble(input1ValueStr);
            input2Value = MyUtils.strToDouble(input2ValueStr);
        } catch (Exception e) {
            e.initCause(new Exception("Проверте правильность чисел"));
        }
        try {
            variant = Integer.parseInt(variantStr);
        } catch (Exception e) {
            e.initCause(new Exception("Проверте правильность варианта"));
        }
        final List<Trio> pairList = Variants.getHW1Data(variant);
        return doBilinearInterpolation(input1Value, input2Value, pairList);
    }

    /**
     * Сделать биленейную интерполяцыю
     * с использованием файла с точками
     *
     * @param inputXStr   Строка с значением Х
     * @param inputYStr   Строка с значением У
     * @param variantFile файл с вариантом
     * @return рузультат интерполяцыи
     * @throws Exception ошыбки почему не удалось выполнить интерполяцыю
     */
    static public Double doBilinearInterpolation(String inputXStr, String inputYStr, File variantFile) throws Exception {
        Double inputX = null, inputY = null;
        inputXStr = inputXStr.replace(",", ".");
        inputYStr = inputYStr.replace(",", ".");
        int variant = 0;
        try {
            inputX = MyUtils.strToDouble(inputXStr);
            inputY = MyUtils.strToDouble(inputYStr);
        } catch (Exception e) {
            e.initCause(new Exception("Проверте правильность чисел"));
        }
        List<Trio> pairList = null;
        try {
            pairList = Variants.getHW1Data(variantFile);
        } catch (Exception e) {
            e.initCause(new Exception("Проверте правильность пути к фалу"));
        }
        return doBilinearInterpolation(inputX, inputY, pairList);
    }

    /**
     * Сделать биленейную интерполяцыю
     *
     * @param inputX   Значение Х
     * @param inputY   Значение У
     * @param pairList Масив точок и их значений
     * @return рузультат интерполяцыи
     * @throws Exception ошыбки почему не удалось выполнить интерполяцыю
     */
    private static Double doBilinearInterpolation(Double inputX, Double inputY, List<Trio> pairList) throws Exception {
        //проверка диапазона
        if (inputX < pairList.get(0).posX() || inputX > pairList.get(pairList.size() - 1).posX()) {
            throw new Exception("X вне диапазона");
        }
        if (inputY < pairList.get(0).posY() || inputY > pairList.get(pairList.size() - 1).posY()) {
            throw new Exception("Y вне диапазона");
        }
        //X=Xto4 & Y=Yto4 проверка не являються ли указаные кординаты кординатами точки
        for (Trio trio : pairList) {
            if (trio.posX().equals(inputX) && trio.posY().equals(inputY))
                return trio.value();
        }
        //нахождения диапазона где точка проверка диапазона
        Double yMin = null, yMax = null, xMin = null, xMax = null;
        Trio q11 = null, q12 = null, q21 = null, q22 = null;
        //find yMin yMax
        for (int pos = 0; pos < pairList.size() - 1; pos++) {
            if (pairList.get(pos).posX().equals(inputX) || inputX.equals(pairList.get(pos + 1).posX())) {//X=Xto4 проверка не лежит ли значение Х на грани
                if (pairList.get(pos).posX().equals(inputX)) {
                    xMin = pairList.get(pos).posX();
                    xMax = pairList.get(pos).posX();
                } else {
                    xMin = pairList.get(pos + 1).posX();
                    xMax = pairList.get(pos + 1).posX();
                }
            } else {
                if (pairList.get(pos).posX() < inputX && inputX < pairList.get(pos + 1).posX()) {
                    xMin = pairList.get(pos).posX();
                    xMax = pairList.get(pos + 1).posX();
                }
            }
            if (pairList.get(pos).posY().equals(inputY) || pairList.get(pos + 1).posY().equals(inputY)) {//Y=Yto4 проверка не лежит ли значение Y на грани
                if (pairList.get(pos).posY().equals(inputY)) {
                    yMin = pairList.get(pos).posY();
                    yMax = pairList.get(pos).posY();
                } else {
                    yMin = pairList.get(pos + 1).posY();
                    yMax = pairList.get(pos + 1).posY();
                }
            } else {
                if (pairList.get(pos).posY() < inputY && inputY < pairList.get(pos + 1).posY()) {
                    yMin = pairList.get(pos).posY();
                    yMax = pairList.get(pos + 1).posY();
                }
            }
        }
        //Выбрать точки с матрицы
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
        //X=Xto4 если на грани Х
        if (inputX.equals(xMin) || inputX.equals(xMax)) {
            return Lab1.doInterpolation(inputY, new myPair(q11.posY(), q11.value()), new myPair(q12.posY(), q12.value()));
        }
        //Y=Yto4 если на грани У
        if (inputY.equals(yMin) || inputY.equals(yMin)) {
            return Lab1.doInterpolation(inputX, new myPair(q11.posX(), q11.value()), new myPair(q21.posX(), q21.value()));
        }
        /**/
        Trio r1, r2, p;
        Double x2 = xMax, x1 = xMin, y2 = yMax, y1 = yMin, x = inputX, y = inputY;
        r1 = new Trio(inputX, yMin, ((x2 - x) / (x2 - x1)) * q11.value() + ((x - x1) / (x2 - x1)) * q21.value());
        if(debug){
            System.out.println("(("+x2+ "-"+ x+")/("+x2+ "-" +x1+"))*"+q11.value()+ "+(("+x +"-"+ x1+")/("+x2+ "-" +x1+"))*"+q21.value()+"="+r1.value());
        }
        r2 = new Trio(inputX, yMax, ((x2 - x) / (x2 - x1)) * q12.value() + ((x - x1) / (x2 - x1)) * q22.value());
        if(debug){
            System.out.println("(("+x2+ "-"+ x+")/("+x2+ "-" +x1+"))*"+q12.value()+ "+(("+x +"-"+ x1+")/("+x2+ "-" +x1+"))*"+q22.value()+"="+r2.value());
        }
        p = new Trio(inputX, inputY, ((y2 - y) / (y2 - y1)) * r1.value() + ((y - y1) / (y2 - y1)) * r2.value());
        if(debug){
            System.out.println("(("+y2+"-"+y+")/("+y2+ "-"+ y1+"))*"+r1.value()+"+"+"(("+y+"-" +y1+")/("+y2+ "-"+y1+"))*"+ r2.value()+"="+p.value());
        }
        return p.value();
    }
}
