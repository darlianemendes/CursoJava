package br.darlianemendes.excecao;

import java.util.Scanner;

public class CalculoDeConsumo {

    public static void main( String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do salario Minimo: ");
        double salario = scanner.nextDouble();

        System.out.println("Digite o de Quilowatt consumido: ");
        int quantidadeGasta = scanner.nextInt();

        final double valorQuilowatt = salario * 0.1;
        final double valorPago = quantidadeGasta * valorQuilowatt;
        final double valorDesconto = valorPago - valorPago * 0.15;

        System.out.println("O valor do quilowatt e: " + valorQuilowatt);
        System.out.println("O valor a ser pago gastando o Quilowatt informado e: " + valorPago);
        System.out.println("O valor a ser pago com 15% de desconto e: " + valorDesconto);
    }
}
