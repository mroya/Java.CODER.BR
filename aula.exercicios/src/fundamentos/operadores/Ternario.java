package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {
		
		double media = 9.6;
		String resultado = media >= 7.0 ? "Aprovado" : "Recuperação";
		
		System.out.print("Nota do final do Aluno: " + media);
		System.out.print("\nResultado do Aluno: " + resultado);
	}
}
