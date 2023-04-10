package br.com.mroya.calc.visao;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import br.com.mroya.calc.modelo.Memoria;

@SuppressWarnings("serial")
public class Teclado extends JPanel implements ActionListener {
	
	private final Color COR_CINZA_ESCURO = new Color(68,69,68);
	private final Color COR_CINZA_CLARO = new Color(97,100,99);
	private final Color COR_LARANJA = new Color(242,143,60);
	
	public Teclado() {
		
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		
		setLayout(layout);
		
		c.weightx = 1;
		c.weighty = 1;
		c.fill = GridBagConstraints.BOTH;
		
		// Linha1
		c.gridwidth = 2;
		adiconarBotao("AC", COR_CINZA_ESCURO, c, 0, 0);
		c.gridwidth = 1;
		adiconarBotao("±", COR_CINZA_ESCURO, c, 2, 0);
		adiconarBotao("/", COR_LARANJA, c, 3, 0);

		// Linha2
		adiconarBotao("7", COR_CINZA_CLARO, c, 0, 1);
		adiconarBotao("8", COR_CINZA_CLARO, c, 1, 1);
		adiconarBotao("9", COR_CINZA_CLARO, c, 2, 1);
		adiconarBotao("*", COR_LARANJA, c, 3, 1);
		
		// Linha3
		adiconarBotao("4", COR_CINZA_CLARO, c, 0, 2);
		adiconarBotao("5", COR_CINZA_CLARO, c, 1, 2);
		adiconarBotao("6", COR_CINZA_CLARO, c, 2, 2);
		adiconarBotao("-", COR_LARANJA, c, 3, 2);
		
		// Linha4
		adiconarBotao("1", COR_CINZA_CLARO, c, 0, 3);
		adiconarBotao("2", COR_CINZA_CLARO, c, 1, 3);
		adiconarBotao("3", COR_CINZA_CLARO, c, 2, 3);
		adiconarBotao("+", COR_LARANJA, c, 3, 3);
		
		// Linha5
		c.gridwidth = 2;
		adiconarBotao("0", COR_CINZA_CLARO, c, 0, 4);
		c.gridwidth = 1;
		adiconarBotao(",", COR_CINZA_CLARO, c, 2, 4);
		adiconarBotao("=", COR_LARANJA, c, 3, 4);
			
	}

	private void adiconarBotao(String texto, Color cor, GridBagConstraints c, int x, int y) {
		
		c.gridx = x;
		c.gridy = y;
		Botao botao = new Botao(texto, cor);
		botao.addActionListener(this);
		add(botao, c);		
	}

	@Override // Pegando o texto do botao
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof JButton) {
			JButton botao = (JButton) e.getSource();
			Memoria.getInstancia().processarComando(botao.getText());
		}
		
	}
}
