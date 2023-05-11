import java.util.Scanner;


public class Exercicios21 {

  
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        int Preço1;
        Preço1 = sc.nextInt();

        int Preço2;
        Preço2= sc.nextInt();
        
        sc.close();

        int Resultado1 = Preço1 + Preço2;

        System.out.println("Soma = " + Resultado1);    
    }
    
}

