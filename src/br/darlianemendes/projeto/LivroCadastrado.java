package br.darlianemendes.projeto;

public class LivroCadastrado extends  Livro{


    public LivroCadastrado(String titulo, Integer id, String autor, String secao) {
        super(titulo, id, autor, secao);
    }

    public LivroCadastrado(String titulo) {
        super(titulo);
    }
}
