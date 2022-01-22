package br.darlianemendes.fundamentos;

public class Temperatura {

    public static void main (String [] args){

        //(ºF - 32) x 5/9 = ºC
        final double FATOR = 5.0 / 9.0;
        final double AJUSTE = 32;

        double fahrenheit = 86;
        double celcius = ( fahrenheit - AJUSTE);
        System.out.println("O resultado é " + celcius + "ºC");

        fahrenheit = 0;
        celcius = (fahrenheit - AJUSTE) * FATOR;
        System.out.println("O resultado é " + celcius + "ºC");
    }
}
