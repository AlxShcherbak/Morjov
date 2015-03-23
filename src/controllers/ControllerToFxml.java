package controllers;

import functions.HomeWork1;
import functions.Lab1Func;
import functions.Lab2Func;
import functions.classes.Lab2XFxIteration;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
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
    public TextField inputTextField;
    public TextField outputTextField;
    public TextField outputTextFieldHW;
    public TextField inputTextField1HW;
    public TextField inputTextField2HW;
    public Button doInputValueLab2;
    public TextField inputStartDiap;
    public TextField inputEndDiap;
    public TextField inputDelta;
    public javafx.scene.control.ChoiceBox choiceBoxLab2;
    public TextField outputLab2ErrorLog;
    public TextField outputLab2IteratNum;
    public TextField outputLab2FX;
    public TextField outputLab2X;
    public Tab tabLab1;
    public Tab tabHW;
    public Tab tabLab2;

    public void initialize(URL url, ResourceBundle rb) {
        choiceBoxLab2.setItems(FXCollections.observableArrayList(
                        "Золотое сечение", "Фибоначчи")
        );
        //tabLab2.setDisable(true);
    }

    /**
     * @param actionEvent - ожидание действия на форме fxml
     * @throws java.lang.NumberFormatException - исключение конвертации текста в цыфру
     */
    public void doInputValue(ActionEvent actionEvent) {
        outputTextField.clear();
        outputTextField.setAlignment(Pos.CENTER);
        if (!inputTextField.getText().isEmpty()) {
            String inputValueString = inputTextField.getText();
            try {
                double inputValueDouble = Double.parseDouble(inputValueString);
                Double resultInterpolation = new Lab1Func().doInterpolationEnterValues(inputValueDouble, outputTextField);
                if (resultInterpolation != null) {
                    outputTextField.setText(String.valueOf(resultInterpolation));
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
        outputTextFieldHW.setAlignment(Pos.CENTER);
        if (!(inputTextField1HW.getText().isEmpty() & inputTextField2HW.getText().isEmpty())) {
            String inputValueString1 = inputTextField1HW.getText();
            String inputValueString2 = inputTextField2HW.getText();
            try {
                Double resultInterpolation = new HomeWork1().doInterpolationEnterValues(Double.parseDouble(inputValueString1),
                        Double.parseDouble(inputValueString2), outputTextFieldHW);
                outputTextFieldHW.setText(String.valueOf(resultInterpolation));
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
        outputLab2ErrorLog.setAlignment(Pos.CENTER);
        if (!choiceBoxLab2.getSelectionModel().isEmpty()) {
            if (!(inputStartDiap.getText().isEmpty() & inputEndDiap.getText().isEmpty() & inputDelta.getText().isEmpty())) {
                String inputValueString1 = inputStartDiap.getText();
                String inputValueString2 = inputEndDiap.getText();
                String inputValueString3 = inputDelta.getText();
                Lab2XFxIteration resultValue = null;
                try {
                    if (choiceBoxLab2.getSelectionModel().getSelectedItem().toString().equals("Золотое сечение")) {
                        resultValue = new Lab2Func().goldenCut(Double.parseDouble(inputValueString1),
                                Double.parseDouble(inputValueString2), Double.parseDouble(inputValueString3), outputLab2ErrorLog);
                    } else if (choiceBoxLab2.getSelectionModel().getSelectedItem().toString().equals("Фибоначчи")) {
                        resultValue = new Lab2Func().fibonacci(Double.parseDouble(inputValueString1),
                                Double.parseDouble(inputValueString2), Double.parseDouble(inputValueString3), outputLab2ErrorLog);
                    }
                    System.out.println(resultValue);
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
}
