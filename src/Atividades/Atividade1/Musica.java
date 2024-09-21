package Atividades.Atividade1;

public class Musica {

    //a fazer //exibir a ficha técnica, avaliar a música e calcular a média de avaliações

    String artista, titulo;
    int anoLancamento, numAvaliacoes;
    double avaliacao;

    void exibeFicha(){
        System.out.println("O nome do artista é " + artista);
        System.out.println("O titulo da música é " + titulo);
        System.out.println("O ano de lançamento é " + anoLancamento);
        System.out.println("O número de avaliações é " + numAvaliacoes);
    }

    void avaliar(double nota){
        avaliacao += nota;
        numAvaliacoes++;
    }

    double facaMedia(){
        return avaliacao / numAvaliacoes;
    }

}
