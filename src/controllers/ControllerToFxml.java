package controllers;

import functions.HomeWorkFirstRealization;
import functions.Lab1Func;
import functions.Lab2Func;
import functions.Lab3Funk;
import functions.classes.LabXFxIteration;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Alx Shcherbak on 20.03.2015.
 *
 * @author Alx Shcherbak
 */
public class ControllerToFxml implements Initializable {
    public Button doInputValue;
    public Button doInputValueHW;
    public Button doInputValueLab2;
    public TextField inputTextField;
    public TextField outputTextField;
    public TextField outputTextFieldHW;
    public TextField inputTextField1HW;
    public TextField inputTextField2HW;
    public TextField inputStartDiap;
    public TextField inputEndDiap;
    public TextField inputDelta;
    public TextField outputLab2ErrorLog;
    public TextField outputLab2IteratNum;
    public TextField outputLab2FX;
    public TextField outputLab2X;
    public javafx.scene.control.ChoiceBox<String> choiceBoxLab2;
    public Tab tabLab1;
    public Tab tabHW;
    public Tab tabLab2;
    public TextField inputStart;
    public TextField inputEps;
    public Button doInputValueLab3;
    public TextField outputLab3X1;
    public TextField outputLab3FX1;
    public TextField outputLab3Iterat;
    public TextField outputLab3ErrorLog;

    public void initialize(URL url, ResourceBundle rb) {
        choiceBoxLab2.setItems(FXCollections.observableArrayList(
                        "Золотое сечение", "Фибоначчи")
        );
        //tabLab2.setDisable(true);
        tabHW.setDisable(false);
    }

    /**
     * @param actionEvent - ожидание действия на форме fxml
     * @throws java.lang.NumberFormatException - исключение конвертации текста в цыфру
     */
    public void doInputValue(ActionEvent actionEvent) {
        outputTextField.clear();
        if (!inputTextField.getText().isEmpty()) {
            String inputValueString = inputTextField.getText();
            try {
                double inputValueDouble = Double.parseDouble(inputValueString);
                Double resultInterpolation = new Lab1Func().doInterpolationEnterValues(inputValueDouble, outputTextField);
                if (resultInterpolation != null) {
                    outputTextField.setText(String.format("%.5f", resultInterpolation));
                }
            } catch (NumberFormatException e) {                 // Введеное значение не цифра
                System.out.println("Введеное начальное значение не цифра");
                outputTextField.setText("Введеное начальное значение не цифра");
            }
        } else {
            outputTextField.setText("Не введено начальное значение");
            System.out.println("Не введено начальное значение");
        }
    }

    public void doInputValueHW(ActionEvent actionEvent) {
        outputTextFieldHW.clear();
        if (!(inputTextField1HW.getText().isEmpty() & inputTextField2HW.getText().isEmpty())) {
            String inputValueString1 = inputTextField1HW.getText();
            String inputValueString2 = inputTextField2HW.getText();
            try {
                Double resultInterpolation = new HomeWorkFirstRealization().doInterpolationEnterValues(Double.parseDouble(inputValueString1),
                        Double.parseDouble(inputValueString2), outputTextFieldHW);
                if (resultInterpolation != null) {
                    outputTextFieldHW.setText(String.valueOf(resultInterpolation));
                }
            } catch (NumberFormatException e) {                 // Введеное значение не цифра
                System.out.println("Введеное начальное значение не цифра");
                outputTextFieldHW.setText("Введеное начальное значение не цифра");
            }
        } else {
            outputTextFieldHW.setText("Не введено начальное значение");
            System.out.println("Не введено начальное значение");
        }
    }

    public void doInputValueLab2(ActionEvent actionEvent) {
        outputLab2ErrorLog.clear();
        outputLab2X.clear();
        outputLab2FX.clear();
        outputLab2IteratNum.clear();
        if (!choiceBoxLab2.getSelectionModel().isEmpty()) {
            if (!(inputStartDiap.getText().isEmpty() & inputEndDiap.getText().isEmpty() & inputDelta.getText().isEmpty())) {
                String inputValueString1 = inputStartDiap.getText();
                String inputValueString2 = inputEndDiap.getText();
                String inputValueString3 = inputDelta.getText();
                LabXFxIteration resultValue = null;
                try {
                    if (choiceBoxLab2.getSelectionModel().getSelectedItem().equals("Золотое сечение")) {
                        resultValue = new Lab2Func().goldenCut(Double.parseDouble(inputValueString1),
                                Double.parseDouble(inputValueString2), Double.parseDouble(inputValueString3), outputLab2ErrorLog);
                    } else if (choiceBoxLab2.getSelectionModel().getSelectedItem().equals("Фибоначчи")) {
                        resultValue = new Lab2Func().fibonacci(Double.parseDouble(inputValueString1),
                                Double.parseDouble(inputValueString2), Double.parseDouble(inputValueString3), outputLab2ErrorLog);
                    }
                    System.out.println(resultValue);
                    assert resultValue != null;
                    resultValue.printInForm(outputLab2X, outputLab2FX, outputLab2IteratNum);
                } catch (NumberFormatException e) {                 // Введеное значение не цифра
                    System.out.println("Введеное начальное значение не цифра");
                    outputLab2ErrorLog.setText("Введеное начальное значение не цифра");
                }
            } else {
                outputLab2ErrorLog.setText("Не введено начальное значение");
                System.out.println("Не введено начальное значение");
            }
        } else {
            outputLab2ErrorLog.setText("Выберите метод поиска экстремума");
            System.out.println("Не выбран метод поиска экстремума");
        }
    }

    public void doInputValueLab3(ActionEvent actionEvent) {
        outputLab3X1.clear();
        outputLab3FX1.clear();
        outputLab3ErrorLog.clear();
        outputLab3Iterat.clear();
        if (!(inputStart.getText().isEmpty() & inputEps.getText().isEmpty())) {
            String inputValueString1 = inputStart.getText();
            String inputValueString2 = inputEps.getText();
            try {
                LabXFxIteration resultGradient = new Lab3Funk().doGradient(Double.parseDouble(inputValueString1), Double.parseDouble(inputValueString2), outputLab3ErrorLog);
                if (resultGradient != null) {
                    resultGradient.printInForm(outputLab3X1, outputLab3FX1, outputLab3Iterat);
                }
            } catch (NumberFormatException e) {                 // Введеное значение не цифра
                System.out.println("Введеное начальное значение не цифра");
                outputTextFieldHW.setText("Введеное начальное значение не цифра");
            }
        } else {
            outputTextFieldHW.setText("Не введено начальное значение");
            System.out.println("Не введено начальное значение");
        }
    }
}
