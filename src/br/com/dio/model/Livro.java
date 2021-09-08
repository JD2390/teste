package br.com.dio.model;

public class Livro {
    private String nome;
    private Integer npaguinas;

    public Livro() {
    }

    public Livro(String nome, Integer npaguinas) {
        this.nome = nome;
        this.npaguinas = npaguinas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNpaguinas() {
        return npaguinas;
    }

    public void setNpaguinas(Integer npaguinas) {
        this.npaguinas = npaguinas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", npaguinas=" + npaguinas +
                '}';
    }
}
