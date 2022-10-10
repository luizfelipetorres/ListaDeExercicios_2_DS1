package ex2;

import ex1.Ex1;

import java.util.Scanner;

public class Ex2 extends Ex1 {

    public Ex2(Scanner s) {
        super(s);
    }

    private String result(int comparado){
        if (n > comparado)
            return ">";
        else if (n < comparado)
            return "<";
        return "==";
    }

    @Override
    public String toString() {
        return String.format("n %s 10", result(10), n);
    }
}
