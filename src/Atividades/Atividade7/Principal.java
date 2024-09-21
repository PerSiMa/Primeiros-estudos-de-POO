package Atividades.Atividade7;

import Atividades.Atividade7.animal.Cachorro;
import Atividades.Atividade7.animal.Gato;

public class Principal {
    public static void main(String[] args) {

        Cachorro cao1 = new Cachorro();
        Gato gato1 = new Gato();

        cao1.emitirSom();
        cao1.abanarRabo();

        gato1.emitirSom();
        gato1.arranharMoveis();
    }
}
