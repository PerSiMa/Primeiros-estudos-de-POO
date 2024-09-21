package Atividades.Atividade6;

import Atividades.Atividade6.carro.ModeloCarro;

public class Principal {

    public static void main(String[] args) {
        ModeloCarro carro = new ModeloCarro();
        carro.defineModelo("modelo 3.0");
        carro.definirPrecos(45000, 30000, 20000);
        carro.exibeModeloEPrecos();

    }

}
