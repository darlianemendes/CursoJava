package br.darlianemendes.fundamentos;


public class TipoString {

    public static void main (String [] args){
        System.out.println("Olá pessoal, boa tarde!".charAt(2));

        String s = "Boa tarde";
        System.out.println(s.concat("!!!!"));
        System.out.println(s + "!!!!!!!");
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.toUpperCase().endsWith("TARDE"));
        System.out.println(s.length());
        System.out.println(s.equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("BOA TARDE"));

        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 12345.987;

        System.out.println("Nome: " + nome
                + "\nSobrenome: " + sobrenome
                + "\nIdade: " + idade
                + "\nSalário: " + salario);

        //jeito melhor

        System.out.printf("O senhor  %s %s tem %d anos e ganha R$ %.2f."
                , nome, sobrenome, idade, salario);

        //outro jeito

        String frase = String.format("\nO senhor  %s %s tem %d anos e ganha R$ %.2f."
                , nome, sobrenome, idade, salario);
        System.out.println(frase);


        System.out.println("Frase qualquer".contains("qual"));
        System.out.println("Frase qualquer".indexOf("qual"));
        System.out.println("Frase qualquer".substring(6));
        System.out.println("Frase qualquer".substring(6, 10));
    }
}
