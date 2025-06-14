package Exercicios2;
import java.util.Scanner;

public class Exercicio24 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int NumeroDoFuncionario = sc.nextInt();
        double HorasDeTrabalho = sc.nextDouble();
        double ValorPorHora = sc.nextDouble();
        sc.close();

        double Salario = HorasDeTrabalho * ValorPorHora; 

        System.out.println("NUMBER = " + NumeroDoFuncionario);
        System.out.println("SALARY = " + Salario);


    }
}