package br.darlianemendes.fundamentos;

public class NotacaoPonto {

    public static void main (String [] args){

        //funcções Sting
        String s = "Bom dia X";
        s = s.replace("X","Senhora"); //substituir
        s = s.toUpperCase();  //deixar tudo maiusculo
        s = s.concat("!!!!!!!!");

        System.out.println(s);

        String x = "Leo".toUpperCase();
        System.out.println(x);


        String y = "Bom dia X"
                .replace("X", "Gui")
                .toUpperCase()
                .concat("!!!!");

        System.out.println(y);
    }

}
