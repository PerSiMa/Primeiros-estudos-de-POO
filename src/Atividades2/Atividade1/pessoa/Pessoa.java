package Atividades2.Atividade1.pessoa;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void exibeDados() {
        System.out.println("O nome do cliente é " + nome);
        System.out.println("A idade do cliente é " + idade + " anos");
        System.out.println("A altura do cliente é " + altura + " metros");
    }

}
