package oo.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Márcio", "de Roya", -45);
		p1.setIdade(230);
		
		System.out.println(p1.getIdade());
		System.out.println(p1); // chama o método toString
		System.out.println(p1.getNomeCompleto());
	}

}
