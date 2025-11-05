import java.util.Scanner;

public  class AcessoSistema  {
	Scanner sc = new Scanner(System.in);
	public void autenticar(SenhaSistema s1) {
        
        System.out.print("Digite a senha: ");
        int senha = sc.nextInt();
        s1.senha(senha);
       
    }
	

	
}



