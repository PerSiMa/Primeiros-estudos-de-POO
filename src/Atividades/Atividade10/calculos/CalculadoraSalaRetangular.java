package Atividades.Atividade10.calculos;

public class CalculadoraSalaRetangular implements  CalculoGeometrico {

    private double base, altura;

    @Override
    public double calcularArea(double base, double altura) {
        return base * altura;
    }

    @Override
    public double calcularPerimetro(double base, double altura) {
        return 2 * (base + altura);
    }
}
