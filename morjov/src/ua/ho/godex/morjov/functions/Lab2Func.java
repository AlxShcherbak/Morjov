package ua.ho.godex.morjov.functions;

import ua.ho.godex.morjov.functions.classes.Lab2XFxIteration;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alx Shcherbak on 22.03.2015.
 */
public class Lab2Func {
    private List<Double> parameterList = new ArrayList<Double>();
    private List<Double> resultList = new ArrayList<Double>();
    private List<Long> fibonacciList = new ArrayList<Long>();
    private final Double goldenCut = 1.618d;

    /**
     * Нахождение экстремума по методу Фибоначчи
     *
     * @param start    - начало отрезка для нахождения экстремума
     * @param end    - конец отрезка для нахождения экстремума
     * @param iteration    - количество проводимых итераций
     * @return - результат точка экстремума, значение функции и количиство итераций
     */
    public Lab2XFxIteration fibonacci(Double start, Double end, Double iteration) {
        new VariantSet().setEnterArrayListsVariant19(this.parameterList, this.resultList);
        if (!this.fibonacciList.isEmpty() | (this.fibonacciList.size() < iteration)) {
            fibonacciNumbers(iteration.longValue());
        }

        double x1, x2, a = start,
                b = end;
        int iterator = iteration.intValue();
        x1 = a + (b - a) * fibonacciList.get(iterator - 3) /
                fibonacciList.get(iterator - 1);
        x2 = a + (b - a) * fibonacciList.get((int) (iteration.longValue() - 2)) /
                fibonacciList.get((int) (iteration.longValue() - 1));


        return fibonacciRecursive(a, b, x1, x2, iterator);
    }

    /**
     * @param a                  - начало отрезка
     * @param b                  - конец отрезка
     * @param x1                 - составное слогаемое границы с учетом чисел Фибоначчи
     * @param x2                 - составное слогаемое границы с учетом чисел Фибоначчи
     * @param iterator           - количество итераций для выполнения
     * @return
     */
    private Lab2XFxIteration fibonacciRecursive(double a, double b, double x1, double x2, int iterator) {
        iterator--;
        Lab2XFxIteration fibonacciRecursiveReturn;
        if (new Lab1Func().doInterpolationEnterValues(x1) > (new Lab1Func().doInterpolationEnterValues(x2))) {
            a = x1;
            x1 = x2;
            x2 = b - (x1 - a);
        } else {
            b = x2;
            x2 = x1;
            x1 = a + (b - x2);
        }

        if (iterator == 1) {
            fibonacciRecursiveReturn = new Lab2XFxIteration(x1, new Lab1Func().doInterpolationEnterValues(x1));
        } else fibonacciRecursiveReturn = fibonacciRecursive(a, b, x1, x2, iterator);
        return fibonacciRecursiveReturn;
    }

    /**
     * Нахождение экстремума по методу золотого сечения
     *
     * @param start    - начало отрезка для нахождения экстремума
     * @param end    - конец отрезка для нахождения экстремума
     * @param deviation    - погрешность при нахождении экстремума
     * @return - результат точка экстремума, значение функции и количиство итераций
     */
    public Lab2XFxIteration goldenCut(Double start, Double end, Double deviation) {
        new VariantSet().setEnterArrayListsVariant19(this.parameterList, this.resultList);
        Lab2XFxIteration goldenCutReturn;
        double x1, x2;

        x1 = end - (end - start) / goldenCut;
        x2 = start + (end - start) / goldenCut;


        if ((new Lab1Func().doInterpolationEnterValues(x1)) >=
                (new Lab1Func().doInterpolationEnterValues(x2))) {
            if (deviation > Math.abs(end - x1)) {
                goldenCutReturn = new Lab2XFxIteration((x1 + end) / 2,
                        new Lab1Func().doInterpolationEnterValues((x1 + end) / 2));
            } else {
                goldenCutReturn = goldenCut(x1, end, deviation);
            }
        } else {
            if (deviation > Math.abs(x2 - start)) {
                goldenCutReturn = new Lab2XFxIteration((start + x2) / 2,
                        new Lab1Func().doInterpolationEnterValues((start + x2) / 2));
            } else {
                goldenCutReturn = goldenCut(start, x2, deviation);
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
