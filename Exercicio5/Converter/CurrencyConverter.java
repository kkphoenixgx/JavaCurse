package Converter;
public class CurrencyConverter{

    public static final double IOF = 0.6;

    public static double convertingForDollar(double value1, double value){
        return value1 * value * (1+IOF);
    }

}