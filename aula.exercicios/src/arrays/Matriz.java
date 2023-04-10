package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Quantos alunos? ");
		int alunosTot =  entrada.nextInt();
		
		System.out.print("Quantas notas por alunos?");
		int qtNotas = entrada.nextInt();
		
		double[][] notasDaTurma = new double[alunosTot][qtNotas];
		
		double total = 0;
		
		for (int i = 0; i < notasDaTurma.length; i++) {
			for (int j = 0; j < notasDaTurma[i].length; j++) {
				System.out.printf("Informe a nota %d do aluno %d: ", (j+1), (i+1));
				notasDaTurma[i][j] = entrada.nextDouble();
				total += notasDaTurma[i][j];
			}
		}
		
		double media = total / (alunosTot * qtNotas);
		System.out.println();
		System.out.println("A média por aluno é " + media);
		
		for (double[] notasDoALuno : notasDaTurma) {
			System.out.println(Arrays.toString(notasDoALuno));
		}

		entrada.close();
	}
}
