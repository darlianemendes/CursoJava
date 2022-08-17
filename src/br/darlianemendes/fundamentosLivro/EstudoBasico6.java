package br.darlianemendes.fundamentosLivro;

import java.util.Scanner;

public class EstudoBasico6 {

    public static void main(String [] args){

        Scanner valores = new Scanner(System.in);

        System.out.println("Digite seu salario base");
        double salario = valores.nextDouble();

        double calculoGratificacao = salario * 5/100;

        double calculoImposto = salario * 7/100;

        double salarioRecebido = salario + calculoGratificacao - calculoImposto;

        System.out.println("O salario recebido e: R$" + salarioRecebido);
    }
}
