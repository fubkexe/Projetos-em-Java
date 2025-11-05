package arena5;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Personagem {
	
	ImageIcon chacal = new ImageIcon("src/arena5/Chacal_do_Deserto.png");
	ImageIcon dama = new ImageIcon("src/arena5/Dama_da_Morte.png");
	ImageIcon drFunebre = new ImageIcon("src/arena5/Dr_Funebre.png");
	ImageIcon mamba = new ImageIcon("src/arena5/Mamba_Negra.png");
	ImageIcon monstroPantano = new ImageIcon("src/arena5/Monstro_do_Pantano.png");
	ImageIcon morte = new ImageIcon("src/arena5/Morte_Certa.png");
	ImageIcon mumia = new ImageIcon("src/arena5/Mumia_do_Farao.png");
	ImageIcon naja = new ImageIcon("src/arena5/Naja_Revoltada.png");
	ImageIcon orc = new ImageIcon("src/arena5/orcSinistro.png");
	ImageIcon paquiderme = new ImageIcon("src/arena5/Paquiderme_Noturno.png");
	
	protected String[]oponente = {"Mamba Negra", "Chacal do Deserto", "Dama da Morte", "Naja",
			  "Paquiderme", "Múmia", "Mestre Orc", "Dr. Fúnebre",
			  "Morte Certa", "Monstro do Pântano"};


	
	String[] opcoes = {"Velocidade", "Força"};
	
	public String oponente(int oponentes) {
		
		return oponente[oponentes];
	}

	public int figura(int oponente) {
		int arma = 0;
		System.out.println("Entrada" + oponente);
		if(oponente == 0) {
			
			JOptionPane.showMessageDialog(
		            null,
		            this.oponente[oponente],
		            null, JOptionPane.INFORMATION_MESSAGE,
		            mamba
		        );
			
			arma = JOptionPane.showOptionDialog(
		            null,
		            "Seu Oponente é " + this.oponente[oponente] + " Escolha entre Velocidade ou Força:",
		            "Escolha Atributo",
		            JOptionPane.DEFAULT_OPTION,
		            JOptionPane.QUESTION_MESSAGE,
		            null,
		            opcoes,
		            opcoes[0]);		            	
		}

		if(oponente == 1) {
			
			JOptionPane.showMessageDialog(
		            null,
		            this.oponente[oponente],
		            null, JOptionPane.INFORMATION_MESSAGE,
		            chacal
		        );
			
			arma = JOptionPane.showOptionDialog(
		            null,
		            "Seu Oponente é " + this.oponente[oponente] + " Escolha entre Velocidade ou Força:",
		            "Escolha Atributo",
		            JOptionPane.DEFAULT_OPTION,
		            JOptionPane.QUESTION_MESSAGE,
		            null,
		            opcoes,
		            opcoes[0]);		            	
		}
		
		if(oponente == 2) {
			
			JOptionPane.showMessageDialog(
		            null,
		            this.oponente[oponente],
		            null, JOptionPane.INFORMATION_MESSAGE,
		            dama
		        );
			
			arma = JOptionPane.showOptionDialog(
		            null,
		            "Seu Oponente é " + this.oponente[oponente] + " Escolha entre Velocidade ou Força:",
		            "Escolha Atributo",
		            JOptionPane.DEFAULT_OPTION,
		            JOptionPane.QUESTION_MESSAGE,
		            null,
		            opcoes,
		            opcoes[0]);		            	
		}
		
		if(oponente == 3) {
			
			JOptionPane.showMessageDialog(
		            null,
		            this.oponente[oponente],
		            null, JOptionPane.INFORMATION_MESSAGE,
		            naja
		        );
			
			arma = JOptionPane.showOptionDialog(
		            null,
		            "Seu Oponente é " + this.oponente[oponente] + " Escolha entre Velocidade ou Força:",
		            "Escolha Atributo",
		            JOptionPane.DEFAULT_OPTION,
		            JOptionPane.QUESTION_MESSAGE,
		            null,
		            opcoes,
		            opcoes[0]);		            	
		}		
		
		if(oponente == 4) {
			
			JOptionPane.showMessageDialog(
		            null,
		            this.oponente[oponente],
		            null, JOptionPane.INFORMATION_MESSAGE,
		            paquiderme
		        );
			
			arma = JOptionPane.showOptionDialog(
		            null,
		            "Seu Oponente é " + this.oponente[oponente] + " Escolha entre Velocidade ou Força:",
		            "Escolha Atributo",
		            JOptionPane.DEFAULT_OPTION,
		            JOptionPane.QUESTION_MESSAGE,
		            null,
		            opcoes,
		            opcoes[0]);		            	
		}		
		
		if(oponente == 5) {
			
			JOptionPane.showMessageDialog(
		            null,
		            this.oponente[oponente],
		            null, JOptionPane.INFORMATION_MESSAGE,
		            mumia
		        );
			
			arma = JOptionPane.showOptionDialog(
		            null,
		            "Seu Oponente é " + this.oponente[oponente] + " Escolha entre Velocidade ou Força:",
		            "Escolha Atributo",
		            JOptionPane.DEFAULT_OPTION,
		            JOptionPane.QUESTION_MESSAGE,
		            null,
		            opcoes,
		            opcoes[0]);		            	
		}		
		
		if(oponente == 6) {
			
			JOptionPane.showMessageDialog(
		            null,
		            this.oponente[oponente],
		            null, JOptionPane.INFORMATION_MESSAGE,
		            orc
		        );
			
			arma = JOptionPane.showOptionDialog(
		            null,
		            "Seu Oponente é " + this.oponente[oponente] + " Escolha entre Velocidade ou Força:",
		            "Escolha Atributo",
		            JOptionPane.DEFAULT_OPTION,
		            JOptionPane.QUESTION_MESSAGE,
		            null,
		            opcoes,
		            opcoes[0]);		            	
		}
		
		if(oponente == 7) {
			
			JOptionPane.showMessageDialog(
		            null,
		            this.oponente[oponente],
		            null, JOptionPane.INFORMATION_MESSAGE,
		            drFunebre
		        );
			
			arma = JOptionPane.showOptionDialog(
		            null,
		            "Seu Oponente é " + this.oponente[oponente] + " Escolha entre Velocidade ou Força:",
		            "Escolha Atributo",
		            JOptionPane.DEFAULT_OPTION,
		            JOptionPane.QUESTION_MESSAGE,
		            null,
		            opcoes,
		            opcoes[0]);		            	
		}
		
		if(oponente == 8) {
			
			JOptionPane.showMessageDialog(
		            null,
		            this.oponente[oponente],
		            null, JOptionPane.INFORMATION_MESSAGE,
		            morte
		        );
			
			arma = JOptionPane.showOptionDialog(
		            null,
		            "Seu Oponente é " + this.oponente[oponente] + " Escolha entre Velocidade ou Força:",
		            "Escolha Atributo",
		            JOptionPane.DEFAULT_OPTION,
		            JOptionPane.QUESTION_MESSAGE,
		            null,
		            opcoes,
		            opcoes[0]);		            	
		}
		
		if(oponente == 9) {
			
			JOptionPane.showMessageDialog(
		            null,
		            this.oponente[oponente],
		            null, JOptionPane.INFORMATION_MESSAGE,
		            monstroPantano
		            
		        );
			
			arma = JOptionPane.showOptionDialog(
		            null,
		            "Seu Oponente é " + this.oponente[oponente] + " Escolha entre Velocidade ou Força:",
		            "Escolha Atributo",
		            JOptionPane.DEFAULT_OPTION,
		            JOptionPane.QUESTION_MESSAGE,
		            null,
		            opcoes,
		            opcoes[0]);		            	
		}		
		
		return arma;
	}

}
