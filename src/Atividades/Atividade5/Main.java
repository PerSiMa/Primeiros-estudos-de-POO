package Atividades.Atividade5;

import Atividades.Atividade5.livro.Livro;

public class Main {

    public static void main(String[] args) {

        Livro livro1 = new Livro();

        livro1.setAutor("Pedro");
        livro1.setTitulo("O gatão");

        livro1.exibirDetalhes();

    }

}
