package ex5;

import java.util.Scanner;

public class Ex5 {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Ex5(Scanner s){
        System.out.printf("Digite a sua idade: ");
        age = s.nextInt();
    }

    private boolean isAdult(){
        if (age >= 18)
            return true;
        return false;
    }
    @Override
    public String toString() {
        return isAdult() ? "Maior de idade" : "Menor de idade";
    }
}
