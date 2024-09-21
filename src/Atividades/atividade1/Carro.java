package Atividades.atividade1;

public class Carro {

    String modelo, cor;
    int ano;

    void exibeFicha(){
        System.out.println("O modelo do carro é " + modelo);
        System.out.println("A cor do carro é " + cor);
        System.out.println("O ano do carro é " + ano);
    }

    int calculaIdade(){
        return 2024 - ano;
    }
}
