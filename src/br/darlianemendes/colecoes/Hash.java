package br.darlianemendes.colecoes;

import java.util.HashSet;

public class Hash {

    public static void main(String [] args){

        HashSet<Usuario> usuarios = new HashSet<Usuario>();

        usuarios.add(new Usuario("PEDRO"));
        usuarios.add(new Usuario("ANA"));
        usuarios.add(new Usuario("Guilherme"));

        boolean resultado = usuarios.contains(new Usuario("Guilherme"));
        System.out.println(resultado);

    }
}
