package arena2;

import java.util.Scanner;

public class Lutas {

public static void main(String[] args) {
		
		Arena arena = new Arena();
		Scanner ler = new Scanner(System.in);
		int lutar = 1;
		
		do {
			arena.lutar();
			
			System.out.println("Quer lutar novamente? 1 (sim) 0 (não)");
			lutar = ler.nextInt();
			
		} while(lutar == 1);
		
		System.out.println("Até a próxima");
	}

}
