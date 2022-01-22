package br.darlianemendes.operadores;

public class Logicos {

    public static void main (String [] args){

        boolean condicao1 = true;
        boolean condica2 = 3 > 7;

        System.out.println(condicao1 && !condica2);
        System.out.println(condicao1 || condica2);
        System.out.println(condicao1 ^ condica2);
        System.out.println(!!condicao1);
        System.out.println(!condica2);

        System.out.println("Tabela verdade E (AND)");
        System.out.println(true && true);
        System.out.println(true && false);
        //System.out.println(false && false);
        //System.out.println(false && true);

        System.out.println("\nTabela verdade OU (OR)");
        //System.out.println(true || true);
        //System.out.println(false || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println("\nTabela verdade OU Exclusivo (XOR)");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        System.out.println("\nTabela verdade NOT");
        System.out.println(!
                true);
        System.out.println(!false);
    }
}
