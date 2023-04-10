package fundamentos.operadores;

public class Atribuicao {
	public static void main(String[] args) {
		
		int a = 3;
		int b = a;
		int c = a + b;
		
		
		c += b; // c = c + b
		c -= b; // c = c - b
		c *= b; // c = c * b
		c /= b; // c = c / b
		c %= 2; //sabe se o numero é par; 0 ou 1 - 0 = Par e 1 = impar
		
		System.out.println(c);
	}
}
