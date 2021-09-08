package br.com.dio.model;

public class Livro {
    private String nome;
    private Integer npaginas;

    public Livro() {
    }

    public Livro(String nome, Integer npaginas) {
        this.nome = nome;
        this.npaginas = npaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNpaguinas() {
        return npaginas;
    }

    public void setNpaguinas(Integer npaginas) {
        this.npaginas = npaginas;
    }

    @Override
    public String toString() {
        return "Livro - " +
                "Titulo: '" + nome + '\'' +
                ", Nº de paginas: " + npaginas +
                '.';
    }
}
