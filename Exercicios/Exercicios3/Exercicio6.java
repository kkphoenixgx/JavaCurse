import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        double Numero = sc.nextDouble();

        sc.close();

        if(Numero >= 0 && Numero <= 25) {

            System.out.println("Intervalo (0, 25)");

        } else if (Numero >= 25 && Numero <= 50){

            System.out.println("Intervalo 25, 50");

        }else if (Numero >= 50 && Numero <= 75){

            System.out.println("Intervalo 50, 75");
            
        }else if (Numero >= 75 && Numero <= 100){

            System.out.println("Intervalo 75, 100");
            
        } else {

            System.out.println("Fora de Intervalo");

        }

    }
}