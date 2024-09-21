package Atividades2.Atividade4.formageometrica;

import java.lang.Math;

public class Circulo extends FormaGeometrica {

    private double raio;

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * (raio * raio);
    }
}
