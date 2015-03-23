package functions;

import functions.classes.HomeWorkFirstClass;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alx Shcherbak on 23.03.2015.
 */
public class HomeWorkSecondRealization {

    private List<HomeWorkFirstClass> parametersList = new ArrayList<HomeWorkFirstClass>();
    private TextField outputTextField;


    /**
     * Функция инициализации проведения интерполяции
     *
     * @param inputValue1     - входная величина 1
     * @param inputValue2     - входная величина 2
     * @param outputTextField - входное выходное текстовое поле
     * @return - результат проведения интерполяции
     * @throws java.lang.NullPointerException - Thrown when an application attempts to use {@code null} in a
     *                                        case where an object is required.
     */
    public Double doInterpolationEnterValues(double inputValue1, double inputValue2, TextField outputTextField) throws NullPointerException {
        Double returnValue = null;
        this.outputTextField = outputTextField;
        new VariantSet().setEnterArrayListsVariant19(this.parametersList);
        Double[] existenceCheck = existenceCheck(inputValue1, inputValue2, this.parametersList);
        Double[] borders = borders(inputValue1, inputValue2, existenceCheck, outputTextField);

        // Ну всё! меня задолбали исключения разной херни

        return returnValue;
    }

    /**
     * @param inputValue1
     * @param inputValue2
     * @return
     */
    private Double getResult(Double inputValue1, Double inputValue2) {
        int[] indexes = new int[2];
        for (HomeWorkFirstClass item : this.parametersList) {
            if (item.getParameterFirst().equals(inputValue1)) {
                indexes[0] = this.parametersList.indexOf(item);
            }
        }
        for (Double item : this.parametersList.get(0).getParameterSecondArrayList()) {
            if (item.equals(inputValue2)) {
                indexes[1] = this.parametersList.get(0).getParameterSecondArrayList().indexOf(item);
            }
        }
        return this.parametersList.get(indexes[0]).getResultArrayList().get(indexes[2]);
    }


    /**
     * @param inputValue1
     * @param inputValue2
     * @param existenceCheck
     * @param errorLogTextField
     * @return
     */
    private Double[] borders(double inputValue1, double inputValue2, Double[] existenceCheck, TextField errorLogTextField) {
        Double[] borders = new Double[4];
        if (existenceCheck[0] == null) {
            if ((inputValue1 < this.parametersList.get(0).getParameterFirst()) |
                    (inputValue1 > this.parametersList.get(parametersList.size() - 1).getParameterFirst())) {
                System.out.println("Введеное значение вне условного массива");
                errorLogTextField.setText("Введеное значение вне условного массива");
                return borders;
            } else {
                for (HomeWorkFirstClass item : this.parametersList) {
                    if (this.parametersList.indexOf(item) != this.parametersList.size() - 1) {
                        if ((item.getParameterFirst() < inputValue1) & (inputValue1 <
                                this.parametersList.get(this.parametersList.indexOf(item) + 1).getParameterFirst())) {
                            borders[0] = item.getParameterFirst();
                            borders[1] = this.parametersList.get(this.parametersList.indexOf(item) + 1).getParameterFirst();
                            break;
                        }
                    }
                }
            }
        }
        if (existenceCheck[1] == null) {
            if ((inputValue2 < this.parametersList.get(0).getParameterSecondArrayList().get(0)) |
                    (inputValue2 > this.parametersList.get(0).getParameterSecondArrayList().get(this.parametersList.get(0).getParameterSecondArrayList().size() - 1))) {
                System.out.println("Введеное значение вне условного массива");
                errorLogTextField.setText("Введеное значение вне условного массива");
                return borders;
            } else {
                for (Double item : this.parametersList.get(0).getParameterSecondArrayList()) {
                    if (this.parametersList.get(0).getParameterSecondArrayList().size() - 1 !=
                            this.parametersList.get(0).getParameterSecondArrayList().indexOf(item)) {
                        if ((item < inputValue2) & (inputValue2 <
                                this.parametersList.get(0).getParameterSecondArrayList().get(this.parametersList.get(0).getParameterSecondArrayList().indexOf(item) + 1))) {
                            borders[2] = item;
                            borders[3] = this.parametersList.get(0).getParameterSecondArrayList().get(this.parametersList.get(0).getParameterSecondArrayList().indexOf(item) + 1);
                            break;
                        }
                    }
                }
            }
        }
        return borders;
    }

    /**
     * Проверка на существование входной величины в массиве условий
     *
     * @param checkThis1 - входная величина 1 (горизонталь), то что мы ищем
     * @param checkThis2 - входная величина 2 (вертикаль), то что мы ищем
     * @param checkHere  - входная величина, где мы ищим
     * @return -   boolean значение существования входной величины в массиве условий
     * true    -   существует
     * false   -   несуществует
     */
    private Double[] existenceCheck(Double checkThis1, Double checkThis2, List<HomeWorkFirstClass> checkHere) {
        Double[] existenceCheck = new Double[2];
        for (HomeWorkFirstClass item : checkHere) {
            if (item.getParameterFirst().equals(checkThis1)) {
                existenceCheck[0] = item.getParameterFirst();
            }
        }
        for (Double item : checkHere.get(0).getParameterSecondArrayList()) {
            if (item.equals(checkThis2)) {
                existenceCheck[1] = item;
            }
        }
        return existenceCheck;
    }


    public static void main(String[] args) throws IOException {
    }
}
