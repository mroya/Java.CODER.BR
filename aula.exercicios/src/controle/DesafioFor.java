package controle;

public class DesafioFor {

	public static void main(String[] args) {
		
		String valor = "#";
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < args.length; j++) {
				
			}
			System.out.println(valor);
			valor += "#";
		}
		System.out.println();
		for (String v = "#"; !v.equals("######"); v+= "#") {
			System.out.println(v);
		}

	}

}
