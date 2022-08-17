package br.darlianemendes.fundamentosLivro;

import java.util.Scanner;

public class EstudoBasico5 {


    public static void main (String[] args){

        Scanner valorRecebido = new Scanner(System.in);
        System.out.printf("Digite seu salario: R$\n");
        double salario = valorRecebido.nextDouble();

        System.out.println("Digite o percentual de aumento:");
        int percentualAumento = valorRecebido.nextInt();

        double valorDoAumento = salario + salario * percentualAumento/100;

        System.out.println("O percentual de aumento foi de: " + percentualAumento+ "%");
        System.out.println("O seu novo salario sera de: R$" + valorDoAumento);

        valorRecebido.close();
    }
}
