package ua.ho.godex.morjov.functions.classes;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alx Shcherbak on 22.03.2015.
 */
public class HomeWorkFirstClass {
    private Double parameterFirst;
    private List<Double> parameterSecondArrayList = new ArrayList<Double>();
    private List<Double> resultArrayList = new ArrayList<Double>();

    public HomeWorkFirstClass(Double parameterFirst, List<Double> parameterSecondArrayList, List<Double> resultArrayList) {
        this.parameterFirst = parameterFirst;
        this.parameterSecondArrayList = parameterSecondArrayList;
        this.resultArrayList = resultArrayList;
    }

    public Double getParameterFirst() {
        return parameterFirst;
    }

    public void setParameterFirst(Double parameterFirst) {
        this.parameterFirst = parameterFirst;
    }

    public List<Double> getParameterSecondArrayList() {
        return parameterSecondArrayList;
    }

    public void setParameterSecondArrayList(List<Double> parameterSecondArrayList) {
        this.parameterSecondArrayList = parameterSecondArrayList;
    }

    public List<Double> getResultArrayList() {
        return resultArrayList;
    }

    public void setResultArrayList(List<Double> resultArrayList) {
        this.resultArrayList = resultArrayList;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("„P„p„‚„p„}„u„„„‚ 1 - ").append(this.parameterFirst).append("\n„P„p„‚„p„}„u„„„‚ 2: \t „Q„u„x„…„|„Ž„„„p„„\n");
        for (Double item : this.parameterSecondArrayList) {
            stringBuilder.append(item.intValue()).append("\t\t\t\t\t").append(this.resultArrayList.get(this.parameterSecondArrayList.indexOf(item))).append("\n");
        }
        return stringBuilder.toString();
    }
}
