package br.darlianemendes.fundamentosLivro;

import java.util.Scanner;

public class EstudoBasico2 {

    public static void main( String [] args){

        Scanner notas = new Scanner(System.in);

        System.out.println("Digite sua primeira nota: ");
        double nota1 = notas.nextDouble();

        System.out.println("Digite sua segunda nota: ");
        double nota2 = notas.nextDouble();

        System.out.println("Digite sua terceira nota: ");
        double nota3 = notas.nextDouble();

        double mediaDeNotas = (nota1 + nota2 + nota3) / 3;

        System.out.println("A media da sua nota e: " + mediaDeNotas);
        System.out.printf("A media da sua nota e %.2f \n", mediaDeNotas);
        System.out.print(mediaDeNotas);

        notas.close();
    }
}
