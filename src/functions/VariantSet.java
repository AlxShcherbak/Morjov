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

    /**
     * Инициализация входных массивов значений
     * Вариант №10 Кухтин
     */
    protected void setEnterArrayListsVariant10(List<Double> startParamOneArrayList, List<Double> resultArrayList) {
        if ((startParamOneArrayList.isEmpty()) & (resultArrayList.isEmpty())) {

            startParamOneArrayList.add(0d);
            startParamOneArrayList.add(0.2d);
            startParamOneArrayList.add(0.4d);
            startParamOneArrayList.add(0.6d);
            startParamOneArrayList.add(0.8d);
            startParamOneArrayList.add(1d);
            startParamOneArrayList.add(1.1d);

            resultArrayList.add(-0.0005);
            resultArrayList.add(-0.0008);
            resultArrayList.add(0.00095);
            resultArrayList.add(-0.001);
            resultArrayList.add(-0.0012);
            resultArrayList.add(-0.0014);
            resultArrayList.add(-0.0016);
        }
    }

    protected List<HomeWorkFirstClass> setEnterArrayListsVariant10(List<HomeWorkFirstClass> parametersArrayList) {
        List<Double> paramFirsArrayList = new ArrayList<Double>();
        List<Double> paramSecondArrayList = new ArrayList<Double>();
        ArrayList<Double> resultArrayList = new ArrayList<Double>();


        paramFirsArrayList.add(0d);
        paramFirsArrayList.add(0.2d);
        paramFirsArrayList.add(0.4d);
        paramFirsArrayList.add(0.6d);
        paramFirsArrayList.add(0.8d);
        paramFirsArrayList.add(1d);
        paramFirsArrayList.add(1.1d);

        paramSecondArrayList.add(0d);
        paramSecondArrayList.add(6d);
        paramSecondArrayList.add(9d);
        paramSecondArrayList.add(13d);

        resultArrayList.add(-0.0005);
        resultArrayList.add(-0.001);
        resultArrayList.add(-0.0012);
        resultArrayList.add(-0.0013);

        parametersArrayList.add(new HomeWorkFirstClass(paramFirsArrayList.get(0), paramSecondArrayList, (List<Double>) resultArrayList.clone()));
        resultArrayList.clear();

        resultArrayList.add(-0.0008);
        resultArrayList.add(-0.0012);
        resultArrayList.add(-0.0018);
        resultArrayList.add(-0.002);

        parametersArrayList.add(new HomeWorkFirstClass(paramFirsArrayList.get(1), paramSecondArrayList, (List<Double>) resultArrayList.clone()));
        resultArrayList.clear();

        resultArrayList.add(0.00095);
        resultArrayList.add(-0.0016);
        resultArrayList.add(-0.0022);
        resultArrayList.add(-0.0026);

        parametersArrayList.add(new HomeWorkFirstClass(paramFirsArrayList.get(2), paramSecondArrayList, (List<Double>) resultArrayList.clone()));
        resultArrayList.clear();

        resultArrayList.add(-0.001);
        resultArrayList.add(-0.0019);
        resultArrayList.add(-0.0026);
        resultArrayList.add(-0.00295);

        parametersArrayList.add(new HomeWorkFirstClass(paramFirsArrayList.get(3), paramSecondArrayList, (List<Double>) resultArrayList.clone()));
        resultArrayList.clear();

        resultArrayList.add(-0.0012);
        resultArrayList.add(-0.002);
        resultArrayList.add(-0.0028);
        resultArrayList.add(-0.0032);

        parametersArrayList.add(new HomeWorkFirstClass(paramFirsArrayList.get(4), paramSecondArrayList, (List<Double>) resultArrayList.clone()));
        resultArrayList.clear();

        resultArrayList.add(-0.0014);
        resultArrayList.add(-0.0021);
        resultArrayList.add(-0.0029);
        resultArrayList.add(-0.0033);

        parametersArrayList.add(new HomeWorkFirstClass(paramFirsArrayList.get(5), paramSecondArrayList, (List<Double>) resultArrayList.clone()));
        resultArrayList.clear();

        resultArrayList.add(-0.0016);
        resultArrayList.add(-0.0024);
        resultArrayList.add(-0.0032);
        resultArrayList.add(-0.0039);

        parametersArrayList.add(new HomeWorkFirstClass(paramFirsArrayList.get(6), paramSecondArrayList, (List<Double>) resultArrayList.clone()));
        resultArrayList.clear();


        return parametersArrayList;
    }
}
