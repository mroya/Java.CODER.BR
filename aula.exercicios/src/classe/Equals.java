package classe;

public class Equals {
	
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Márcio Roya";
		u1.email = "m@m.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Márcio Roya";
		u2.email = "m@m.com";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2)); 
		
		System.out.println(); 
	}
}
