package oo.heranca.teste;

import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;
import oo.heranca.desafio.Carro;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro c1 = new Civic();
		Ferrari f1 = new Ferrari(400);
		
		c1.acelerar();
		f1.acelerar();			
		System.out.println(c1);
		System.out.println(f1);
		
		c1.acelerar();
		f1.acelerar();
		System.out.println(c1);
		System.out.println(f1);
		
		
		c1.frear();
		f1.frear();
		f1.acelerar();
		f1.ligarTurbo();
		f1.ligarAr();
		f1.desligarAr();
		
		System.out.println(c1);
		
		System.out.println(f1.velocidadeDoAr());
		
		System.out.println(f1);
		

	}

}
