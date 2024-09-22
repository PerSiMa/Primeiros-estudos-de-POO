package Atividades.Atividade11.tabuada;

public class TabuadaMultiplicacao implements Tabuada {

    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public void mostrarTabuada(int numero) {
        int resultado = 0;

        System.out.println("A tabuada de " + numero + " é :");

        for (int i = 1; i <= 10; i++) {
            System.out.print(numero * i);

            if (i < 10) {
                System.out.print(",");
            }
        }
    }
}
