package ex6;

import ex5.Ex5;

import java.util.Scanner;

public class Ex6 extends Ex5 {

    public Ex6() {
        super();
        while (getAge() <= 0 || getAge() > 150)
            setAge(getInt("Idade inválida! Tente novamente\nDigite a sua idade: "));
    }
}
