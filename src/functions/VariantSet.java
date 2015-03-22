package functions;

import functions.classes.HomeWorkFirstClass;

import java.util.ArrayList;
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

    protected List<HomeWorkFirstClass> setEnterArrayListsVariant19(List<HomeWorkFirstClass> parametersArrayList) {
        List<Double> paramFirsArrayList = new ArrayList<Double>();
        List<Double> paramSecondArrayList = new ArrayList<Double>();
        ArrayList<Double> resultArrayList = new ArrayList<Double>();

        paramFirsArrayList.add((double) 0);
        paramFirsArrayList.add(0.125);
        paramFirsArrayList.add(0.25);
        paramFirsArrayList.add(0.375);
        paramFirsArrayList.add(0.5);
        paramFirsArrayList.add(0.625);
        paramFirsArrayList.add(0.75);
        paramFirsArrayList.add(0.875);
        paramFirsArrayList.add(1.0);
        paramFirsArrayList.add(1.5);

        paramSecondArrayList.add((double) 0);
        paramSecondArrayList.add((double) 2);
        paramSecondArrayList.add((double) 4);
        paramSecondArrayList.add((double) 6);
        paramSecondArrayList.add((double) 8);
        paramSecondArrayList.add((double) 10);
        paramSecondArrayList.add((double) 12);

        resultArrayList.add((double) 9850);        resultArrayList.add((double) 8300);
        resultArrayList.add((double) 6630);        resultArrayList.add((double) 5350);
        resultArrayList.add((double) 4000);        resultArrayList.add((double) 3700);
        resultArrayList.add((double) 2160);

        parametersArrayList.add(new HomeWorkFirstClass(paramFirsArrayList.get(0), paramSecondArrayList, (List<Double>) resultArrayList.clone()));
        resultArrayList.clear();

        resultArrayList.add((double) 8850);        resultArrayList.add((double) 7750);
        resultArrayList.add((double) 6380);        resultArrayList.add((double) 5230);
        resultArrayList.add((double) 4000);        resultArrayList.add((double) 3620);
        resultArrayList.add((double) 2220);

        parametersArrayList.add(new HomeWorkFirstClass(paramFirsArrayList.get(1), paramSecondArrayList, (List<Double>) resultArrayList.clone()));
        resultArrayList.clear();

        resultArrayList.add((double) 8070);        resultArrayList.add((double) 7200);
        resultArrayList.add((double) 6120);        resultArrayList.add((double) 5100);
        resultArrayList.add((double) 4000);        resultArrayList.add((double) 3600);
        resultArrayList.add((double) 2280);

        parametersArrayList.add(new HomeWorkFirstClass(paramFirsArrayList.get(2), paramSecondArrayList, (List<Double>) resultArrayList.clone()));
        resultArrayList.clear();

        resultArrayList.add((double) 7370);        resultArrayList.add((double) 6670);
        resultArrayList.add((double) 5850);        resultArrayList.add((double) 5000);
        resultArrayList.add((double) 4000);        resultArrayList.add((double) 3550);
        resultArrayList.add((double) 2340);

        parametersArrayList.add(new HomeWorkFirstClass(paramFirsArrayList.get(3), paramSecondArrayList, (List<Double>) resultArrayList.clone()));
        resultArrayList.clear();

        resultArrayList.add((double) 6850);        resultArrayList.add((double) 6250);
        resultArrayList.add((double) 5600);        resultArrayList.add((double) 4850);
        resultArrayList.add((double) 4000);        resultArrayList.add((double) 3450);
        resultArrayList.add((double) 2400);

        parametersArrayList.add(new HomeWorkFirstClass(paramFirsArrayList.get(4), paramSecondArrayList, (List<Double>) resultArrayList.clone()));
        resultArrayList.clear();

        resultArrayList.add((double) 6330);        resultArrayList.add((double) 5850);
        resultArrayList.add((double) 5370);        resultArrayList.add((double) 4750);
        resultArrayList.add((double) 4000);        resultArrayList.add((double) 3400);
        resultArrayList.add((double) 2470);

        parametersArrayList.add(new HomeWorkFirstClass(paramFirsArrayList.get(5), paramSecondArrayList, (List<Double>) resultArrayList.clone()));
        resultArrayList.clear();

        resultArrayList.add((double) 5800);        resultArrayList.add((double) 5450);
        resultArrayList.add((double) 5170);        resultArrayList.add((double) 4650);
        resultArrayList.add((double) 4000);        resultArrayList.add((double) 3350);
        resultArrayList.add((double) 2530);

        parametersArrayList.add(new HomeWorkFirstClass(paramFirsArrayList.get(6), paramSecondArrayList, (List<Double>) resultArrayList.clone()));
        resultArrayList.clear();

        resultArrayList.add((double) 5270);        resultArrayList.add((double) 5050);
        resultArrayList.add((double) 4950);        resultArrayList.add((double) 4550);
        resultArrayList.add((double) 4000);        resultArrayList.add((double) 3270);
        resultArrayList.add((double) 2620);

        parametersArrayList.add(new HomeWorkFirstClass(paramFirsArrayList.get(7), paramSecondArrayList, (List<Double>) resultArrayList.clone()));
        resultArrayList.clear();

        resultArrayList.add((double) 4750);        resultArrayList.add((double) 4650);
        resultArrayList.add((double) 4750);        resultArrayList.add((double) 4450);
        resultArrayList.add((double) 4000);        resultArrayList.add((double) 3200);
        resultArrayList.add((double) 2710);

        parametersArrayList.add(new HomeWorkFirstClass(paramFirsArrayList.get(8), paramSecondArrayList, (List<Double>) resultArrayList.clone()));
        resultArrayList.clear();

        resultArrayList.add((double) 4000);        resultArrayList.add((double) 3600);
        resultArrayList.add((double) 3400);        resultArrayList.add((double) 3100);
        resultArrayList.add((double) 3000);        resultArrayList.add((double) 28000);
        resultArrayList.add((double) 2200);

        parametersArrayList.add(new HomeWorkFirstClass(paramFirsArrayList.get(9), paramSecondArrayList, (List<Double>) resultArrayList.clone()));
        resultArrayList.clear();

        return parametersArrayList;
    }
}
