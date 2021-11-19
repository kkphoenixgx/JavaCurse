import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        double CordenadaX = sc.nextDouble();
        double CordenadaY = sc.nextDouble();

        sc.close();

        if (CordenadaX > 0 && CordenadaY > 0){ 
            //Quadrante Q1
            System.out.println("Q1");
        } 
        else if(CordenadaX < 0 && CordenadaY > 0){
            //Quadrante Q2
            System.out.println("Q2");
        }
        else if(CordenadaX < 0 && CordenadaY < 0){
            //Quadrante Q3
            System.out.println("Q3");
        }
        else if(CordenadaX > 0 && CordenadaY < 0){
            //Quadrante Q4
            System.out.println("Q4");
        }
        else if (CordenadaX == 0 && CordenadaY != 0 ){
            // No eixo Y
            System.out.println("No eixo Y");
        }
        else if(CordenadaX != 0 && CordenadaY == 0){
            // No eixo X
            System.out.println("No eixo X");
        }
        else if(CordenadaX == 0 && CordenadaY == 0){
            //No 0
            System.out.println("No ponto de origem");
        }else {

            System.out.println("Algo de errado n tá certo");
        }
    }
}