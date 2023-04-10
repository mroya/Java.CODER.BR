package fundamentos.operadores;

public class DesafiosAritmeticos {
	public static void main(String[] args) {
		
		double numeradorA = Math.pow(6*(3+2), 2);
		double denominadorA = 3*2;
		
		double numeradorB = (1-5)*(2-7);
		double denominadorB = 2;
		
		
		double superiorA = numeradorA / denominadorA;
		double superiorB = Math.pow(numeradorB / denominadorB, 2);
		
		double superior = Math.pow(superiorA - superiorB, 3);
		
		double inferior = Math.pow(10, 3);
		
		double resultado = superior / inferior;
		
		System.out.println("O resultado é " + resultado);			
		
	}
}
