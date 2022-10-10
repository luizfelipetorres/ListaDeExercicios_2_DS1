package ex4;

import ex1.Ex1;

import java.util.Scanner;

public class Ex4 extends Ex1 {
    public Ex4(Scanner s) {
        super(s);
    }

    public boolean isPair(){
        if (n % 2 == 0)
            return true;
        return false;
    }

    @Override
    public String toString() {
        return n + (isPair() ? " É par" : " É impar");
    }
}
