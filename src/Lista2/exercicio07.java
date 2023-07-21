package Lista2;

import java.util.Locale;
import java.util.Scanner;

/*Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas 
de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o 
ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).

Se o ponto estiver na origem, escreva a mensagem “Origem”.

Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a 
situação.*/

public class exercicio07 {

	public static void main(String[] args) {

		/*
		 * 				|y	
		 * 		Q2		|		Q1
		 * 				|			
		 *	------------+-------------x
		 *				|
		 *		Q3		|		Q4
		 *				|
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//recebendo as cordenadas do eixo X
		System.out.println("Digite o valor do eixo X:");
		double x = sc.nextDouble();
		
		//recebendo as cordenadas do eixo Y
		System.out.println("Digite o valor do eixo y:");
		double y = sc.nextDouble();
		
		sc.close();
		
		//digitando as cordenadas ele mostra em qual quadrante esta localizada
		if (x>0 && y>0) {
			System.out.println("Q1");
		}
		else if (x<0 && y>0) {
			System.out.println("Q2");
		}
		else if (x<0 && y<0) {
			System.out.println("Q3");
		}
		else if (x>0 && y<0) {
			System.out.println("Q4");
		}
		else if(x>0 && y==0 || x<0 && y==0) {
			System.out.println("Eixo X");
		}
		else if(x==0 && y>0 || x==0 && y<0) {
			System.out.println("Eixo Y");
		}
		else {
			System.out.println("Origem");
		}
		
	}

}
