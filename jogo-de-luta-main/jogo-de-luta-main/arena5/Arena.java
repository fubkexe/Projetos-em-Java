package arena5;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Arena {
	Scanner ler = new Scanner(System.in);

	int poder;

	public void lutar() {
		
		String nome = JOptionPane.showInputDialog("Qual seu nome bravo guerreiro!");
		
		Guerreiro g1 = new Guerreiro(nome);
		
		Oponentes oponente = new Oponentes();
		
		oponente.getLutador(g1);
			
	}
}
