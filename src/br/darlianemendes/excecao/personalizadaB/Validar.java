package br.darlianemendes.excecao.personalizadaB;

import br.darlianemendes.excecao.Aluno;
import br.darlianemendes.excecao.personalizadaA.NumeroForaIntervaloException;
import br.darlianemendes.excecao.personalizadaA.StringVaziaException;

public class Validar {

    private Validar(){}

    public static void aluno(Aluno aluno) throws StringVaziaException, NumeroForaIntervaloException{
        if(aluno == null){
            throw new IllegalArgumentException("O aluno esta nulo");
        }

        if(aluno.nome == null || aluno.nome.trim().isEmpty()){
            throw new StringVaziaException("nome");
        }

        if(aluno.nota < 0 || aluno.nota > 10){
            throw new NumeroForaIntervaloException("nota");
        }
    }
}
