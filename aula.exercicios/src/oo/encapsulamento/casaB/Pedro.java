package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {
	
	void testeAcessos() {
		//segredo é private
		//facoDentroDeCasa é default
		//formaDeFalar é protected
		//todosSabem é public
		
			
		//System.out.println(segredo);
		//System.out.println(facoDentroDeCasa);
		System.out.println(formaDeFalar);
		System.out.println(todosSabem);
	}
}
