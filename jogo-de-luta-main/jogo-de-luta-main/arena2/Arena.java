package arena2;

import java.util.Random;
import java.util.Scanner;

public class Arena {
	Scanner ler = new Scanner(System.in);

	int poder;

	public void lutar() {
		
		System.out.println("Qual seu nome bravo guerreiro!");
		String nome = ler.nextLine();
		Guerreiro g1 = new Guerreiro(nome);
		
		Oponentes oponente = new Oponentes();
		
		oponente.getLutador(g1);
			
	}
	//System.out.println("Quer jogar de novo? s/n");

}
