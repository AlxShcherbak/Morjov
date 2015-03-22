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
    TextField outputTextField;

    /**
     * Функция инициализации проведения интерполяции
     *
     * @param inputValue1     - входная величина 1
     * @param inputValue2     - входная величина 2
     * @param outputTextField - входное выходное текстовое поле
     * @return
     */
    public Double doInterpolationEnterValues(double inputValue1, double inputValue2, TextField outputTextField) {
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

        if ((inputValue < this.parameters.get(0).getParameterFirst()) & (inputValue > this.parameters.get(9).getParameterFirst())) {
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

        if ((inputValue < afterFirstIteration.getParameterSecondArrayList().get(0)) & (inputValue > afterFirstIteration.getParameterSecondArrayList().get(6))) {
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
        HomeWorkFirstClass returnValue = null;
        Double resultBufferInterpolation;
        List<Double> resultArrayList = new ArrayList<Double>();

        for (Double item : borders[0].getParameterSecondArrayList()) {
            Double par0, par1, par2, par3, par4, par5;
            resultBufferInterpolation = borders[0].getResultArrayList().get(borders[0].getParameterSecondArrayList().indexOf(item))
                    + (borders[1].getResultArrayList().get(borders[0].getParameterSecondArrayList().indexOf(item))
                    - borders[0].getResultArrayList().get(borders[0].getParameterSecondArrayList().indexOf(item)))
                    / (borders[1].getParameterFirst() - borders[0].getParameterFirst())
                    * (inputValue - borders[0].getParameterFirst());
            resultArrayList.add(resultBufferInterpolation);
        }
        returnValue = new HomeWorkFirstClass(inputValue, borders[0].getParameterSecondArrayList(), resultArrayList);
        return returnValue;
    }

    /**
     * Функция проведения интерполяции
     *
     * @param inputValue - входная величина
     * @param borders    - границы интерполируемого отрезка
     * @return -   результат интерполяции
     */
    private Double doSecondInterpolation(double inputValue, Double[] borders, HomeWorkFirstClass firstInterpolationResult) {
        Double returnValue = null;
        returnValue = firstInterpolationResult.getResultArrayList().get(firstInterpolationResult.getParameterSecondArrayList().indexOf(borders[0]))
                + (firstInterpolationResult.getResultArrayList().get(firstInterpolationResult.getParameterSecondArrayList().indexOf(borders[1])) -
                firstInterpolationResult.getResultArrayList().get(firstInterpolationResult.getParameterSecondArrayList().indexOf(borders[0]))) /
                (borders[1] - borders[0]) * (inputValue - borders[0]);
        return returnValue;
    }


    /**
     * Проверка на существование входной величины в массиве условий
     *
     * @param - входная величина
     * @return -   boolean значение существования входной величины в массиве условий
     * true    -   существует
     * false   -   несуществует
     */
    private boolean existenceCheck(Double checkThis, List<HomeWorkFirstClass> checkHere) {
        boolean result = false;
        for (HomeWorkFirstClass item : checkHere) {
            if (item.getParameterFirst().equals(checkThis)) {
                return true;
            }
        }
        return result;
    }

    /**
     * Проверка на существование входной величины в массиве условий
     *
     * @param - входная величина
     * @return -   boolean значение существования входной величины в массиве условий
     * true    -   существует
     * false   -   несуществует
     */
    private boolean existenceCheck(List<Double> checkHere, Double checkThis) {
        boolean result = false;
        for (Double item : checkHere) {
            if (item.equals(checkThis)) {
                return true;
            }
        }
        return result;
    }

    /**
     * Вывести в поле вывода сообщение
     *
     * @param massage - сообщение для вывода
     */
    private void setMassageToOutputTextField(String massage) {
        this.outputTextField.setText(massage);
    }
}
