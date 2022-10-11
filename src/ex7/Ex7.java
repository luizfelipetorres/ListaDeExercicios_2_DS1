package ex7;

import utils.Utils;

import java.util.Scanner;

public class Ex7 extends Utils {
    private double metros;

    public Ex7() {
        metros = getDouble("Digite um valor em metros: ");
    }

    private double km() {
        return metros / 1000;
    }

    private double hm() {
        return metros / 100;
    }

    private double dam() {
        return metros / 10;
    }

    private double dm() {
        return metros * 10;
    }

    private double cm() {
        return metros * 100;
    }

    private double mm() {
        return metros * 1000;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("km = " + km());
        s.append(String.format("\nhm = %.2f", hm()));
        s.append(String.format("\ndam = %.2f", dam()));
        s.append(String.format("\ndm = %.2f", dm()));
        s.append(String.format("\ncm = %.2f", cm()));
        s.append(String.format("\nmm = %.2f", mm()));
        return s.toString();
    }
}
