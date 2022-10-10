package ex3;

import utils.Utils;

import java.util.Scanner;

public class Ex3 extends Utils {
    private int n1;
    private int n2;

    public Ex3(){
        n1 = getInt("Digite o primeiro número: ");
        n2 = getInt("Digite o segundo número: ");
        this.swap();
    }
    private void swap(){
        n1 = n2 - n1;
        n2 = n2 - n1;
        n1 = n1 + n2;
    }

    @Override
    public String toString() {
        return new StringBuilder("n1 = " + n1 + "\nn2 = " + n2).toString();
    }
}
