package br.darlianemendes.arrays;

public class ExercicioForEach {

        public static void main (String [] args){

            double[] idCadastro = {9,8,7,6,5,6};
            // laço de repetição para cada elemento.
            //percorre a lista um por um.
            for (double idCadastros: idCadastro) {
                System.out.print(idCadastros + "");
            }

            //outra forma
            for (int i = 0; i < idCadastro.length; i++){
                System.out.println(idCadastro[i] + "");
            }

        }
    }
