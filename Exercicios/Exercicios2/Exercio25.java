import java.util.Scanner;

public class Exercio25 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int codigo1 = sc.nextInt();
        int numeroDepecas1 = sc.nextInt();
        double ValorDaPeça1 = sc.nextDouble();
        int codigo2 = sc.nextInt();
        int numeroDepecas2 = sc.nextInt();
        double ValorDaPeça2 = sc.nextDouble();
        sc.close();

        double Preco1 = numeroDepecas1 * ValorDaPeça1;
        double Preco2 = numeroDepecas2 * ValorDaPeça2;
        double ValorTotal = Preco1 + Preco2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", ValorTotal);
    }
}