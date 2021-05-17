import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int NumeroInteiro = sc.nextInt();
        sc.close();

        if(NumeroInteiro < 0){

            System.out.println("NEGATIVO");
        
        }else { 

            System.out.println("NÃO NEGATIVO");

        }
    }
}