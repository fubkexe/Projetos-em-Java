package arena3;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

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
	String[] opcoes = {"Velocidade", "Força"};
	

	public void getLutador(Guerreiro g) {
		int busca = 0;
		
		while(busca == 0) {
			
			int round = ran.nextInt(poder.length);
			
			for(int i = 0; i < poder.length; i++) {
				
				if(poder[round][2] == 0) {
					poder[round][2] = 1;
					
					int escolha = JOptionPane.showOptionDialog(
				            null,
				            "Seu Oponente é " + oponente[round] + "Escolha entre Velocidade ou Força:",
				            "Escolha Atributo",
				            JOptionPane.DEFAULT_OPTION,
				            JOptionPane.QUESTION_MESSAGE,
				            null,
				            opcoes,
				            opcoes[0]
				        );
					
					
					if(escolha == 0) {
						if(g.velocidade > poder[round][0]) {
							JOptionPane.showMessageDialog(null, "Parabéns, você derrotou " + oponente[round]);
							vitoria++;
						}else {
							JOptionPane.showMessageDialog(null, "Infelizmente, você foi derrotado por  " + oponente[round]);
							derrota++;
							JOptionPane.showMessageDialog(null, "Vitórias: " + vitoria + " - Derrotas: " + derrota);
							busca = 1;
						}
							
					}else if(escolha == 1) {
						if(g.forca > poder[round][1]) {
							JOptionPane.showMessageDialog(null, "Parabéns, você derrotou " + oponente[round]);
							vitoria++;
						}else {
							JOptionPane.showMessageDialog(null, "Infelizmente, você foi derrotado por  " + oponente[round]);
							derrota++;
							JOptionPane.showMessageDialog(null, "Vitórias: " + vitoria + " - Derrotas: " + derrota);
							busca = 1;
						}
					}
					lutasRealizadas++;
					
				}else {
					
				}
			}
			
			if(lutasRealizadas == poder.length) {
				
				if(vitoria == poder.length) {
					JOptionPane.showMessageDialog(null, "Parabén " + g.guerreiro + ", Você provou ser o Melhor dos melhores");
					JOptionPane.showMessageDialog(null, "Vitórias: " + vitoria + " - Derrotas: " + derrota);
				}else {
					JOptionPane.showMessageDialog(null, "Parabén " + g.guerreiro + ", Você chegou na final. Considere um vencedor");
					JOptionPane.showMessageDialog(null, "Vitórias: " + vitoria + " - Derrotas: " + derrota);
					
				}
				busca = 1;
			}	
		}	
		
	}
	
	
}
