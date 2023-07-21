package Lista2;

import java.util.Scanner;

/*hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode 
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas*/

public class exercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//recebendo o horario de inicio
		System.out.println("Hora de ínicio:");
		int hInicio = sc.nextInt();
		
		//recebendo o horario do fim
		System.out.println("Hora de fim:");
		int hFim = sc.nextInt();
		
		sc.close();
		
		//caso o horario inicial seja mior que o final
		if (hInicio > hFim){

			int dia = 24;
			
			int duracao = (dia - hInicio) + hFim;
			System.out.println("O jogo durou: " + duracao);
		}
		
		//calculo basico se os valores são abaixo de 12h de diferença
		else {
			int duracao = hFim - hInicio;
			System.out.println("O jogo durou: " + duracao);
		}

	}

}
