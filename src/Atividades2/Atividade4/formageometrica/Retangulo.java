package Atividades2.Atividade4.formageometrica;

public class Retangulo extends FormaGeometrica {

    private double base, altura;

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}
