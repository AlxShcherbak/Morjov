package functions;

import java.util.List;

/**
 * Created by Alx Shcherbak on 22.03.2015.
 */
public class VariantSet {
    /**
     * Инициализация входных массивов значений
     * Вариант №19
     */

    protected void setEnterArrayListsVariant19(List<Double> startParamOneArrayList, List<Double> resultArrayList) {
        startParamOneArrayList.add((double) 0);
        startParamOneArrayList.add(0.125);
        startParamOneArrayList.add(0.25);
        startParamOneArrayList.add(0.375);
        startParamOneArrayList.add(0.5);
        startParamOneArrayList.add(0.625);
        startParamOneArrayList.add(0.75);
        startParamOneArrayList.add(0.875);
        startParamOneArrayList.add(1.0);
        startParamOneArrayList.add(1.5);

        resultArrayList.add((double) 9850);
        resultArrayList.add((double) 8850);
        resultArrayList.add((double) 8070);
        resultArrayList.add((double) 7370);
        resultArrayList.add((double) 6850);
        resultArrayList.add((double) 6330);
        resultArrayList.add((double) 5800);
        resultArrayList.add((double) 5270);
        resultArrayList.add((double) 4750);
        resultArrayList.add((double) 4000);
    }

    protected void setEnterArrayListsVariant19(List<Double> startParamOneArrayList, List<Double> startParamTwoArrayList, List<Double> resultArrayList) {
        startParamOneArrayList.add((double) 0);
        startParamOneArrayList.add(0.125);
        startParamOneArrayList.add(0.25);
        startParamOneArrayList.add(0.375);
        startParamOneArrayList.add(0.5);
        startParamOneArrayList.add(0.625);
        startParamOneArrayList.add(0.75);
        startParamOneArrayList.add(0.875);
        startParamOneArrayList.add(1.0);
        startParamOneArrayList.add(1.5);

        startParamTwoArrayList.add((double) 0);
        startParamTwoArrayList.add((double) 2);
        startParamTwoArrayList.add((double) 4);
        startParamTwoArrayList.add((double) 6);
        startParamTwoArrayList.add((double) 8);
        startParamTwoArrayList.add((double) 10);
        startParamTwoArrayList.add((double) 12);

        resultArrayList.add((double) 9850);
        resultArrayList.add((double) 8850);
        resultArrayList.add((double) 8070);
        resultArrayList.add((double) 7370);
        resultArrayList.add((double) 6850);
        resultArrayList.add((double) 6330);
        resultArrayList.add((double) 5800);
        resultArrayList.add((double) 5270);
        resultArrayList.add((double) 4750);
        resultArrayList.add((double) 4000);
    }
}
