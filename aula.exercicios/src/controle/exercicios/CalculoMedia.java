/**
 *  Criar um programa que receba duas notas parciais, 
 *  calcular a média final. Se a nota do aluno for maior ou igual a 7.0 
 *  imprime no console "Aprovado", se a nota for menor que 7.0 e maior do que 4.0 
 *  imprime no console "Recuperação", caso contrário imprime no console "Reprovado".
 * @author Marcio.Roya
 * @version 1.0
 */
package controle.exercicios;

import java.util.Scanner;

public class CalculoMedia {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe a 1º Nota: ");
		double nota1 = entrada.nextDouble();
		System.out.println("Informe a 2º Nota: ");
		double nota2 = entrada.nextDouble();
		
		double media = (nota1+nota2)/2;
		
		if (media >= 7) {
			System.out.println("Aluno Aprovado! sua média ficou "+ media);
		} else if(media >=4 && media < 7) {
			System.out.println("Aluno em Recuperação! sua média ficou " + media);
		} else {
			System.out.println("Aluno Reprovado! sua média ficou " + media);
		}

		entrada.close();

	}

}
