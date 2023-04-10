package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		// conversão automática
		conjunto.add(1.2); // double -> Double(classe do tipo Double)
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("Teste"); // String
		conjunto.add(1); //int -> Integer
		conjunto.add('x'); // char -> Character
		
		System.out.println("O tamanho é : " + conjunto.size());
		
		conjunto.add("teste");
		
		System.out.println("O tamanho é : " + conjunto.size());
		
		System.out.println(conjunto.remove("Teste"));
		
		System.out.println(conjunto.contains('x'));
		
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		
		conjunto.addAll(nums); // União entre dois conjuntos
		conjunto.retainAll(nums); // Intersecção entre dois conjuntos 
		
		System.out.println(conjunto);
	}

}
