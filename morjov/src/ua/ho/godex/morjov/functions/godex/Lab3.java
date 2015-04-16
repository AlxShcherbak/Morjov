package ua.ho.godex.morjov.functions.godex;

import ua.ho.godex.morjov.functions.Lab1Func;

/**
 * Created by godex_000
 * on  07.04.2015.19:00
 * for Morjov
 */

/*
http://www.machinelearning.ru/wiki/index.php?title=%D0%9C%D0%B5%D1%82%D0%BE%D0%B4_%D0%B3%D1%80%D0%B0%D0%B4%D0%B8%D0%B5%D0%BD%D1%82%D0%BD%D0%BE%D0%B3%D0%BE_%D1%81%D0%BF%D1%83%D1%81%D0%BA%D0%B0#.D0.9C.D0.B5.D1.82.D0.BE.D0.B4_.D0.BD.D0.B0.D0.B8.D1.81.D0.BA.D0.BE.D1.80.D0.B5.D0.B9.D1.88.D0.B5.D0.B3.D0.BE_.D1.81.D0.BF.D1.83.D1.81.D0.BA.D0.B0

Градиентный метод или
метода Пауэлла

Метод наискорейшего спуска
Упомянем, что метод наискорейшего спуска может иметь трудности в патологических случаях овражных функций,
 так, к примеру, в случае функции Розенброка.
 */
public class Lab3 {
    /**
     * Возвести во 2 степень
     *
     * @param a число что нужно возвести
     * @return a^2
     */
    static Double e2(Double a) {
        return a * a;
    }

    /**
     * @param x1 начальная точка
     * @param h  велечина шага
     * @param e  точность расчетов
     * @return
     */
    public static Double pauel(Double x1, Double h, Double e) {
        Double x_, x2, x3, xmin, fx_, fx1, fx2, fx3, fmin;
        x2 = x1 + h;
        fx1 = new Lab1Func().doInterpolationEnterValues(x1);
        fx2 = new Lab1Func().doInterpolationEnterValues(x2);
        if (fx1 > fx2) {
            x3 = x1 + 2 * h;
        } else {
            x3 = x1 - h;
        }
        fx3 = new Lab1Func().doInterpolationEnterValues(x3);
        fmin = Math.min(fx1, Math.min(fx2, fx3));
        //TODO тут сделать инверсную интерполяцыяю
        xmin = fmin;
        if (((x2 - x3) * fx1 + (x3 - x1) * fx2 + (x1 - x2) * fx3) == 0) {
            pauel(xmin,h,e);
        }else{
            x_ = ((e2(x2)-e2(x3))*fx1+(e2(x3)-e2(x1))*fx2+(e2(x1)-e2(x2))*fx2) / ((x2 - x3) * fx1 + (x3 - x1) * fx2 + (x1 - x2) * fx3);
            fx_=new Lab1Func().doInterpolationEnterValues(x_);

        }
        return 0d;
    }
}
