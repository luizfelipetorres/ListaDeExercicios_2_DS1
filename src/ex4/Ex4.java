package ex4;

import ex1.Ex1;
import utils.Utils;

import java.util.Scanner;

public class Ex4 extends Utils {
    private int n;
    public Ex4() {
        n = getInt("Digite um número inteiro: ");
    }

    public boolean isPair(){
        return (n % 2 == 0) ? true : false;
    }

    @Override
    public String toString() {
        return n + (isPair() ? " É par" : " É impar");
    }
}
