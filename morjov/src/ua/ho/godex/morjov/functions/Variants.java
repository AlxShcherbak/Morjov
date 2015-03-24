package ua.ho.godex.morjov.functions;

import android.util.Pair;
import ua.ho.godex.morjov.myPair;

import java.util.*;

/**
 * Created by godex on 24.03.2015.
 */
public class Variants {
    static List<myPair> getLab1Data(int variant) {
        List<myPair> returnHashMap=new ArrayList<>();
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
                throw new IllegalArgumentException("Variant '"+variant+"' not found");
        }
        return returnHashMap;
    }

}
