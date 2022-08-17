package br.darlianemendes.fundamentosLivro;

import java.util.Scanner;

public class Janela {

    public static void main(String[] args){

        Retangulo r;
        r = new Retangulo();
        float altura, largura, area, perimetro;

        Scanner entrada;
        entrada = new Scanner(System.in);

        System.out.println("Digite o valor da altura do retangulo: ");
        r.setAltura(entrada.nextFloat());

        System.out.println("Digite o valor da largura do retangulo: ");
        r.setLargura(entrada.nextFloat());

        mostraMensagem("O valor da área é: ", r.calculaArea());
        mostraMensagem("O valor do perímetro é: ", r.calcularPerimetro() );
    }

    public static void mostraMensagem(String msg, float vlr){
        System.out.println(msg + vlr);
    }
}
