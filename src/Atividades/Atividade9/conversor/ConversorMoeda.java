package Atividades.Atividade9.conversor;

public class ConversorMoeda implements ConversaoFinanceira{
    
    private int saldoDolar;

    public int getSaldoDolar() {
        return saldoDolar;
    }

    public void setSaldoDolar(int saldoDolar) {
        this.saldoDolar = saldoDolar;
    }

    @Override
        public double converterDolarParaReal(double cotacaoDolar) {
        return cotacaoDolar * saldoDolar;
    }
}
