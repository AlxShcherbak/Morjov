package functions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alx Shcherbak on 22.03.2015.
 */
public class VariantSet {

    public void setEnterArrayListsVariant13(List<Double> startParamOneArrayList, List<Double> resultArrayList) {
        if ((startParamOneArrayList.isEmpty()) & (resultArrayList.isEmpty())) {

            startParamOneArrayList.add(0d);
            startParamOneArrayList.add(0.125d);
            startParamOneArrayList.add(0.25d);
            startParamOneArrayList.add(0.375d);
            startParamOneArrayList.add(0.5d);
            startParamOneArrayList.add(0.625d);
            startParamOneArrayList.add(0.75d);
            startParamOneArrayList.add(0.875d);
            startParamOneArrayList.add(1.0d);
            startParamOneArrayList.add(1.3d);

            resultArrayList.add(12000d);
            resultArrayList.add(10800d);
            resultArrayList.add(9800d);
            resultArrayList.add(8850d);
            resultArrayList.add(8000d);
            resultArrayList.add(7100d);
            resultArrayList.add(6250d);
            resultArrayList.add(5300d);
            resultArrayList.add(4400d);
            resultArrayList.add(4000d);
        }
    }

    /**
     * Инициализация входных массивов значений
     * Вариант №19
     */
    protected void setEnterArrayListsVariant19(List<Double> startParamOneArrayList, List<Double> resultArrayList) {
        if ((startParamOneArrayList.isEmpty()) & (resultArrayList.isEmpty())) {

            startParamOneArrayList.add(0d);
            startParamOneArrayList.add(0.125d);
            startParamOneArrayList.add(0.25d);
            startParamOneArrayList.add(0.375d);
            startParamOneArrayList.add(0.5d);
            startParamOneArrayList.add(0.625d);
            startParamOneArrayList.add(0.75d);
            startParamOneArrayList.add(0.875d);
            startParamOneArrayList.add(1.0d);
            startParamOneArrayList.add(1.5d);

            resultArrayList.add(9850d);
            resultArrayList.add(8850d);
            resultArrayList.add(8070d);
            resultArrayList.add(7370d);
            resultArrayList.add(6850d);
            resultArrayList.add(6330d);
            resultArrayList.add(5800d);
            resultArrayList.add(5270d);
            resultArrayList.add(4750d);
            resultArrayList.add(4000d);
        }
    }

    protected List<HomeWorkFirstClass> setEnterArrayListsVariant19(List<HomeWorkFirstClass> parametersArrayList) {
        List<Double> paramFirsArrayList = new ArrayList<Double>();
        List<Double> paramSecondArrayList = new ArrayList<Double>();
        ArrayList<Double> resultArrayList = new ArrayList<Double>();

        paramFirsArrayList.add(0d);
        paramFirsArrayList.add(0.125d);
        paramFirsArrayList.add(0.25d);
        paramFirsArrayList.add(0.375d);
        paramFirsArrayList.add(0.5d);
        paramFirsArrayList.add(0.625d);
        paramFirsArrayList.add(0.75d);
        paramFirsArrayList.add(0.875d);
        paramFirsArrayList.add(1.0d);
        paramFirsArrayList.add(1.5d);

        paramSecondArrayList.add(0d);
        paramSecondArrayList.add(2d);
        paramSecondArrayList.add(4d);
        paramSecondArrayList.add(6d);
        paramSecondArrayList.add(8d);
        paramSecondArrayList.add(10d);
        paramSecondArrayList.add(12d);

        resultArrayList.add((double) 9850);
        resultArrayList.add((double) 8300);
        resultArrayList.add((double) 6630);
        resultArrayList.add((double) 5350);
        resultArrayList.add((double) 4000);
        resultArrayList.add((double) 3700);
        resultArrayList.add((double) 2160);

        parametersArrayList.add(new HomeWorkFirstClass(paramFirsArrayList.get(0), paramSecondArrayList, (List<Double>) resultArrayList.clone()));
        resultArrayList.clear();

        resultArrayList.add((double) 8850);
        resultArrayList.add((double) 7750);
        resultArrayList.add((double) 6380);
        resultArrayList.add((double) 5230);
        resultArrayList.add((double) 4000);
        resultArrayList.add((double) 3620);
        resultArrayList.add((double) 2220);

        parametersArrayList.add(new HomeWorkFirstClass(paramFirsArrayList.get(1), paramSecondArrayList, (List<Double>) resultArrayList.clone()));
        resultArrayList.clear();

        resultArrayList.add((double) 8070);
        resultArrayList.add((double) 7200);
        resultArrayList.add((double) 6120);
        resultArrayList.add((double) 5100);
        resultArrayList.add((double) 4000);
        resultArrayList.add((double) 3600);
        resultArrayList.add((double) 2280);

        parametersArrayList.add(new HomeWorkFirstClass(paramFirsArrayList.get(2), paramSecondArrayList, (List<Double>) resultArrayList.clone()));
        resultArrayList.clear();

        resultArrayList.add((double) 7370);
        resultArrayList.add((double) 6670);
        resultArrayList.add((double) 5850);
        resultArrayList.add((double) 5000);
        resultArrayList.add((double) 4000);
        resultArrayList.add((double) 3550);
        resultArrayList.add((double) 2340);

        parametersArrayList.add(new HomeWorkFirstClass(paramFirsArrayList.get(3), paramSecondArrayList, (List<Double>) resultArrayList.clone()));
        resultArrayList.clear();

        resultArrayList.add((double) 6850);
        resultArrayList.add((double) 6250);
        resultArrayList.add((double) 5600);
        resultArrayList.add((double) 4850);
        resultArrayList.add((double) 4000);
        resultArrayList.add((double) 3450);
        resultArrayList.add((double) 2400);

        parametersArrayList.add(new HomeWorkFirstClass(paramFirsArrayList.get(4), paramSecondArrayList, (List<Double>) resultArrayList.clone()));
        resultArrayList.clear();

        resultArrayList.add((double) 6330);
        resultArrayList.add((double) 5850);
        resultArrayList.add((double) 5370);
        resultArrayList.add((double) 4750);
        resultArrayList.add((double) 4000);
        resultArrayList.add((double) 3400);
        resultArrayList.add((double) 2470);

        parametersArrayList.add(new HomeWorkFirstClass(paramFirsArrayList.get(5), paramSecondArrayList, (List<Double>) resultArrayList.clone()));
        resultArrayList.clear();

        resultArrayList.add((double) 5800);
        resultArrayList.add((double) 5450);
        resultArrayList.add((double) 5170);
        resultArrayList.add((double) 4650);
        resultArrayList.add((double) 4000);
        resultArrayList.add((double) 3350);
        resultArrayList.add((double) 2530);

        parametersArrayList.add(new HomeWorkFirstClass(paramFirsArrayList.get(6), paramSecondArrayList, (List<Double>) resultArrayList.clone()));
        resultArrayList.clear();

        resultArrayList.add((double) 5270);
        resultArrayList.add((double) 5050);
        resultArrayList.add((double) 4950);
        resultArrayList.add((double) 4550);
        resultArrayList.add((double) 4000);
        resultArrayList.add((double) 3270);
        resultArrayList.add((double) 2620);

        parametersArrayList.add(new HomeWorkFirstClass(paramFirsArrayList.get(7), paramSecondArrayList, (List<Double>) resultArrayList.clone()));
        resultArrayList.clear();

        resultArrayList.add((double) 4750);
        resultArrayList.add((double) 4650);
        resultArrayList.add((double) 4750);
        resultArrayList.add((double) 4450);
        resultArrayList.add((double) 4000);
        resultArrayList.add((double) 3200);
        resultArrayList.add((double) 2710);

        parametersArrayList.add(new HomeWorkFirstClass(paramFirsArrayList.get(8), paramSecondArrayList, (List<Double>) resultArrayList.clone()));
        resultArrayList.clear();

        resultArrayList.add((double) 4000);
        resultArrayList.add((double) 3600);
        resultArrayList.add((double) 3400);
        resultArrayList.add((double) 3100);
        resultArrayList.add((double) 3000);
        resultArrayList.add((double) 28000);
        resultArrayList.add((double) 2200);

        parametersArrayList.add(new HomeWorkFirstClass(paramFirsArrayList.get(9), paramSecondArrayList, (List<Double>) resultArrayList.clone()));
        resultArrayList.clear();

        return parametersArrayList;
    }
}
