package br.darlianemendes.colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main (String [] args){

        Queue<String> fila = new LinkedList<>();

        //offer e add, adciona elementos na fila.
        //a diferença é no comportamento quando a fila está cheia
        fila.add("Ana"); //retorna false
        fila.offer("Bia"); //lança uma exceção.
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        //peek e element -> obter o proximo elemento da fila sem remover
        //Diferença é o comportamento que ocorre quando a fila está vazia


        System.out.println(fila.peek()); //retorna falso se a fila estiver vazia
        System.out.println(fila.peek());
        System.out.println(fila.element()); //lança uma exeção
        System.out.println(fila.element());

        //fila.size();
        //fila.clear();
        //fila.empty();

        System.out.println(fila.poll());
        System.out.println(fila.remove());

    }
}
