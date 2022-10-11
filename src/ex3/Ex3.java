package ex3;

import ex1.Ex1;
import utils.Utils;

import java.util.Scanner;

public class Ex3 extends Utils {
    private int n2;
    private int n1;

    public Ex3() {
        n1 = getInt("Digite um número inteiro: ");
        n2 = getInt("Digite outro número inteiro: ");
    }

    protected int comparator(int comparator){
        if (n1 > comparator)
            return 1;
        else if (n1 < comparator)
            return -1;
        return 0;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("O ");
        int comparator = comparator(n2);
        if (comparator == -1)
            s.append("segundo é maior");
        else if (comparator == 1)
            s.append("primeiro é maior");
        else
            s.append("primeiro é igual ao segundo");
        return s.toString();
    }
}
