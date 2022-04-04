package br.darlianemendes.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

    public static void main(String [] args){

        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);

        UnaryOperator<String> inverter =
                s -> new StringBuilder(s).reverse().toString();

        Function<String, Integer> binarioParaInt =
                s -> Integer.parseInt(s, 2);

        nums.stream()
                .map(Integer::toBinaryString)//valor inteiro para string binaria
                .map(inverter)
                .map(binarioParaInt)//binario para String
                .forEach(System.out::println);
    }
}
