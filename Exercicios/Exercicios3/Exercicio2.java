import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int Numero = sc.nextInt();

        sc.close();

        int result = Numero % 2; 
        boolean bull = (result ==  0);
  

        if(bull == true){

            System.out.println("Par");

        }else{

            System.out.println("IMPAR");

        }

    }
}
