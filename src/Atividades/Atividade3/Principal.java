package Atividades.Atividade3;

import java.util.Scanner;
import Atividades.Atividade3.idadePessoa.IdadePessoa;

public class Principal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        IdadePessoa pessoa1 = new IdadePessoa();

        System.out.println("Digite seu nome e pressione <ENTER>");
        pessoa1.setNome(input.next());

        System.out.println("Digite sua idade e pressione <ENTER>");
        pessoa1.setIdade(input.nextInt());

        pessoa1.verificarIdade();
    }
}
