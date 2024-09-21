package Atividades.Atividade4;

import java.util.Scanner;
import Atividades.Atividade4.aluno.Aluno;

public class Main {

    public static void main(String[] args) {

        int contador, quantidadeDeNotas;
        contador = 0;

        Scanner input = new Scanner(System.in);
        Aluno aluno1 = new Aluno();

        System.out.println("Digite o nome do seu aluno e pressione <ENTER>");
        aluno1.setNome(input.next());

        System.out.println("Quantas notas você deseja registrar ?");
        quantidadeDeNotas = input.nextInt();

        while (contador < quantidadeDeNotas){
            System.out.println("Qual a " + (contador + 1) + "º nota ?");
            aluno1.setNotas(input.nextInt());
            contador++;
        }

        System.out.println("A média de " + aluno1.getNome() + " é " + aluno1.calcularMedia());

    }

}
