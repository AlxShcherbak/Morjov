package functions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alx Shcherbak on 20.03.2015.
 *
 * @author Alx Shcherbak
 */
public class Lab1Func {
    private List<Double> startParamOneArrayList = new ArrayList<Double>();
    private List<Double> resultArrayList = new ArrayList<Double>();
    //private TextField outputTextField;

    /**
     * Функция инициализации проведения интерполяции
     *
     * @param inputValue      - входная величина
     * @return - результат интерполяции
     */
    public Double doInterpolationEnterValues  (double inputValue,int variant) throws Exception {
        switch (variant){
            case 13:
                new VariantSet().setEnterArrayListsVariant13(this.startParamOneArrayList, this.resultArrayList);
            case 19:
                new VariantSet().setEnterArrayListsVariant19(this.startParamOneArrayList, this.resultArrayList);
                break;
            default:
                throw new Exception("Vrong variant");
        }
        Double returnValue = null;
        if (existenceCheck(inputValue)) {
            return getResult(inputValue);
        }
        Double[] borders = borders(inputValue);
        if (borders[0] != (null)) {
            returnValue = doInterpolation(inputValue, borders);
        }
        return returnValue;
    }
    public Double doInterpolationEnterValues  (double inputValue) throws Exception {
        Double returnValue = null;
        if (existenceCheck(inputValue)) {
            return getResult(inputValue);
        }
        Double[] borders = borders(inputValue);
        if (borders[0] != (null)) {
            returnValue = doInterpolation(inputValue, borders);
        }
        return returnValue;
    }

    /**
     * дебаг метод
     *
     * @param args - массив строк потоков
     */
    public static void main (String args[]) throws Exception {
        Lab1Func lab1Func = new Lab1Func();
        //lab1Func.setEnterArrayLists();
        //System.out.println(lab1Func.doInterpolationEnterValues(1.2));
        System.out.println(lab1Func);
    }


    /**
     * Преобразование класса Lab1Func в строку для вывода
     *
     * @return -   преобразованый класс Lab1Func в строку
     */
    public String toString() {
        StringBuilder returnString = new StringBuilder();
        returnString.append("Массив входного 1 параметра M ");
        for (Double item : this.startParamOneArrayList) {
            returnString.append("- ").append(item).append(" ");
        }
        returnString.append("\nМассив результирующего параметра - R ");
        for (Double item : this.resultArrayList) {
            returnString.append("- ").append(item.intValue()).append(" ");
        }
        return returnString.toString();
    }


    /**
     * Вывести в поле вывода сообщение
     *
     * @param massage - сообщение для вывода
     */
    private void setMassageToOutputTextField(String massage) {

    }

    /**
     * Определение границ для интерполяции
     *
     * @param inputValue - входная величина
     * @return -   массив границ для проведения интерполяции
     */
    private Double[] borders(double inputValue) {
        Double[] returnBorders = new Double[2];
        for (int i = 0, j = 1; i < this.startParamOneArrayList.size(); i++, j++) {
            if (((i == 0) & (this.startParamOneArrayList.get(i) > inputValue)) |
                    ((i == this.startParamOneArrayList.size() - 1) && (this.startParamOneArrayList.get(i) < inputValue))) {
                System.out.println("Введеное значение вне условного массива");
                setMassageToOutputTextField("Введеное значение вне условного массива");
                break;
            } else if ((j < startParamOneArrayList.size()) && (this.startParamOneArrayList.get(i) < inputValue) && (this.startParamOneArrayList.get(j) > inputValue)) {
                returnBorders = new Double[]{this.startParamOneArrayList.get(i), this.startParamOneArrayList.get(j)};
                break;
            }
        }
        return returnBorders;
    }

    /**
     * Проверка на существование входной величины в массиве условий
     *
     * @param inputValue - входная величина
     * @return -   boolean значение существования входной величины в массиве условий
     * true    -   существует
     * false   -   несуществует
     */
    private boolean existenceCheck(Double inputValue) {
        for (Double item : this.startParamOneArrayList) {
            if (item.equals(inputValue)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Получение результата функциии (с условия) по входной величине
     *
     * @param inputValue - входная величина
     * @return - значение результата для водной величины
     */
    private Double getResult(Double inputValue) {
        Double resultValue = null;
        for (Double item : this.startParamOneArrayList) {
            if (item.equals(inputValue)) {
                resultValue = this.resultArrayList.get(startParamOneArrayList.indexOf(item));
                break;
            }
        }
        return resultValue;
    }

    /**
     * Функция проведения интерполяции
     *
     * @param inputValue - входная величина
     * @param borders    - границы интерполируемого отрезка
     * @return -   результат интерполяции
     */
    private Double doInterpolation(double inputValue, Double[] borders) {
        return (getResult(borders[0]) + ((getResult(borders[1]) - getResult(borders[0])) /
                (borders[1] - borders[0]) * (inputValue - borders[0])));
    }
}