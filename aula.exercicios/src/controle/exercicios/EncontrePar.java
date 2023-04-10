/**
 * Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;
 * @author Marcio.Roya
 * @version 1.0
 */
package controle.exercicios;

import java.util.Scanner;

public class EncontrePar {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe um número inteiro: ");
		int num = entrada.nextInt();
		
		if (num % 2 == 0 && num <= 10) {
			System.out.println("O número informado é PAR e não é maior que 10, Acertei?");
		} else if (num % 2 == 1 && num <= 10) {
				System.out.println("O número informado é ÍMPAR e não é maior que 10, Acertei?");
		} else {
			System.out.println("O número informadoé maior que 10");
		}
		
		System.out.println("Fim....");
		
		entrada.close();

	}

}
