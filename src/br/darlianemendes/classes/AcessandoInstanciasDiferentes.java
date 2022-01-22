package br.darlianemendes.classes;

public class AcessandoInstanciasDiferentes {

    int a = 3;
    static int b = 4;

    public static void main (String [] args){

        AcessandoInstanciasDiferentes c = new AcessandoInstanciasDiferentes();
        System.out.println(c.a);

        System.out.println(b);
    }
}
