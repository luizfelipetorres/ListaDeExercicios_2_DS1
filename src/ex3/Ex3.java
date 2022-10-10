package ex3;

import ex1.Ex1;

import java.util.Scanner;

public class Ex3 extends Ex1 {
    private int n2;

    public Ex3(Scanner s) {
        super(s);
        System.out.printf("Digite outro número inteiro: ");
        n2 = s.nextInt();
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
