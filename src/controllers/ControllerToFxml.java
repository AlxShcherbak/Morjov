package controllers;

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
    public TextField inputTextField;
    public TextField outputTextField;

    /**
     * @param actionEvent
     * @throws NumberFormatException - исключение конвертации текста в цыфру
     */
    public void doInputValue(ActionEvent actionEvent) {
        outputTextField.clear();
        outputTextField.setAlignment(Pos.CENTER);
        if (!inputTextField.getText().isEmpty()) {
            String enterValue = inputTextField.getText();
            try {
                double inputValueDouble = Double.parseDouble(enterValue);
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
}
