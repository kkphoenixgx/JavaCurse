import java.util.Scanner;

public class Exercicios22 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

       double raio;
       raio = sc.nextDouble();

       sc.close();

       double potencia = Math.pow (raio, 2);
       double Resultado = 3.14159 * potencia;
       System.out.println("Área =" + Resultado);

    }
}