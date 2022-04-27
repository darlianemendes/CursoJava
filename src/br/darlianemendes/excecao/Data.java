package br.darlianemendes.excecao;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {

    public static void main( String [] args){

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy - MMMM HH:mm ");

        Date dataSistema = new Date();
        System.out.println(format.format(dataSistema));
    }
}
