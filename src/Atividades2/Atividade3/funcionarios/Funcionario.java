package Atividades2.Atividade3.funcionarios;

public class Funcionario {

    protected String nome, cargo;
    protected int salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void exibeSalario() {
        System.out.println("O salário atual é " + salario);
    }
}
