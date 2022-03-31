package br.darlianemendes.projeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroDeLivros {

    public static void main (String [] args){

        Scanner cadastro = new Scanner(System.in);
        System.out.println("Qual livro deseja cadastrar?");
        String cadastroFeito = cadastro.nextLine();

        List<LivroCadastrado> biblioteca = new ArrayList<>();
        biblioteca.add(new LivroCadastrado(cadastro.nextLine()));


    }
}
