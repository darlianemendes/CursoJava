package br.darlianemendes.projeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {

    public static void main(String[] args) {

        List<Livro> biblioteca = new ArrayList<>();
        Livro l1 = new Livro("As 5 Línguagens do Amor", 1, "Robert Dolirou", "Auto ajuda");
        biblioteca.add(l1);


        biblioteca.add(new Livro("Segredos da Mente Milionária", 2, "Denis Coelho", "Investimentos"));
        biblioteca.add(new Livro("Do Mil ao Milhão", 3, " Robson Increver", "Investimentos"));
        biblioteca.add(new Livro("Casais Inteligentes Enriquecem Juntos", 4, "Dolores Rosque", "Investimentos"));
        biblioteca.add(new Livro("A Sutil Arte de Ligar o Foda-se", 5, " Wanderson Fluire", "Auto ajuda"));
        biblioteca.add(new Livro("A Única Coisa", 6, "Luana Estrela", "Auto ajuda"));


        Scanner escolhaSecao = new Scanner(System.in);
        System.out.println("Qual seção de livros você deseja escolher?");
        String secaoEscolhida = escolhaSecao.nextLine();

        System.out.println("Voce pode escolher entre:");

        for (Livro livro : biblioteca) {
            if (livro.getSecao().equals(secaoEscolhida)) {
                System.out.printf("\n%d - %s \n", livro.getId(), livro.getTitulo());
            }
        }


        Scanner escolha = new Scanner(System.in);
        System.out.println("Qual Livro tem interesse?\n ");
        Integer livroEscolhido = escolha.nextInt();

        for (Livro livro : biblioteca) {
            if (livro.getId().equals(livroEscolhido)) {
                System.out.printf("O livro escolhido foi: %s \n", livro.getTitulo());

            }
        }

        System.out.println("Qual informação você precisa da Biblioteca");
        escolha.close();
    }
}


