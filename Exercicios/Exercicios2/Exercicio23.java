package Exercicios2;
import java.util.Scanner;

public class Exercicio23 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double ValorA = sc.nextDouble();
        double ValorB = sc.nextDouble();
        double ValorC = sc.nextDouble();
        double ValorD = sc.nextDouble();

        sc.close();

        double Diferença = ValorA * ValorB - ValorC * ValorD;
        System.out.println("DIFERENÇA = " + Diferença);
    }
}