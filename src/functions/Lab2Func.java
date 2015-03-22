package functions;

import functions.classes.Lab2XFxIteration;

import java.util.List;

/**
 * Created by Alx Shcherbak on 22.03.2015.
 */
public class Lab2Func {
    List<Double> parameterList;
    List<Double> resultList;
    final Double goldenCut = 1.618d;

    /**
     * Нахождение экстремума по методу Фибоначчи
     *
     * @param inputValue1 - начало отрезка для нахождения экстремума
     * @param inputValue2 - конец отрезка для нахождения экстремума
     * @param inputValue3 - погрешность при нахождении экстремума
     * @return - результат точка экстремума, значение функции и количиство итераций
     */
    public Lab2XFxIteration fibonacci(Double inputValue1, Double inputValue2, Double inputValue3) {
        new VariantSet().setEnterArrayListsVariant19(this.parameterList, this.resultList);
        Lab2XFxIteration fibonacciReturn = null;

        return fibonacciReturn;
    }

    /**
     * Нахождение экстремума по методу золотого сечения
     *
     * @param inputValue1 - начало отрезка для нахождения экстремума
     * @param inputValue2 - конец отрезка для нахождения экстремума
     * @param inputValue3 - погрешность при нахождении экстремума
     * @return - результат точка экстремума, значение функции и количиство итераций
     */
    public Lab2XFxIteration goldenCut(Double inputValue1, Double inputValue2, Double inputValue3) {
        new VariantSet().setEnterArrayListsVariant19(this.parameterList, this.resultList);
        Lab2XFxIteration goldenCutReturn = null;

        return goldenCutReturn;
    }
}
