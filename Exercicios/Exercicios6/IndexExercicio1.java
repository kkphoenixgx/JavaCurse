import java.util.Scanner;
import Class.Quartos;

public class IndexExercicio1{

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int roomNumber = sc.nextInt();
        String name = sc.nextLine();
        String email = sc.nextLine();

        Quartos room = new Quartos(roomNumber, name, email);

        sc.close();

    }
}


