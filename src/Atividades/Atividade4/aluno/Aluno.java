package Atividades.Atividade4.aluno;

public class Aluno {
    private String nome;
    private int notas, totalNotas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNotas() {
        return notas;
    }

    public void setNotas(int notas) {
        this.notas += notas;
        totalNotas++;
    }

    public int calcularMedia (){
        return notas / totalNotas;
    }
}
