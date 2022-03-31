package br.darlianemendes.projeto;

public class Livro {

    private Integer id;
    private String titulo;
    private String autor;
    private String secao;

    public Livro(String titulo, Integer id, String autor, String secao) {
        this.titulo = titulo;
        this.autor = autor;
        this.id = id;
        this.secao = secao;
    }

    public Livro(String titulo) {
        this.titulo = titulo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getSecao() {
        return secao;
    }

    public void setSecao(String secao) {
        this.secao = secao;
    }

    public String toString(){
        return this.titulo;
    }
}
