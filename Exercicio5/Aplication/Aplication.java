package Aplication;
import java.util.Scanner;
import Converter.CurrencyConverter;

public class Aplication {

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price?");
        double dollarPrice = sc.nextDouble();
        System.out.println("How many reais will be bough in dollars?");
        double howManyDollars = sc.nextDouble();
        System.out.println("Amout to be paid in reais :");
        System.out.println(CurrencyConverter.convertingForDollar(howManyDollars, dollarPrice));

        sc.close();

    }
}
