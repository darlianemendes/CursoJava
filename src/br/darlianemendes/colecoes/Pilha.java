package br.darlianemendes.colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

    public static void main (String [] args){

        Deque<String> livros = new ArrayDeque<String>();

        livros.add("O Pequeno Principe");
        livros.push("Don Quixote");
        livros.push("O Hobbit");

        System.out.println(livros.peek());
        System.out.println(livros.element());

        for (String livro: livros) {
            System.out.println(livros);
        }

        System.out.println(livros.pop());
        System.out.println(livros.poll());

        livros.size();
        livros.contains(3);
        livros.clear();


    }
}
