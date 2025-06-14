import java.util.Scanner;

public class Textando1 {

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int preco = sc.nextInt(); 
        double desconto = preco * 0.3;
        double precoComDesconto = (preco > 200)? preco - desconto : preco;

        System.out.printf("Preco: %2f", precoComDesconto);
        

        sc.close();


    }

}
