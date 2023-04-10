package streamsAPI;

import java.util.Arrays;
import java.util.List;

public class OutrosMetodos {
	
	public static void main(String[] args) {
		
		var a1 = new Aluno("Ana", 7.1);
		var a2 = new Aluno("Luna", 6.1);
		var a3 = new Aluno("Gui", 8.1);
		var a4 = new Aluno("Gabi", 10);
		var a5 = new Aluno("Ana", 7.1);
		var a6 = new Aluno("Pedro", 6.1);
		var a7 = new Aluno("Gui", 8.1);
		var a8 = new Aluno("Marcio", 10);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		
		System.out.println("\ndistinct....\n");
		alunos.stream().distinct().forEach(System.out::println);
		
		System.out.println("\nSkip / Limit\n");
		alunos.stream()
			.distinct()
			.skip(2)
			.limit(2)
			.forEach(System.out::println);
		
		System.out.println("\ntakeWhile\n");
		alunos.stream()
			.distinct()
			.takeWhile(a -> a.nota >= 7)
			.forEach(System.out::println);
		
	}
}
