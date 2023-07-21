package Lista2;

/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A 
seguir, calcule e mostre o valor da conta a pagar*/

import java.util.Locale;
import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		/*CODIGO		ESPECIFICAÇÃO		PREÇO
		 * 
		 * 	1			Cachorro quente		R$4.00
		 * 	2			X-Salada			R$4.50
		 * 	3			X-Bacon				R$5.00
		 * 	4			Torrada simples		R$2.00
		 * 	5			Refrigerante		R$1.50*/

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		//LEITURA DO CODIGO DO PRODUTO
		System.out.println("Digite o código do produto:");
		int codigo = sc.nextInt();
		
		//QUANTIDADE COMPRADA
		System.out.println("Digite a quantidade que deseja:");
		int quantidade = sc.nextInt();
		
		sc.close();
		
		//DE ACORDO COM O CODIGO DIGITADO, CAI EM UMA DESSAS ESTRUTURAS CONDICIONAIS
		if (codigo == 1) {
			
			double valor = 4 * quantidade;
			System.out.printf("TOTAL: R$%.2f", valor);
		}
		else if (codigo == 2){
	
			double valor = 4.5 * quantidade;
			System.out.printf("TOTAL: R$%.2f", valor);
		}
		else if (codigo == 3) {
			
			double valor = 5 * quantidade;
			System.out.printf("TOTAL: R$%.2f", valor);
		}
		else if (codigo == 4) {
		
			double valor = 2 * quantidade;
			System.out.printf("TOTAL: R$%.2f", valor);
		}
		else if (codigo == 5) {
			
			double valor = 1.5 * quantidade;
			System.out.printf("TOTAL: R$%.2f", valor);
		}
		
	}

}
