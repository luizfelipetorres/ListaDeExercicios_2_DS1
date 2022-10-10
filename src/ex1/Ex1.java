package ex1;

import java.util.Scanner;

public class Ex1 {
    protected int n;

    public Ex1(Scanner s) {
        System.out.printf("Digite um numero inteiro: ");
        this.n = s.nextInt();
    }

    /**
     * Compara dois valores e diz se o primeiro é menor, maior ou igual ao segundo
     * @param comparator o numero que será comparado
     * @return 1 se n > comparator, -1 se n < comparator e 0 se n == comparator
     */
    protected int comparator(int comparator){
        if (n > comparator)
            return 1;
        else if (n < comparator)
            return -1;
        return 0;
    }

    protected String result (){
        if (n > 0)
            return "positivo";
        else if (n == 0)
            return Integer.toString(0);
        return "negativo";
    }

    @Override
    public String toString() {
        return "O numero digitado é " + result();
    }
}
