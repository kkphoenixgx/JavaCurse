package Problems;
import java.util.Scanner;
import Classes.Retangulo;

public class Problem1_Exercicio1 {

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        Retangulo X;

        X = new Retangulo();


        System.out.println("Enter rectangle width and height:");

        X.width = sc.nextDouble();
        X.height = sc.nextDouble();

        double area = X.area();
        double perimeter = X.perimeter();
        double diagonal = X.diagonal();

    
        System.out.println("Area = " + area);
        System.out.println("PERIMETER : " + perimeter);
        System.out.println("Diagonal : " + diagonal);

        sc.close();

    }
}