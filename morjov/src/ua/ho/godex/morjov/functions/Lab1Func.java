package ua.ho.godex.morjov.functions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alx Shcherbak on 20.03.2015.
 *
 * @author Alx Shcherbak
 */
public class Lab1Func {
    private List<Double> startParamOneArrayList = new ArrayList<Double>();
    private List<Double> resultArrayList = new ArrayList<Double>();
    /**
     * „U„…„~„{„ˆ„y„‘ „y„~„y„ˆ„y„p„|„y„x„p„ˆ„y„y „„‚„€„r„u„t„u„~„y„‘ „y„~„„„u„‚„„€„|„‘„ˆ„y„y
     *
     * @param inputValue      - „r„‡„€„t„~„p„‘ „r„u„|„y„‰„y„~„p
     * @return - „‚„u„x„…„|„„„„p„„ „y„~„„„u„‚„„€„|„‘„ˆ„y„y
     */
    public Double doInterpolationEnterValues(double inputValue) {
        new VariantSet().setEnterArrayListsVariant13(this.startParamOneArrayList, this.resultArrayList);
        Double returnValue = null;
        if (existenceCheck(inputValue)) {
            return getResult(inputValue);
        }
        Double[] borders = borders(inputValue);
        if (borders[0] != (null)) {
            returnValue = doInterpolation(inputValue, borders);
        }
        return returnValue;
    }
    /**
     * „t„u„q„p„s „}„u„„„€„t
     *
     * @param args - „}„p„ƒ„ƒ„y„r „ƒ„„„‚„€„{ „„€„„„€„{„€„r
     */
    public static void main(String args[]) {
        Lab1Func lab1Func = new Lab1Func();
        //lab1Func.setEnterArrayLists();
        System.out.println(lab1Func.doInterpolationEnterValues(1.2));
        System.out.println(lab1Func);
    }


    /**
     * „P„‚„u„€„q„‚„p„x„€„r„p„~„y„u „{„|„p„ƒ„ƒ„p Lab1Func „r „ƒ„„„‚„€„{„… „t„|„‘ „r„„r„€„t„p
     *
     * @return -   „„‚„u„€„q„‚„p„x„€„r„p„~„„z „{„|„p„ƒ„ƒ Lab1Func „r „ƒ„„„‚„€„{„…
     */
    public String toString() {
        StringBuilder returnString = new StringBuilder();
        returnString.append("„M„p„ƒ„ƒ„y„r „r„‡„€„t„~„€„s„€ 1 „„p„‚„p„}„u„„„‚„p M ");
        for (Double item : this.startParamOneArrayList) {
            returnString.append("- ").append(item).append(" ");
        }
        returnString.append("\n„M„p„ƒ„ƒ„y„r „‚„u„x„…„|„„„„y„‚„…„„‹„u„s„€ „„p„‚„p„}„u„„„‚„p - R ");
        for (Double item : this.resultArrayList) {
            returnString.append("- ").append(item.intValue()).append(" ");
        }
        return returnString.toString();
    }


    /**
     * „B„„r„u„ƒ„„„y „r „„€„|„u „r„„r„€„t„p „ƒ„€„€„q„‹„u„~„y„u
     *
     * @param massage - „ƒ„€„€„q„‹„u„~„y„u „t„|„‘ „r„„r„€„t„p
     */
    private void setMassageToOutputTextField(String massage) {

    }

    /**
     * „O„„‚„u„t„u„|„u„~„y„u „s„‚„p„~„y„ˆ „t„|„‘ „y„~„„„u„‚„„€„|„‘„ˆ„y„y
     *
     * @param inputValue - „r„‡„€„t„~„p„‘ „r„u„|„y„‰„y„~„p
     * @return -   „}„p„ƒ„ƒ„y„r „s„‚„p„~„y„ˆ „t„|„‘ „„‚„€„r„u„t„u„~„y„‘ „y„~„„„u„‚„„€„|„‘„ˆ„y„y
     */
    private Double[] borders(double inputValue) {
        Double[] returnBorders = new Double[2];
        for (int i = 0, j = 1; i < this.startParamOneArrayList.size(); i++, j++) {
            if (((i == 0) & (this.startParamOneArrayList.get(i) > inputValue)) |
                    ((i == this.startParamOneArrayList.size() - 1) && (this.startParamOneArrayList.get(i) < inputValue))) {
                System.out.println("„B„r„u„t„u„~„€„u „x„~„p„‰„u„~„y„u „r„~„u „…„ƒ„|„€„r„~„€„s„€ „}„p„ƒ„ƒ„y„r„p");
                setMassageToOutputTextField("„B„r„u„t„u„~„€„u „x„~„p„‰„u„~„y„u „r„~„u „…„ƒ„|„€„r„~„€„s„€ „}„p„ƒ„ƒ„y„r„p");
                break;
            } else if ((j < startParamOneArrayList.size()) && (this.startParamOneArrayList.get(i) < inputValue) && (this.startParamOneArrayList.get(j) > inputValue)) {
                returnBorders = new Double[]{this.startParamOneArrayList.get(i), this.startParamOneArrayList.get(j)};
                break;
            }
        }
        return returnBorders;
    }

    /**
     * „P„‚„€„r„u„‚„{„p „~„p „ƒ„…„‹„u„ƒ„„„r„€„r„p„~„y„u „r„‡„€„t„~„€„z „r„u„|„y„‰„y„~„ „r „}„p„ƒ„ƒ„y„r„u „…„ƒ„|„€„r„y„z
     *
     * @param inputValue - „r„‡„€„t„~„p„‘ „r„u„|„y„‰„y„~„p
     * @return -   boolean „x„~„p„‰„u„~„y„u „ƒ„…„‹„u„ƒ„„„r„€„r„p„~„y„‘ „r„‡„€„t„~„€„z „r„u„|„y„‰„y„~„ „r „}„p„ƒ„ƒ„y„r„u „…„ƒ„|„€„r„y„z
     * true    -   „ƒ„…„‹„u„ƒ„„„r„…„u„„
     * false   -   „~„u„ƒ„…„‹„u„ƒ„„„r„…„u„„
     */
    private boolean existenceCheck(Double inputValue) {
        for (Double item : this.startParamOneArrayList) {
            if (item.equals(inputValue)) {
                return true;
            }
        }
        return false;
    }

    /**
     * „P„€„|„…„‰„u„~„y„u „‚„u„x„…„|„„„„p„„„p „†„…„~„{„ˆ„y„y„y („ƒ „…„ƒ„|„€„r„y„‘) „„€ „r„‡„€„t„~„€„z „r„u„|„y„‰„y„~„u
     *
     * @param inputValue - „r„‡„€„t„~„p„‘ „r„u„|„y„‰„y„~„p
     * @return - „x„~„p„‰„u„~„y„u „‚„u„x„…„|„„„„p„„„p „t„|„‘ „r„€„t„~„€„z „r„u„|„y„‰„y„~„
     */
    private Double getResult(Double inputValue) {
        Double resultValue = null;
        for (Double item : this.startParamOneArrayList) {
            if (item.equals(inputValue)) {
                resultValue = this.resultArrayList.get(startParamOneArrayList.indexOf(item));
                break;
            }
        }
        return resultValue;
    }

    /**
     * „U„…„~„{„ˆ„y„‘ „„‚„€„r„u„t„u„~„y„‘ „y„~„„„u„‚„„€„|„‘„ˆ„y„y
     *
     * @param inputValue - „r„‡„€„t„~„p„‘ „r„u„|„y„‰„y„~„p
     * @param borders    - „s„‚„p„~„y„ˆ„ „y„~„„„u„‚„„€„|„y„‚„…„u„}„€„s„€ „€„„„‚„u„x„{„p
     * @return -   „‚„u„x„…„|„„„„p„„ „y„~„„„u„‚„„€„|„‘„ˆ„y„y
     */
    private Double doInterpolation(double inputValue, Double[] borders) {
        return (getResult(borders[0]) + ((getResult(borders[1]) - getResult(borders[0])) /
                (borders[1] - borders[0]) * (inputValue - borders[0])));
    }
}