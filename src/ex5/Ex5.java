package ex5;

import utils.Utils;

import java.util.Scanner;

public class Ex5 extends Utils {
    private double cotacao;
    private double dolar;
    public Ex5(){
        dolar = getDouble("Quantos dolares vc tem na carteira? ");
        cotacao = getDouble("Qual é o valor do dólar hoje? ");
    }

    public double real(){
        return dolar * cotacao;
    }

    @Override
    public String toString() {
        return String.format("US$ %.2f equivale a R$ %.2f", dolar, real());
    }
}
