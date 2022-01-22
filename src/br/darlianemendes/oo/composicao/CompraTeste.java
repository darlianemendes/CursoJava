package br.darlianemendes.oo.composicao;

public class CompraTeste {

    public static void main (String [] args){

        Compra compra1 = new Compra();
        compra1.cliente = "João Pedro";
        compra1.adcionarItem(new Item("Caneta" ,20, 7.45));
        compra1.adcionarItem(new Item("Borracha" ,10, 3.99));
        compra1.adcionarItem(new Item("Caderno" ,3, 18.45));

        System.out.println(compra1.itens.size());
        System.out.println(compra1.obterValorTotal());


        //so para mostrar a relação bidirecional
        double total = compra1.itens.get(0).compra.itens.get(1).compra.obterValorTotal();
        System.out.println("O total da compra é " + total);


    }
}
