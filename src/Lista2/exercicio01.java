package Lista2;

/*programa para ler um número inteiro, e depois dizer se este número é negativo ou não*/

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// entrada de dados
		System.out.println("Digite um número inteiro:");
		int n = sc.nextInt();

		sc.close();

		//processamento
		if(n>0){
			//saida caso seja maior que 0
			System.out.println("Número positivo!");
		}
		else if(n<0){
			//saida caso seja menor que 0
			System.out.println("Número negativo!");
		}
		else {
			//saida caso seja igual a 0
			System.out.println("0 é um número neutro (nem negativo, nem positivo)");
		}
		
	}

}
