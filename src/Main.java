
import ex1.Ex1;
import ex2.Ex2;
import ex3.Ex3;
import ex4.Ex4;
import ex5.Ex5;
import ex6.Ex6;
import ex7.Ex7;
import ex8.Ex8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int escolha = -1;

        System.out.println("Bem vindo! ");
        //while (escolha != 0) {
        System.out.println("Selecione o exercicio que quer executar\n");

        for (int i = 1; i < 9; i++)
            System.out.printf("%d - Ex%d\n", i, i);

        System.out.println("Digite 0 para sair");
        System.out.printf("\nSua escolha -> ");
        escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.println(new Ex1());
                break;
            case 2:
                System.out.println(new Ex2());
                break;
            case 3:
                System.out.println(new Ex3());
                break;
            case 4:
                System.out.println(new Ex4());
                break;
            case 5:
                System.out.println(new Ex5());
                break;
            case 6:
                System.out.println(new Ex6());
                break;
            case 7:
                System.out.println(new Ex7());
                break;
            case 8:
                System.out.println(new Ex8());
                break;

        }
        //}

    }


}