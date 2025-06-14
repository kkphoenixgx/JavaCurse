import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int horaDeInicio = sc.nextInt();
        int horaDeTermino = sc.nextInt();

        int duracao;

        sc.close();

        if (horaDeInicio < horaDeTermino) {

			duracao = horaDeTermino - horaDeInicio;

		}
		else {
            
			duracao = 24 - horaDeInicio + horaDeTermino;

		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

    }
}