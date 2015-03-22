package controllers;

import functions.HomeWork1;
import functions.Lab1Func;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * Created by Alx Shcherbak on 20.03.2015.
 *
 * @author Alx Shcherbak
 */
public class ControllerToFxml {
    public Button doInputValue;
    public Button doInputValueHW;
    public TextField inputTextField;
    public TextField outputTextField;
    public TextField outputTextFieldHW;
    public TextField inputTextField1HW;
    public TextField inputTextField2HW;

    /**
     * @param actionEvent
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
                outputTextField.setText(String.valueOf(resultInterpolation));
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
            String inputValueString1 = new String(inputTextField1HW.getText());
            String inputValueString2 = new String(inputTextField2HW.getText());
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
}
