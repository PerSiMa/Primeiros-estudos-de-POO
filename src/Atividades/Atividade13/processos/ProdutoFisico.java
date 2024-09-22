package Atividades.Atividade13.processos;

public class ProdutoFisico implements Calculavel {

    protected double desconto, taxa, preco;

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto / 100;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa / 100;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public double calcularPrecoFinal() {

        double desconto, taxa;
        desconto = preco * this.desconto;
        taxa = preco * this.taxa;

        return preco + taxa - desconto;

    }
}
