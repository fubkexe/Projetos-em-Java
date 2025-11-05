package arena3;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Arena {
	Scanner ler = new Scanner(System.in);

	int poder;

	public void lutar() {
		
		String nome = JOptionPane.showInputDialog("Ah, uma alma perdida nesse lugar, qual seu nome Guerreiro?!");
		
		Guerreiro g1 = new Guerreiro(nome);
		
		Oponentes oponente = new Oponentes();
		
		oponente.getLutador(g1);
			
	}
}

