package br.darlianemendes.fundamentosLivro;

import java.util.Scanner;

public class EstudoBasico4 {

    public static void main(String [] args){

        Scanner valor = new Scanner(System.in);

        System.out.println("Digite seu salario");
        double salario = valor.nextDouble();

        double aumentoDeSalario = salario + salario * 25/100;

        System.out.println("Seu salario teve aumento! Parabens!! Sera no valor de R$" + aumentoDeSalario);

        valor.close();
    }
}
