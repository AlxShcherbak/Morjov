package functions;

import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alx Shcherbak on 20.03.2015.
 * @author Alx Shcherbak
 */
public class Lab1Func {
    private List<Double> startParamOneArrayList = new ArrayList<Double>();
    private List<Double> resultArrayList = new ArrayList<Double>();
    TextField outputTextField;

    /**
     * Функция инициализации проведения интерполяции
     *
     * @param inputValue      - входная величина
     * @param outputTextField - входное выходное текстовое поле
     * @return
     */
    public Double doInterpolationEnterValues(double inputValue, TextField outputTextField) {
        new VariantSet().setEnterArrayListsVariant19(this.startParamOneArrayList, this.resultArrayList);
        Double returnValue = null;
        if (existenceCheck(inputValue)) {
            return getResult(inputValue);
        }
        this.outputTextField = outputTextField;
        Double[] borders = borders(inputValue);
        if (borders[0]!=(null)) {
            returnValue = doInterpolation(inputValue, borders);
        }
        return returnValue;
    }

    /**
     * дебаг метод
     *
     * @param args
     */
    public static void main(String args[]) {
        Lab1Func lab1Func = new Lab1Func();
        //lab1Func.setEnterArrayLists();
        System.out.println(lab1Func.doInterpolationEnterValues(1.2, null));
        System.out.println(lab1Func);
    }


    /**
     * Преобразование класса Lab1Func в строку для вывода
     *
     * @return -   преобразованый класс Lab1Func в строку
     */
    public String toString() {
        StringBuffer returnString = new StringBuffer();
        returnString.append("Массив входного 1 параметра M ");
        for (Double item : this.startParamOneArrayList) {
            returnString.append("- " + item + " ");
        }
        returnString.append("\nМассив результирующего параметра - R ");
        for (Double item : this.resultArrayList) {
            returnString.append("- " + item.intValue() + " ");
        }
        return returnString.toString();
    }



    /**
     * Вывести в поле вывода сообщение
     *
     * @param massage - сообщение для вывода
     */
    private void setMassageToOutputTextField(String massage) {
        this.outputTextField.setText(massage);
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
        boolean result = false;
        for (Double item : this.startParamOneArrayList) {
            if (item.equals(inputValue)) {
                return true;
            }
        }
        return result;
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
        Double returnValue = null;
        returnValue = getResult(borders[0]) + ((getResult(borders[1]) - getResult(borders[0])) /
                (borders[1] - borders[0]) * (inputValue - borders[0]));
        return returnValue;
    }
}
