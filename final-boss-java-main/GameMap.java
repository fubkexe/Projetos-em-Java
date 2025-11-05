import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class GameMap {
	Scanner ler = new Scanner(System.in);
	
	public void sobreviver() {
		String nome = JOptionPane.showInputDialog("“Você acordou numa ilha... sobreviva até a ajuda chegar”");
		String historia = JOptionPane.showInputDialog("Você avista uma floresta logo a frente, talvez seja sua melhor chance de ficar vivo antes do anoitecer...");
		JOptionPane.showMessageDialog(null, "Procure por suprimentos antes que seja tarde");
		ControllableCharacter j1 = new ControllableCharacter(nome, 0, 0, 0, 0, 0);
		
		Beast b1 = Beast.lista[0];
		Beast b2 = Beast.lista[1];
		
	}

}
