package classe;

public class Data {
	int dia;
	int mes;
	int ano;
	
	Data() {
		dia = 1;
		mes = 1;
		ano = 1945;
	}
	
	Data (int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	 
	String dataFormatada() {
		String formato = "%d/%d/%d\n";
		return String.format(formato, dia, mes, ano);
	}

	void imprimirDataFormatada() {
		System.out.printf("%d/%d/%d\n", dia, mes, ano);
	}
}
