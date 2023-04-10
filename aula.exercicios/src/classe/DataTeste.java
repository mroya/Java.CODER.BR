package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		
		var d2 = new Data(31, 12, 2023);
		
		System.out.println(d1.dataFormatada());
		
		d2.imprimirDataFormatada();
	
	}

}
