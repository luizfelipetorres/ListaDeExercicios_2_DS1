package ex6;

import utils.Utils;

import java.util.Scanner;

public class Ex6 extends Utils {
    private double celsius;

    public Ex6() {
        this.celsius = getDouble("Digite a temperatura em celsius");
    }

    private double fahrenheit(){
        return (9 * celsius + 160) / 5;
    }

    @Override
    public String toString() {
        return String.format("%.2f graus Celsius equivale a %.2f fahrenheit", celsius, fahrenheit());
    }
}
