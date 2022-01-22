package br.darlianemendes.fundamentos;

public class TiposPrimitivos {

    public static void main (String [] args){
        //Informações funcionários

        //tipos numéricos inteiros
        byte anosDeEmpresa = 23;
        short numerosDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_134_845_223L;
        double vendasAcumuladas = 2_991_103.01;

        //Tipos numericos reais
        float salario = 11_445.44F;

        //Tipo booleano
        boolean estarDeFerias = false; // ou true

        //tipo caracter
        char status = 'A';

        //Dias de empresa
        System.out.println(anosDeEmpresa * 365);

        //Números de viagens
        System.out.println(numerosDeVoos /2);

        //Pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);


        System.out.println(id + ": ganha -> " + salario);
        System.out.println("O funcionario possui Férias?" + estarDeFerias);
        System.out.println("Status: " + status);


    }
}
