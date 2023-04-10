/**
 * Criar um programa informa se o ano atual é um ano bissexto;
 * @author Marcio.Roya
 * @version 1.0
 *
 */
package controle.exercicios;

import java.util.Scanner;

public class AnoBissexto {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("O ano é Bissexto? informe o ano: ");
		int ano = entrada.nextInt();
		
		if(ano%4 == 0 && ano%100 == 0 && ano%400 == 0) {
			System.out.println("Ano informado é Bissexto.");
		} else {
			System.out.println("Ano informado não é Bissexto.");
		}

		entrada.close();

	}

}
