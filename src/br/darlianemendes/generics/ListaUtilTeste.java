package br.darlianemendes.generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {

    public static void main(String[] args){
        List<String> langs = Arrays.asList("JS", "PHP", "Java", "C++");
        List<Integer> nums = Arrays.asList(1,3,3,4,5,6);

        String utimaLinguagem1 = (String) ListaUtil.getUltimo1(langs);
        System.out.println(utimaLinguagem1);

        Integer ultimoNumero1 = (Integer) ListaUtil.getUltimo1(nums);
        System.out.println(ultimoNumero1);

        String utimaLinguagem2 = ListaUtil.getUltimo2(langs);
        System.out.println(utimaLinguagem2);

        Integer ultimoNumero2 = ListaUtil.<Integer>getUltimo2(nums);
        System.out.println(ultimoNumero2);


    }
}
