package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int contador = 0;
		double nota = 0;
		double total = 0;
		
		while (nota != -1) {
			System.out.println("Nota: (Digite -1 para sair)");
			nota = entrada.nextDouble();
			if (nota >= 0 && nota <= 10) {
				total += nota;
				contador++;
			}else if(nota != -1) {
				System.out.println("Nota inválida!!!");
			}
		}
		
		double media = total / contador;
		System.out.printf("Média = %.2f" ,media);
		
		entrada.close();

	}

}

// inserção de notas, calcular medias, válidas 0-10, contador de notas válidas, variavel total(soma notas)
// quantidade notas validas, sair é -1;