package ua.ho.godex.morjov.functions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alx Shcherbak on 22.03.2015.
 */
public class VariantSet {

    /**
     * „I„~„y„ˆ„y„p„|„y„x„p„ˆ„y„‘ „r„‡„€„t„~„„‡ „}„p„ƒ„ƒ„y„r„€„r „x„~„p„‰„u„~„y„z
     * „B„p„‚„y„p„~„„ ‡‚19
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
}
