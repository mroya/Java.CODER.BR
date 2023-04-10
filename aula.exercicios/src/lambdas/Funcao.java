package lambdas;

import java.util.function.Function;

public class Funcao {
	
	public static void main(String[] args) {
		
		Function<Integer, String> parOuImpar = numero -> numero %2 == 0 ? "par" : "Ímpar";
		
		Function<String, String> oResultadoE = valor -> "O resultado é: " + valor;
		
		Function<String, String> empolgado = valor -> valor + "!!";
		
		String resultadoFinal = parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(33);
		System.out.println(resultadoFinal);
		
		System.out.println(parOuImpar.apply(33));
	}
}
