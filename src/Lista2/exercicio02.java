package Lista2;

/*programa para ler um número inteiro e dizer se este número é par ou ímpar*/

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// entrada de dados
		System.out.println("Digite um número inteiro:");
		int n = sc.nextInt();

		sc.close();

		//processamento
		if(n % 2 == 0){
			//saida caso seja PAR
			System.out.println("Número PAR!");
		}
		else{
			//saida caso seja ÍMPAR
			System.out.println("Número ÍMPAR!");
		}

		
	}

}
