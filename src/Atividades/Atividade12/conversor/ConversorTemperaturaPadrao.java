package Atividades.Atividade12.conversor;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {

    @Override
    public double celsiusParaFarenheit(double tempCelsius) {
        return tempCelsius * 1.8 + 32;
    }

    @Override
    public double farenheitParaCelsius(double tempFarenheit) {
        return (tempFarenheit - 32) / 1.8;
    }
}
