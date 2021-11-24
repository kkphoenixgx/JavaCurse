package Problems;
import Classes.Studant;
import java.util.Scanner;

public class Problem3_Exercicio {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Studant student = new Studant();

        student.name = sc.nextLine();
        student.nota1 = sc.nextDouble();
        student.nota2 = sc.nextDouble();
        student.nota3 = sc.nextDouble();


        System.out.println("FINAL GRADE: " + student.finalNote());

        if (student.finalNote() < 60.0) {

            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", student.result());

        } else {

            System.out.println("PASS");
        
        }
        
        sc.close();
    }
}
