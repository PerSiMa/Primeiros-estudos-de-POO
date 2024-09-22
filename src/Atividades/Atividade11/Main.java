package Atividades.Atividade11;

import Atividades.Atividade11.tabuada.TabuadaMultiplicacao;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        TabuadaMultiplicacao tabuada1 = new TabuadaMultiplicacao();

        System.out.println("Qual número você deseja ver a tabuada ?");

        tabuada1.mostrarTabuada(input.nextInt());

    }

}
