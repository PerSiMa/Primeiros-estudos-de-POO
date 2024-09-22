package Atividades.Atividade13.processos;

public class Livro extends ProdutoFisico implements Calculavel {

    @Override
    public double calcularPrecoFinal() {

        desconto = preco * desconto;
        taxa = preco * taxa;

        return preco + taxa - desconto;

    }
}
