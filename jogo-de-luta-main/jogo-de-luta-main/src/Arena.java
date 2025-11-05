import java.util.Scanner;
public class Arena {
	
	public boolean Lutar(Guerreiro g1, Adversarios y, int escolha) {
		Scanner Escolha = new Scanner(System.in);
		System.out.println("Escolha seu atributo para Lutar!!");
		String atributo = Escolha.nextLine();
		
		if(escolha == 0) {
			System.out.println("Você escolheu força");
			
			if (g1.getforca() > (y.getforca())) {
				
				System.out.println("Sua força superou o inimigo, você Venceu!!");
				
				
			}else if(escolha == 1) {
				System.out.println("Você escolheu velocidade");
				
				if(g1.getvelocidade() > (y.getvelocidade())) {
					System.out.println("Sua velocidade superou o inimigo, você Venceu!!");
				}
				
				
			}else {
				System.out.println("O inimigo foi mais forte, tente novamente em outra vida...");
				
			}
			 Arena arena = new Arena();
			 arena.Lutar(g1, y, escolha);
		}
	
	
	}
}