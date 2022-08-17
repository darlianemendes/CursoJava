package br.darlianemendes.fundamentosLivro;

import java.util.Scanner;

public class EstudoBasico {

    public static void main(String [] args){

        Scanner numeros = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int x = numeros.nextInt();
        System.out.println("Digite um segundo numero inteiro: ");
        int y = numeros.nextInt();
        System.out.println("Digite um terceiro numero inteiro: ");
        int z = numeros.nextInt();
        System.out.println("Digite um quarto numero inteiro: ");
        int w = numeros.nextInt();

        int somaDosNumeros = x + y + z + w;
        System.out.println("A soma dos numeros e " + somaDosNumeros);
        System.out.printf("A soma dos numeros e %s \n", somaDosNumeros);
        System.out.print(somaDosNumeros);

        numeros.close();
    }
}
