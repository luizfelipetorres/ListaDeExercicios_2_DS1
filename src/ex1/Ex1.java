package ex1;

import utils.Utils;

import java.util.Scanner;

public class Ex1 extends Utils {
    protected int n;

    public Ex1() {
        this.n = getInt("Digite um numero inteiro: ");
    }

    protected String result (){
        if (n > 0)
            return "positivo";
        else if (n == 0)
            return Integer.toString(0);
        return "negativo";
    }

    @Override
    public String toString() {
        return "O numero digitado é " + result();
    }
}
