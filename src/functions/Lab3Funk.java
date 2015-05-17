package functions;

import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alx Shcherbak on 13.05.2015.
 */
public class Lab3Funk {
    private List<Double> startParamOneArrayList = new ArrayList<Double>();
    private List<Double> resultArrayList = new ArrayList<Double>();
    private TextField outputTextField;

    /**
     * ������� ������������� ���������� ������������
     *
     * @param outputTextField - ������� �������� ��������� ����
     * @return - ��������� ������������
     */
    public LabXFxIteration doGradient(double inputValueStart, double inputValueEps, TextField outputTextField) {
        this.outputTextField = outputTextField;
        new VariantSet().setEnterArrayListsVariant19(this.startParamOneArrayList, this.resultArrayList);
        LabXFxIteration returnValue = null;
        Double[] borderStart = new Lab1Func().borders(inputValueStart);
        Double xStart = startValue(inputValueStart);

        int j = startParamOneArrayList.indexOf(xStart);

        double max = 0;
        double grad = 0;
        double grad2 = 0;
        double point = 0;
        int a = 0;
        grad = (resultArrayList.get(j + 1) - resultArrayList.get(j)) /
                Math.abs(startParamOneArrayList.get(j + 1) - startParamOneArrayList.get(j));
        if (grad > 0) {
            a = j / 2 + 1;
        } else a = (startParamOneArrayList.size() - j) / 2;
        int count = 1;

        while (true) {
            grad = (resultArrayList.get(j + 1) - resultArrayList.get(j)) /
                    Math.abs(startParamOneArrayList.get(j + 1) - startParamOneArrayList.get(j));
            if (grad < 0) {
                if (j + a + 2 > startParamOneArrayList.size()) {
                    a /= 2;
                }
                grad2 = (resultArrayList.get(j + a + 1) - resultArrayList.get(j + a)) /
                        Math.abs(startParamOneArrayList.get(j + a + 1) - startParamOneArrayList.get(j + a));
                if (grad2 < 0) {
                    j = j + a;
                } else {
                    a--;
                }
                if (a == 0 || j == startParamOneArrayList.size() - 2) {
                    max = resultArrayList.get(j + 1);
                    point = startParamOneArrayList.get(j + 1);
                    break;
                }
            } else {
                if (j - a < 0) {
                    a /= 2;
                }
                grad2 = (resultArrayList.get(j - a + 1) - resultArrayList.get(j - a)) /
                        Math.abs(startParamOneArrayList.get(j - a + 1) - startParamOneArrayList.get(j - a));
                if (grad2 > 0) {
                    j = j - a;
                } else {
                    a--;
                }
                if (a == 0 || j == 0) {
                    max = resultArrayList.get(j);
                    point = startParamOneArrayList.get(j);
                    break;
                }
            }
            count = count + 1;
        }

        return new LabXFxIteration(point, max, count);
    }

    /**
     * �����������
     *
     * @param inputValue - ������� ��������
     * @return -
     */
    private Double startValue(double inputValue) {
        Double xStart = 0d;
        for (int i = 0, j = 1; j < this.startParamOneArrayList.size(); i++, j++) {
            if (((i == 0) & (this.startParamOneArrayList.get(i) > inputValue)) |
                    ((i == this.startParamOneArrayList.size() - 1) && (this.startParamOneArrayList.get(i) < inputValue))) {
                System.out.println("�������� �������� ��� ��������� �������");
                setMassageToOutputTextField("�������� �������� ��� ��������� �������");
                break;
            } else if ((j < startParamOneArrayList.size()) && (this.startParamOneArrayList.get(i) < inputValue) && (this.startParamOneArrayList.get(j) > inputValue)) {
                xStart = this.startParamOneArrayList.get(i);
                break;
            }
        }
        return xStart;
    }

    /**
     * ������� � ���� ������ ���������
     *
     * @param massage - ��������� ��� ������
     */
    private void setMassageToOutputTextField(String massage) {
        this.outputTextField.setText("�������� �������� ��� ��������� �������");
    }
}
