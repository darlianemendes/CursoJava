package br.darlianemendes.fundamentosLivro;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class EstudoBasico7 {

    public static void main( String [] args){

        int valor1 = 2;
        int valor2 = 10;

        double valorTotal = valor1 % valor2;

        System.out.println("O resultado é: " + valorTotal);

        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int month = localDate.getMonthValue();
        System.out.println("O resultado é: " + month);

        LocalDateTime localD = LocalDateTime.now();
        System.out.println("O local date time now é: " + localD);

        LocalDate today = LocalDate.now();
        int month1 = today.getMonthValue();
        System.out.println("O resultado é: " + month1);
    }
}
