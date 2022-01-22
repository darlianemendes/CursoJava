package br.darlianemendes.operadores;

public class DesafioLogico {

    public static void main (String [] args){
        //Trabalho na terça (V OU F)
        //Trabalho na quinta (V OU F)

        boolean trabalho1 = false;
        boolean trabalho2 = false;

        boolean comprouTV50 = trabalho1 && trabalho2;
        boolean comprouTV30 = trabalho1 ^ trabalho2;
        boolean comprouSorvete = trabalho1 || trabalho2;

        //operador Unário
        boolean maisSaudavel = !comprouSorvete;
        System.out.println("Comprou TV 50\"?" + comprouTV50);
        System.out.println("Comprou TV 30\"?" + comprouTV30);
        System.out.println("Comprou sorvete ?" + comprouSorvete);
        System.out.println("Mais saudável ? " + maisSaudavel);

    }
}
