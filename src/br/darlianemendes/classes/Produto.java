package br.darlianemendes.classes;

public class Produto {

    String nome;
    double preco;
    static double desconto;

     Produto(){

     }

     Produto(String nomeInicial, double preco1){
         nome = nomeInicial;
         preco = preco1;
     }

     double precoComDesconto(){
         return preco * (1 - desconto);
     }

     double precoComDesconto(double descontoDoGerente){
         return preco * (1 - desconto + descontoDoGerente);
     }
}
