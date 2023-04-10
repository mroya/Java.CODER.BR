package br.com.mroya.cm;

import br.com.mroya.cm.modelo.Tabuleiro;
import br.com.mroya.cm.visao.TabuleiroConsole;

public class Aplicacao {
	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6,6,6);
		new TabuleiroConsole(tabuleiro);
	}
}
