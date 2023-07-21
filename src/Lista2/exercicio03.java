package Lista2;

/*2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao 
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em 
ordem crescente ou decrescente.*/

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// entrada de dados
		System.out.println("Digite um número inteiro:");
		int x = sc.nextInt();

		System.out.println("Digite um número inteiro:");
		int y = sc.nextInt();
		
		sc.close();

		//processamento
		if(x % y == 0 || y % x == 0){
			//saida caso sejam mutiplos
			System.out.println("são Multiplos!");
		}
		else{
			//saida caso não sejam multiplos 
			System.out.println("NÃO são Multiplos!");
		}

	}

}
