package functions;

import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alx Shcherbak on 22.03.2015.
 */
public class Lab2Func {
    private List<Double> parameterList = new ArrayList<Double>();
    private List<Double> resultList = new ArrayList<Double>();
    private List<Long> fibonacciList = new ArrayList<Long>();
    private static final Double GOLDEN_CUT = 1.618d;

    /**
     * Нахождение экстремума по методу Фибоначчи
     *
     * @param inputValue1    - начало отрезка для нахождения экстремума
     * @param inputValue2    - конец отрезка для нахождения экстремума
     * @param inputValue3    - количество проводимых итераций
     * @param errorTextField - текстовое поле для вывода ошибок
     * @return - результат точка экстремума, значение функции и количиство итераций
     */
    public LabXFxIteration fibonacci(Double inputValue1, Double inputValue2, Double inputValue3, TextField errorTextField) {
        new VariantSet().setEnterArrayListsVariant19(this.parameterList, this.resultList);
        if (!this.fibonacciList.isEmpty() | (this.fibonacciList.size() < inputValue3)) {
            fibonacciNumbers(inputValue3.longValue());
        }

        double x1, x2, a = inputValue1,
                b = inputValue2;
        int iterator = inputValue3.intValue();
        x1 = a + (b - a) * fibonacciList.get(iterator - 3) /
                fibonacciList.get(iterator - 1);
        x2 = a + (b - a) * fibonacciList.get((int) (inputValue3.longValue() - 2)) /
                fibonacciList.get((int) (inputValue3.longValue() - 1));


        return fibonacciRecursive(a, b, x1, x2, iterator, errorTextField);
    }

    /**
     * @param a                  - начало отрезка
     * @param b                  - конец отрезка
     * @param x1                 - составное слогаемое границы с учетом чисел Фибоначчи
     * @param x2                 - составное слогаемое границы с учетом чисел Фибоначчи
     * @param iterator           - количество итераций для выполнения
     * @param outputLab2ErrorLog - текстовое поле для вывода ошибок
     * @return
     */
    private LabXFxIteration fibonacciRecursive(double a, double b, double x1, double x2, int iterator, TextField outputLab2ErrorLog) {
        iterator--;
        LabXFxIteration fibonacciRecursiveReturn;
        if (new Lab1Func().doInterpolationEnterValues(x1, outputLab2ErrorLog) > (new Lab1Func().doInterpolationEnterValues(x2, outputLab2ErrorLog))) {
            a = x1;
            x1 = x2;
            x2 = b - (x1 - a);
        } else {
            b = x2;
            x2 = x1;
            x1 = a + (b - x2);
        }

        if (iterator == 1) {
            fibonacciRecursiveReturn = new LabXFxIteration(x1, new Lab1Func().doInterpolationEnterValues(x1, outputLab2ErrorLog));
        } else fibonacciRecursiveReturn = fibonacciRecursive(a, b, x1, x2, iterator, outputLab2ErrorLog);
        return fibonacciRecursiveReturn;
    }

    /**
     * Нахождение экстремума по методу золотого сечения
     *
     * @param inputValue1    - начало отрезка для нахождения экстремума
     * @param inputValue2    - конец отрезка для нахождения экстремума
     * @param inputValue3    - погрешность при нахождении экстремума
     * @param errorTextField - текстовое поле для вывода ошибок
     * @return - результат точка экстремума, значение функции и количиство итераций
     */
    public LabXFxIteration goldenCut(Double inputValue1, Double inputValue2, Double inputValue3, TextField errorTextField) {
        new VariantSet().setEnterArrayListsVariant19(this.parameterList, this.resultList);
        LabXFxIteration goldenCutReturn;
        double x1, x2;

        x1 = inputValue2 - (inputValue2 - inputValue1) / GOLDEN_CUT;
        x2 = inputValue1 + (inputValue2 - inputValue1) / GOLDEN_CUT;


        if ((new Lab1Func().doInterpolationEnterValues(x1, errorTextField)) >=
                (new Lab1Func().doInterpolationEnterValues(x2, errorTextField))) {
            if (inputValue3 > Math.abs(inputValue2 - x1)) {
                goldenCutReturn = new LabXFxIteration((x1 + inputValue2) / 2,
                        new Lab1Func().doInterpolationEnterValues((x1 + inputValue2) / 2, errorTextField));
            } else {
                goldenCutReturn = goldenCut(x1, inputValue2, inputValue3, errorTextField);
            }
        } else {
            if (inputValue3 > Math.abs(x2 - inputValue1)) {
                goldenCutReturn = new LabXFxIteration((inputValue1 + x2) / 2,
                        new Lab1Func().doInterpolationEnterValues((inputValue1 + x2) / 2, errorTextField));
            } else {
                goldenCutReturn = goldenCut(inputValue1, x2, inputValue3, errorTextField);
            }
        }
        goldenCutReturn.incrementIterator();
        return goldenCutReturn;
    }

    /**
     * Генерация чисел Фибоначчи
     *
     * @param number - количество генерируемых чисел Фибоначчи
     */
    private void fibonacciNumbers(Long number) {
        this.fibonacciList.clear();

        this.fibonacciList.add(1l);
        this.fibonacciList.add(1l);
        if (number > 2) {
            for (Long i = 2l; i < number; i++) {
                this.fibonacciList.add(this.fibonacciList.get(this.fibonacciList.size() - 1) +
                        this.fibonacciList.get(this.fibonacciList.size() - 2));
            }
        }
    }

}
