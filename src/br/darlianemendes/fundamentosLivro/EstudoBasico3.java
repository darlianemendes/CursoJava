package br.darlianemendes.fundamentosLivro;

import java.util.Scanner;

public class EstudoBasico3 {

    public static void main(String [] args){

        Scanner notas = new Scanner(System.in);

        System.out.println("Digite sua primeira nota e depois seu peso: ");
        double nota1 = notas.nextDouble();
        double peso1 = notas.nextDouble();

        System.out.println("Digite sua segunda nota e depois seu peso: ");
        double nota2 = notas.nextDouble();
        double peso2 = notas.nextDouble();

        System.out.println("Digite sua terceira nota e depois seu peso: \n");
        double nota3 = notas.nextDouble();
        double peso3 = notas.nextDouble();

        double somaDosPesos = peso1 + peso2 + peso3;
        double mediaPonderada = (nota1*peso1 + nota2*peso2 + nota3*peso2) / somaDosPesos;

        System.out.printf("A soma dos pesos foi %s ", somaDosPesos);
        System.out.print("A media ponderada e " + mediaPonderada);

        notas.close();
    }
}
