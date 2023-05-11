import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        double Salario = sc.nextDouble();
        double imposto = 0;

        sc.close();

        if (Salario <= 2000.00){
            imposto = 0.0;
        }
        else if(Salario <= 3000.00){
            imposto = (Salario - 2000.0) * 0.08;
        }
        else if( Salario <= 4500.00){
            imposto = (Salario - 3000.0) * 0.18 + 1000.0 * 0.08;
        }
        else if(Salario <= 4500.00){
            imposto = (Salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }


        if (imposto == 0.0){

            System.out.println("Isento");
        } else {
			System.out.printf("R$ %.2f%n", imposto);
		}
    }
}
