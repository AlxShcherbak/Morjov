package ua.ho.godex.morjov.functions;

import ua.ho.godex.morjov.Trio;
import ua.ho.godex.morjov.myPair;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by godex
 * on  24.03.2015.19:50
 * for Morjov
 */
public class Variants {
    /**
     * @param variant - номер варианта
     * @return - данные(масив)
     */
    static List<myPair> getLab1Data(int variant) {
        List<myPair> returnHashMap = new ArrayList<>();
        System.out.print(variant);
        switch (variant) {
            case 13:
                returnHashMap.add(new myPair(0d, 12000d));
                returnHashMap.add(new myPair(0.125d, 10800d));
                returnHashMap.add(new myPair(0.25d, 9800d));
                returnHashMap.add(new myPair(0.375d, 8850d));
                returnHashMap.add(new myPair(0.5d, 8000d));
                returnHashMap.add(new myPair(0.625d, 7100d));
                returnHashMap.add(new myPair(0.75d, 6250d));
                returnHashMap.add(new myPair(0.875d, 5300d));
                returnHashMap.add(new myPair(1d, 4400d));
                returnHashMap.add(new myPair(1.3d, 4000d));
                break;
            case 19:
                returnHashMap.add(new myPair(0d, 9850d));
                returnHashMap.add(new myPair(0.125d, 8850d));
                returnHashMap.add(new myPair(0.25d, 8070d));
                returnHashMap.add(new myPair(0.375d, 7370d));
                returnHashMap.add(new myPair(0.5d, 6850d));
                returnHashMap.add(new myPair(0.625d, 6330d));
                returnHashMap.add(new myPair(0.75d, 5800d));
                returnHashMap.add(new myPair(0.875d, 5270d));
                returnHashMap.add(new myPair(1d, 4750d));
                returnHashMap.add(new myPair(1.5d, 4000d));
                break;
            default:
                throw new IllegalArgumentException("Variant '" + variant + "' not found");
        }
        return returnHashMap;
    }


    /**
     * Дает домашнее задание
     *
     * @param variant --номер варианта
     * @return данные(масив)
     * @throws Exception возможные ошыбки чтения
     */
    public static List<Trio> getHW1Data(int variant) {
        List<Trio> returnHashMap = new ArrayList<>();
        returnHashMap.add(new Trio(0, 0, 12000));
        returnHashMap.add(new Trio(0, 2, 10050));
        returnHashMap.add(new Trio(0, 4, 12000));
        returnHashMap.add(new Trio(0, 6, 12000));
        returnHashMap.add(new Trio(0, 8, 12000));
        returnHashMap.add(new Trio(0, 10, 12000));
        returnHashMap.add(new Trio(0, 12, 12000));

        return null;
    }

    /**
     * Считывает данные ДЗ с файла
     *
     * @param dataFile --файл с данными
     * @return данные(масив)
     * @throws Exception возможные ошыбки чтения
     */
    public static List<Trio> getHW1Data(File dataFile) throws Exception {
        String cutChar = "\t";// символ розделитель
        List<Trio> returnHashMap = new ArrayList<>();// масив значеній
        List<Double> xString = new ArrayList<>();// набор значений по вертикали
        List<String> tmp = new ArrayList<>();// нарезаная строка
        if (!dataFile.exists())
            throw new IOException("Файл не существует");
        Scanner inScanner = new Scanner(dataFile);
        if (!inScanner.hasNext())
            throw new Exception("Файл пуст");
        for (String str : inScanner.nextLine().split(cutChar)) {            //считать строку столбцов
            str=str.replace(',','.');//замена комы
            if (str.isEmpty())
                continue;
            xString.add(Double.parseDouble(str));            //нарезать строку столбцов
        }
        int posX = 0;
        Double parY;
        while (inScanner.hasNext()) {
            tmp.clear();
            for (String str : inScanner.nextLine().split(cutChar)) {
                tmp.add(str);
            }
            posX=0;
            parY = Double.parseDouble(tmp.remove(0));
            for (String str : tmp) {//розбираем строку
                returnHashMap.add(new Trio(xString.get(posX), parY, Double.parseDouble(str)));
                posX++;
            }
        }
        return returnHashMap;
    }

}
