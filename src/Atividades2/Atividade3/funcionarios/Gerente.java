package Atividades2.Atividade3.funcionarios;

public class Gerente extends Funcionario {

    private boolean bonusAplicado;
    private int bonus = 300;

    public void addBonus() {
        this.salario += bonus;
        bonusAplicado = true;
    }

    @Override
    public void exibeSalario() {

        if (bonusAplicado == false) {
            System.out.println("O salário atual é " + this.salario);
        } else {
            System.out.println("O salário atual com bônus é " + this.salario);
        }

    }
}
