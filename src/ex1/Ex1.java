package ex1;

import utils.Utils;

import java.util.Scanner;

/**
 * A partir de dois números decimais e efetuar as quatros operações matemáticas básicas,
 * apresentando ao final os resultados obtidos
 */
public class Ex1 extends Utils {
    private double n1;
    private double n2;

    public Ex1() {
        this.n1 = getInt("Digite o primeiro numero: ");
        this.n2 = getInt("Digite o segundo número: ");
    }

    public double sum() {
        return this.getN1() + this.getN2();
    }

    public double subtract() {
        return this.getN1() - this.getN2();
    }

    public double divide() {
        return this.getN1() / this.getN2();
    }

    public double multiply() {
        return this.getN1() * this.getN2();
    }

    @Override
    public String toString() {
        return "Soma: " + this.sum() +
                "\nSubtração: " + this.subtract() +
                "\nDivisão: " + this.divide() +
                "\nMultiplicação: " + this.multiply();

    }

    public double getN1() {
        return n1;
    }

    public double getN2() {
        return n2;
    }
}
