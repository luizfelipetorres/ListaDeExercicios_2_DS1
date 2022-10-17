package ex5;

import utils.Utils;

import java.util.Scanner;

public class Ex5 extends Utils {
    private int age;

    public Ex5(){
        age = getInt("Digite a sua idade: ");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private boolean isAdult(){
        return (age >= 18) ? true : false;
    }
    @Override
    public String toString() {
        return isAdult() ? "Maior de idade" : "Menor de idade";
    }
}
