package br.darlianemendes.controle;

import java.util.Scanner;

public class If {

    public static void main (String [] args){

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a média: ");
        String media = entrada.next().replace(",", ".");
        double nota = Double.parseDouble(media);

        if(nota <= 10 && nota >=7.10){
            System.out.println("Aprovado!!");
            System.out.println("Parabéns!!");
        }

        if (nota < 7 && nota >= 4.5){
            System.out.println("Recuperação!!");
        }

        boolean criterioReprovacaoAtingindo = nota < 4.5 && nota >= 0;

        if(criterioReprovacaoAtingindo){
            System.out.println("Reprovado!");
            System.out.println("Não desista!");
        }
        entrada.close();
    }
}
