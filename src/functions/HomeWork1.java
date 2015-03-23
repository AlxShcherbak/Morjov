package functions;

import functions.classes.HomeWorkFirstClass;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alx Shcherbak on 21.03.2015.
 */
public class HomeWork1 {
    private List<HomeWorkFirstClass> parameters = new ArrayList<HomeWorkFirstClass>();
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
        this.outputTextField = outputTextField;
        new VariantSet().setEnterArrayListsVariant19(this.parameters);
        HomeWorkFirstClass firstIterationInterpolation = null;
        Double returnValue = null;
        /*for (HomeWorkFirstClass item : this.parameters) {
            System.out.println(item);
        }*/

        if (!existenceCheck(inputValue1, this.parameters)) {
            HomeWorkFirstClass[] bordersToFistIteration = border(inputValue1);
            if (bordersToFistIteration[0] != (null)) {
                firstIterationInterpolation = doFirstInterpolation(inputValue1, bordersToFistIteration);
            }
        } else {
            for (HomeWorkFirstClass searchThis : parameters) {
                if (searchThis.getParameterFirst() == inputValue1) {
                    firstIterationInterpolation = searchThis;
                }
            }
        }
        //System.out.print(firstIterationInterpolation);

        assert firstIterationInterpolation != null;
        if (!existenceCheck(firstIterationInterpolation.getParameterSecondArrayList(), inputValue2)) {
            Double[] bordersToSecondIteration = border(inputValue2, firstIterationInterpolation);
            if (bordersToSecondIteration[0] != (null)) {
                returnValue = doSecondInterpolation(inputValue2, bordersToSecondIteration, firstIterationInterpolation);
            }
        } else {
            returnValue = firstIterationInterpolation.getResultArrayList().get(firstIterationInterpolation.getParameterSecondArrayList().indexOf(inputValue2));
        }
        return returnValue;
    }

    /**
     * Определение границ для интерполяции
     *
     * @param inputValue - входная величина
     * @return -   массив границ для проведения интерполяции
     */
    private HomeWorkFirstClass[] border(double inputValue) {
        HomeWorkFirstClass[] returnBorders = new HomeWorkFirstClass[2];

        if ((inputValue < this.parameters.get(0).getParameterFirst()) | (inputValue > this.parameters.get(9).getParameterFirst())) {
            System.out.println("Введеное значение вне условного массива");
            setMassageToOutputTextField("Введеное значение вне условного массива");
        } else {
            for (HomeWorkFirstClass item : this.parameters) {
                if (this.parameters.indexOf(item) != 9) {
                    if ((item.getParameterFirst() < inputValue) & (inputValue < this.parameters.get(this.parameters.indexOf(item) + 1).getParameterFirst())) {
                        returnBorders = new HomeWorkFirstClass[]{this.parameters.get(this.parameters.indexOf(item)), this.parameters.get(this.parameters.indexOf(item) + 1)};
                        break;
                    }
                }
            }
        }
        return returnBorders;
    }

    /**
     * Определение границ для интерполяции
     *
     * @param inputValue - входная величина
     * @return -   массив границ для проведения интерполяции
     */
    private Double[] border(double inputValue, HomeWorkFirstClass afterFirstIteration) {
        Double[] returnBorders = null;

        if ((inputValue < afterFirstIteration.getParameterSecondArrayList().get(0)) | (inputValue > afterFirstIteration.getParameterSecondArrayList().get(6))) {
            System.out.println("Введеное значение вне условного массива");
            setMassageToOutputTextField("Введеное значение вне условного массива");
        } else {
            for (Double item : afterFirstIteration.getParameterSecondArrayList()) {
                if (afterFirstIteration.getParameterSecondArrayList().indexOf(item) != 6) {
                    if ((item < inputValue) & (inputValue < afterFirstIteration.getParameterSecondArrayList().get(afterFirstIteration.getParameterSecondArrayList().indexOf(item) + 1))) {
                        returnBorders = new Double[]{afterFirstIteration.getParameterSecondArrayList().get(afterFirstIteration.getParameterSecondArrayList().indexOf(item)),
                                afterFirstIteration.getParameterSecondArrayList().get(afterFirstIteration.getParameterSecondArrayList().indexOf(item) + 1)};
                        break;
                    }
                }
            }
        }

        return returnBorders;
    }

    /**
     * Функция проведения интерполяции
     *
     * @param inputValue - входная величина
     * @param borders    - границы интерполируемого отрезка
     * @return -   результат интерполяции
     */
    private HomeWorkFirstClass doFirstInterpolation(double inputValue, HomeWorkFirstClass[] borders) {
        Double resultBufferInterpolation;
        List<Double> resultArrayList = new ArrayList<Double>();

        for (Double item : borders[0].getParameterSecondArrayList()) {
            resultBufferInterpolation = borders[0].getResultArrayList().get(borders[0].getParameterSecondArrayList().indexOf(item))
                    + (borders[1].getResultArrayList().get(borders[0].getParameterSecondArrayList().indexOf(item))
                    - borders[0].getResultArrayList().get(borders[0].getParameterSecondArrayList().indexOf(item)))
                    / (borders[1].getParameterFirst() - borders[0].getParameterFirst())
                    * (inputValue - borders[0].getParameterFirst());
            resultArrayList.add(resultBufferInterpolation);
        }

        return new HomeWorkFirstClass(inputValue, borders[0].getParameterSecondArrayList(), resultArrayList);
    }

    /**
     * Функция проведения интерполяции
     *
     * @param inputValue - входная величина
     * @param borders    - границы интерполируемого отрезка
     * @return -   результат интерполяции
     */
    private Double doSecondInterpolation(double inputValue, Double[] borders, HomeWorkFirstClass firstInterpolationResult) {
        return firstInterpolationResult.getResultArrayList().get(firstInterpolationResult.getParameterSecondArrayList().indexOf(borders[0]))
                + (firstInterpolationResult.getResultArrayList().get(firstInterpolationResult.getParameterSecondArrayList().indexOf(borders[1])) -
                firstInterpolationResult.getResultArrayList().get(firstInterpolationResult.getParameterSecondArrayList().indexOf(borders[0]))) /
                (borders[1] - borders[0]) * (inputValue - borders[0]);
    }


    /**
     * Проверка на существование входной величины в массиве условий
     *
     * @param checkThis - входная величина, то что мы ищем
     * @param checkHere - входная величина, где мы ищим
     * @return -   boolean значение существования входной величины в массиве условий
     * true    -   существует
     * false   -   несуществует
     */
    private boolean existenceCheck(Double checkThis, List<HomeWorkFirstClass> checkHere) {
        for (HomeWorkFirstClass item : checkHere) {
            if (item.getParameterFirst().equals(checkThis)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Проверка на существование входной величины в массиве условий
     *
     * @param checkHere - входная величина, где мы ищим
     * @param checkThis - входная величина, то что мы ищем
     * @return -   boolean значение существования входной величины в массиве условий
     * true    -   существует
     * false   -   несуществует
     */
    private boolean existenceCheck(List<Double> checkHere, Double checkThis) {
        for (Double item : checkHere) {
            if (item.equals(checkThis)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Вывести в поле вывода сообщение
     */
    private void setMassageToOutputTextField(String massageToOutputTextField) {
        this.outputTextField.setText(massageToOutputTextField);
    }
}
