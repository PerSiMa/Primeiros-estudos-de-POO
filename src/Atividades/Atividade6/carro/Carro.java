package Atividades.Atividade6.carro;

public class Carro {

    private String modelo;
    private double precoano1;
    private double precoano2;
    private double precoano3;

    public void defineModelo(String Modelo) {
        this.modelo = Modelo;
    }

    public void definirPrecos (double precoano1, double precoano2, double precoano3){
        this.precoano1 = precoano1;
        this.precoano2 = precoano2;
        this.precoano3 = precoano3;
    }

    public void exibeModeloEPrecos(){
        System.out.println("O nome do modelo é " + modelo);
        System.out.println("O preço do modelo " + modelo + " no primeiro ano é " + precoano1);
        System.out.println("O preço do modelo " + modelo + " no segundo ano é " + precoano2);
        System.out.println("O preço do modelo " + modelo + " no terceiro ano é " + precoano3);
        System.out.println("O maior preço dos 3 anos é " + calcularMaiorPreco());
        System.out.println("O menor preço dos 3 anos é " + calcularMenorPreco());
    }

    public double calcularMaiorPreco(){
        double maiorPreco = precoano1;

        if (precoano2 > maiorPreco) {
            maiorPreco = precoano2;
        }

        if (precoano3 > maiorPreco) {
            maiorPreco = precoano3;
        }

        return maiorPreco;
    }

    public double calcularMenorPreco(){
        double menorPreco = precoano1;

        if (precoano2 < menorPreco) {
            menorPreco = precoano2;
        }

        if (precoano3 < menorPreco) {
            menorPreco = precoano3;
        }

        return menorPreco;
    }


}
