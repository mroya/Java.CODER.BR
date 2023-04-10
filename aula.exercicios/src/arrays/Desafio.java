package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Quantas notas serão informadas? ");
		int totNotas = entrada.nextInt();
		
		double[] notas = new double[totNotas];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Informe a nota " +(i+1) + ": ");
			notas[i] = entrada.nextDouble();
		}
		
		double somaNotas = 0;
		for (double nota : notas) {
			somaNotas += nota;
		}
		
		
		System.out.println("Relação das notas " + Arrays.toString(notas));
		System.out.println();
		System.out.println("A média do aluno foi " + somaNotas/totNotas);
		

		entrada.close();

	}

}
