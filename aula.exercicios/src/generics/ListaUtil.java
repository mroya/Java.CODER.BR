package generics;

import java.util.List;

public class ListaUtil {
	
	public static Object getUltimo1(List<?> lista) { // A interrogacao diz que irá ser qualquer coisa
		return lista.get(lista.size()-1); // esta função -1 no final pega o último elemento da lista
	}
	
	public static <T> T getUltimo2(List<T> lista) { 
		return lista.get(lista.size()-1);
	}
	
		
}
