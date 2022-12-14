package ex8;

import utils.Utils;

import java.util.Scanner;

public class Ex8 extends Utils {
    private double peso;
    private double altura;

    public Ex8() {
        peso = getDouble("Digite seu peso: ");
        altura = getDouble("Digite sua altura: ");
    }

    private double imc() {
        return peso / (altura * altura);
    }

    @Override
    public String toString() {
        double imc = imc();
        StringBuilder s = new StringBuilder(String.format("Seu imc é de %.2f e vc está ", imc));
        if (imc < 17)
            s.append("muito abaixo do peso");
        else if (imc < 18.5)
            s.append("abaixo do peso");
        else if (imc < 25)
            s.append("com o peso normal");
        else if (imc < 30)
            s.append("acima do peso");
        else if (imc < 35)
            s.append("com obesidade 1");
        else if (imc < 40 )
            s.append("com obesidade 2 (severa)");
        else
            s.append("com obesidade 3 (móbida)");
        return s.toString();

    }
}
