package Problems;
import Classes.Employe;
import java.util.Scanner;


public class Problem2_Exercicio {

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        Employe Empregado;
        Empregado = new Employe();

        System.out.println("Name: ");
        Empregado.name = sc.nextLine();
        System.out.println("Gross salary: ");
        Empregado.grossSalary = sc.nextDouble();
        System.out.println("Tax: ");
        Empregado.tax = sc.nextDouble();
        
        System.out.println("Employe : " + Empregado.name + ", $ " + Empregado.netSalary());

        System.out.println("Witch percentage to increase salary? ");
        Empregado.porcentage = sc.nextDouble();

        System.out.println("Updated data: " + Empregado.name + ", $ " + Empregado.IncraseSalary());

        sc.close();

    }
}