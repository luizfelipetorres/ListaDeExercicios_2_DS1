package ex6;

import ex5.Ex5;

import java.util.Scanner;

public class Ex6 extends Ex5 {

    public Ex6(Scanner s) {
        super(s);
        while (getAge() <= 0 || getAge() > 150){
            System.out.println("Idade inválida! Tente novamente");
            System.out.printf("Digite a sua idade: ");
            setAge(s.nextInt());
        }
    }
}
