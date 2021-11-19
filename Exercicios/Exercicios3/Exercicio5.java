import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int Codigo = sc.nextInt();
        int Quantidade = sc.nextInt();

        sc.close();

        if (Codigo == 1){

            int Resultado = (int) (4.00 * Quantidade);
            System.out.println("Total : " + Resultado );
        }
        else if (Codigo == 2){

            int Resultado = (int) (4.50 * Quantidade);
            System.out.println("Total : " + Resultado );

        }
        else if (Codigo == 3){

            int Resultado = (int) (5.00 * Quantidade);
            System.out.println("Total : " + Resultado );

        }
        else if (Codigo == 4){

            int Resultado = (int) (2.00 * Quantidade);
            System.out.println("Total : " + Resultado );

        } 
        else if (Codigo == 5){

            int Resultado = (int) (1.50 * Quantidade);
            System.out.println("Total : " + Resultado );

        } else {   

            System.out.println("Código Invalido");

        }
    }
}