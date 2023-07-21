package Lista2;

import java.util.Locale;
import java.util.Scanner;

/*Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos 
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em 
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”*/

public class exercicio06 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//recebendo o valor
		System.out.print("Digite um número de 0 a 100: \n>>");
		double valor = sc.nextDouble();
		
		sc.close();
		
		//ao analisar o valor digitado ele cai em uma das estruturas e exibe uma mensagem com o intervalo
		if (valor >= 0 && valor <= 25) {
			System.out.println("INTERVALO (0, 25)");
		}

		else if (valor > 25 && valor <= 50) {
			System.out.println("INTERVALO (>25, 50)");
		}
		
		else if (valor > 50 && valor <= 75) {
			System.out.println("INTERVALO (>50, 75)");
		}
		
		else if (valor > 75 && valor <= 100) {
			System.out.println("INTERVALO (>75, 100)");
		}
		
		else {
			System.out.println("Fora de intervalo");
		}
	}

}
