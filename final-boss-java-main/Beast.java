
import java.util.Random;
import java.util.Scanner;
public class Beast {
	
	
	private String nome;


	private int forca;


	private int velocidade;


	public Beast(String nome, int forca, int velocidade, int i) {
		this.nome = nome;
		this.forca = forca;
		this.velocidade = velocidade;
		
	
		
		
		
	}


	

	static Beast[]lista = {
			new Beast("Lobo", 60, 200, 0),
			new Beast("Urso", 40, 310, 0),
			new Beast("Veado", 60, 200, 0),
			new Beast("Coelho", 40, 310, 0),
			new Beast("Puma", 60, 200, 0),
			new Beast("Tigre", 40, 310, 0),
			new Beast("Cervo", 60, 200, 0),					
	};
	
	


	public int getRandomDamage(Random ran) {
		// TODO Auto-generated method stub
		return 0;
	}


	public String getNome() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
