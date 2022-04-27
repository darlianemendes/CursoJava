package br.darlianemendes.excecao.personalizadaB;

import br.darlianemendes.excecao.Aluno;
import br.darlianemendes.excecao.personalizadaA.NumeroForaIntervaloException;
import br.darlianemendes.excecao.personalizadaA.StringVaziaException;
import br.darlianemendes.excecao.personalizadaA.Validar;

public class TesteValidacoes {

    public static void main(String [] args) throws StringVaziaException, NumeroForaIntervaloException {

        try {
            Aluno aluno = new Aluno("Ana", 7);
            br.darlianemendes.excecao.personalizadaA.Validar.aluno(aluno);

            Validar.aluno(null);
        } catch (StringVaziaException e){
            System.out.println(e.getMessage());
        } catch (NumeroForaIntervaloException | IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Fim :)");
    }
}
