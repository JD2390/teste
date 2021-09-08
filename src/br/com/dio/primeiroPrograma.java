package br.com.dio;

import br.com.dio.model.Gato;
import br.com.dio.model.Livro;

public class primeiroPrograma {

    public static void main(String[] args) {

        //System.out.println("The World!");
        Gato gata= new Gato();
        System.out.println(gata);
        Livro livro = new Livro("O problema dos 3 corpos", 300);
        System.out.println(livro);

    }
}
