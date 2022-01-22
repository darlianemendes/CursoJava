package br.darlianemendes.classes;

public class AreaCirc {

    double raio;
    final static double PI = 3.1415;

    AreaCirc(double raioInicial){
        raio = raioInicial;
    }

    double area(){
        return  PI * Math.pow(raio, 2); //Math.pow rario ao quadrado
    }

    static double area(double raio){
        return  PI * Math.pow(raio, 2);
    }
}
