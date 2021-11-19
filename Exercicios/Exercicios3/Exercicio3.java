import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        sc.close();
        
        if(number1 % number2 == 0){

            System.out.println("São multiplos");

        }else {

            System.out.println("Não são multiplos");

        }

    }
}