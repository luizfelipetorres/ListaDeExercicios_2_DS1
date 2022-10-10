package ex4;

import utils.Utils;

import java.util.Scanner;

public class Ex4 extends Utils {
    private double vCompra;
    private double pDesconto;

    public Ex4() {
        vCompra = getDouble("Digite o valor da compra: ");
        pDesconto = getDouble("Digite o percentual de desconto: ");
    }

    private double valorFinal() {
        return vCompra - (vCompra * pDesconto);
    }

    @Override
    public String toString() {
        return new String().format("O valor R$ %.2f com %.2f de desconto é de R$ %.2f",
                vCompra, pDesconto, valorFinal());
    }
}
