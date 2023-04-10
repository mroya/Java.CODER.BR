package streamsAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
	
	public static void main(String[] args) {
		
		var p1 = new Produto("Lapis", 1.99, 0.12, 30);
		var p2 = new Produto("Notebook", 4899.89, 0.32, 0);
		var p3 = new Produto("Caderno", 30, 0.45, 0);
		var p4 = new Produto("Impressora", 1200, 0.4, 0);
		var p5 = new Produto("iPad", 3100, 0.29, 0);
		var p6 = new Produto("Relógio", 1900, 0.12, 0);
		var p7 = new Produto("Monitor", 800, 0.31, 0);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);
		
		//Filter, filter, map
		Predicate<Produto> superPromocao = p -> p.desconto >= 0.3;
		Predicate<Produto> freteGratis = p -> p.valorFrete == 0;
		Predicate<Produto> precoRelevante = p -> p.preco >= 500;
		
		Function<Produto, String> chamadaPromocional = p -> "Aproveite! " + p.nome + " por " + p.preco;
		
		produtos.stream()
			.filter(superPromocao)
			.filter(freteGratis)
			.filter(precoRelevante)
			.map(chamadaPromocional)
			.forEach(System.out::println);
	}
}
