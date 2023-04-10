package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		double a = 1; // conversão implícita
		System.out.println(a);
		
		float b = (float) 1.0; // Conversão explícita (CAST)
		System.out.println(b);
		
		int c = 1;
		byte d = (byte) c; // Conversão explícita (CAST)
		System.out.println(d);
		
		double e = 1;
		int f = (int) e;
		System.out.println(f);
	}
}
