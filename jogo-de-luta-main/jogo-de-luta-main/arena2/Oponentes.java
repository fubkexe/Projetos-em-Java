package arena2;

import java.util.Random;
import java.util.Scanner;

public class Oponentes {
	Scanner ler = new Scanner(System.in);
	Random ran = new Random();
	
	protected String[]oponente = {"Mamba Negra", "Chacal do Deserto", "Dama da Morte", "Naja",
								  "Paquiderme", "Múmia", "Mestre Orc", "Dr. Fúnebre",
								  "Morte Certa", "Monstro do Pântano"};
	
	protected int[][]poder = {{60, 200, 0},  //Mamba Negra
						      {40, 310, 0},  //Chacal
						      {60, 200, 0},  //Dama
						      {40, 310, 0},  //Naja
						      {60, 200, 0},  //Paquiderme
						      {40, 310, 0},  //Múmia
						      {60, 200, 0},  //Mestre
						      {40, 310, 0},  //Dr.
						      {60, 200, 0},  //Morte
						      {40, 310, 0}}; //Monstro
	protected int lutasRealizadas = 0;
	int vitoria = 0;
	int derrota = 0;	
	

	public void getLutador(Guerreiro g) {
		int busca = 0;
		
		while(busca == 0) {
			
			int round = ran.nextInt(poder.length);
			
			for(int i = 0; i < poder.length; i++) {
				
				if(poder[round][2] == 0) {
					poder[round][2] = 1;
					
					
					System.out.println("Seu Oponente é " + oponente[round] + ". Escolha 1 (velocidade), 2 (força)");
					int escolha = ler.nextInt();
					
					if(escolha == 1) {
						if(g.velocidade > poder[round][0]) {
							System.out.println("Parabéns, você derrotou " + oponente[round]);
							vitoria++;
						}else {
							System.out.println("Infelizmente, você foi derrotado por  " + oponente[round]);
							derrota++;
							System.out.println("Vitórias: " + vitoria + " - Derrotas: " + derrota);
							busca = 1;
						}
							
					}else if(escolha == 2) {
						if(g.forca > poder[round][1]) {
							System.out.println("Parabéns, você derrotou " + oponente[round]);
							vitoria++;
						}else {
							System.out.println("Infelizmente, você foi derrotado por  " + oponente[round]);
							derrota++;
							System.out.println("Vitórias: " + vitoria + " - Derrotas: " + derrota);
							busca = 1;
						}
					}
					lutasRealizadas++;
					
				}else {
					
				}
			}
			
			if(lutasRealizadas == poder.length) {
				
				if(vitoria == poder.length) {
					System.out.println("Parabén " + g.guerreiro + ", Você provou ser o Melhor dos melhores");
					System.out.println("Vitórias: " + vitoria + " - Derrotas: " + derrota);
				}else {
					System.out.println("Parabén " + g.guerreiro + ", Você chegou na final. Considere um vencedor");
					System.out.println("Vitórias: " + vitoria + " - Derrotas: " + derrota);
					
				}
				busca = 1;
			}	
		}	
		
	}
	
	
}
