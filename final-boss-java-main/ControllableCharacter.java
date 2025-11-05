import javax.swing.JOptionPane;

import java.util.Random;

public class ControllableCharacter {
	Random ran = new Random();
	protected String jogador;
	protected int energia = 5;
	protected int saude = 3;
	protected int comida = 0;
	protected int agua = 0;
	
	public ControllableCharacter(String jogador, int energia, int saude, int comida, int agua, int i) {
		
		
		this.jogador = jogador;
		this.energia = energia;
		this.saude = saude;
		this.comida = comida;
		this.agua = agua;
		
		
		
		
			
		}
	
	public void mostrarStatus() {	
		String[] status = {
			    " Comida: " + comida,
			    " Água: " + agua,
			    " Saúde: " + saude,
			    " Energia: " + energia
			};

			System.out.println("\n===== STATUS ATUAL =====");
			for (String s : status) {
			   JOptionPane.showMessageDialog(null, s);
			}
			System.out.println("=========================\n");

			
		
	    

	  
	    if (saude <= 20) System.out.println("⚠️ Sua saúde está baixa!");
	    if (agua <= 10) System.out.println("⚠️ Você está desidratado!");
	    if (comida <= 10) System.out.println("⚠️ Você está com fome!");
	    System.out.println("=========================\n");
	}
	
	
	public void cacar() {
		if (energia < 3) {
			JOptionPane.showMessageDialog(null, "você está cansado demais pra caçar");
		}else {
			// escolhe uma besta aleatória da lista pública em Beast
			int indiceAleatorio = ran.nextInt(Beast.lista.length);
			Beast b = Beast.lista[indiceAleatorio];
			int dano = b.getRandomDamage(ran);
			
			String msg = "Você encontrou: " + b.getNome() + "\nDano potencial: " + dano +
				"\n(consome 3 de energia, +1 comida)";
			JOptionPane.showMessageDialog(null, msg);
			
			// aplicar efeitos simples: gastar energia e ganhar comida
			energia -= 3;
			if (energia < 0) energia = 0;
			comida += 1;
		}
		
	}

	
	
}

//int round = ran.nextInt(poder.length);