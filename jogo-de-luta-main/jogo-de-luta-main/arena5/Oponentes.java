package arena5;

import java.util.Random;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Oponentes {
	Scanner ler = new Scanner(System.in);
	Random ran = new Random();
	
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
	
	int vidas = 3;
	
	Personagem pers = new Personagem();
	

	public void getLutador(Guerreiro g) {
		int busca = 0;
		
		while(busca == 0) {
			
			int round = ran.nextInt(poder.length);
			
			for(int i = 0; i < poder.length; i++) {
				
				if(poder[round][2] == 0) {
					
					poder[round][2] = 1;
					
					int escolha = pers.figura(round);
					
					
					System.out.println("Retorno" + escolha);	
					
					
					if(escolha == 0) {
						if(g.velocidade > poder[round][0]) {
							JOptionPane.showMessageDialog(null, "Parabéns, você derrotou " + pers.oponente(round));
							vitoria++;
						}else {
							JOptionPane.showMessageDialog(null, "Infelizmente, você foi derrotado por  " + pers.oponente(round));
							derrota++;	
							vidas--;
							JOptionPane.showMessageDialog(null, "Vitórias: " + vitoria + " - Derrotas: " + derrota + " Vidas: " + vidas);
							
						}
							
					}else if(escolha == 1) {
						if(g.forca > poder[round][1]) {
							JOptionPane.showMessageDialog(null, "Parabéns, você derrotou " + pers.oponente(round));
							vitoria++;
						}else {
							JOptionPane.showMessageDialog(null, "Infelizmente, você foi derrotado por  " + pers.oponente(round));
							derrota++;
							vidas--;
							JOptionPane.showMessageDialog(null, "Vitórias: " + vitoria + " - Derrotas: " + derrota + " Vidas: " + vidas);
						}
					}
					lutasRealizadas++;
					
				}else {
					
				}
			}
			
			if(vidas == 0) {
				busca = 1;
			}
			
			
			if(lutasRealizadas == poder.length) {
				
				if(vitoria == poder.length) {
					JOptionPane.showMessageDialog(null, "Parabéns " + g.guerreiro + ", Você provou ser o melhor Guerreiro da Arena");
					JOptionPane.showMessageDialog(null, "Vitórias: " + vitoria + " Derrotas " + derrota + " Vidas: " + vidas);
				}else {
					JOptionPane.showMessageDialog(null, "Parabéns " + g.guerreiro + ", Você chegou na final. Considere um vencedor");
					JOptionPane.showMessageDialog(null, "Vitórias: " + vitoria + " - Derrotas: " + derrota + " Vidas: " + vidas);
					
				}
				busca = 1;
			}	
		}	
		
	}
	
	
}
