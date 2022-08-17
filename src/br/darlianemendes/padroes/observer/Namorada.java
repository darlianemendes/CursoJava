package br.darlianemendes.padroes.observer;

public class Namorada implements ObservadorChegadaAniversariante {

    public void chegou(EventoChegadaAniversariante evento) {
        System.out.println("Avisar os convidados...");
        System.out.println("Apagar as Luzes...");
        System.out.println("Esperar um Pouco...");
        System.out.println("Surpresa!!!");
    }
}
