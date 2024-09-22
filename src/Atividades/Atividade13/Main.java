package Atividades.Atividade13;

import Atividades.Atividade13.processos.Livro;

public class Main {

    public static void main(String[] args) {

        Livro livro1 = new Livro();

        livro1.setPreco(50);
        livro1.setDesconto(50);
        livro1.setTaxa(40);

        System.out.println(livro1.calcularPrecoFinal());

    }

}
