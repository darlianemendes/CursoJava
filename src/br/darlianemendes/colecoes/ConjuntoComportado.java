package br.darlianemendes.colecoes;

import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

    public static void main (String [] args){

        //Set<String> listaAprovados = new HashSet<String>();
        SortedSet<String> listaAprovados = new TreeSet<String>();
        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Luca");
        listaAprovados.add("Pedro");

        for(String candidato: listaAprovados ){
            System.out.println(candidato);
        }
    }
}
