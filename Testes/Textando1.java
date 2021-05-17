import java.util.Scanner;

public class Textando1 {

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        double preco = sc.nextDouble();
        sc.close();

        double porcentagem = 0;

        double desconto = (preco < 200) ? porcentagem + 30 : porcentagem + 0;

        // vou voltar quando eu souber foreath no java ;-;

        double total = (preco * desconto) /100;

        System.out.println(total);

    }
}