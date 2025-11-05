
public class Cordenador extends Cadastro  implements SenhaSistema {
	 double salario;
	 int senhaSistema;
	 int senha;
	 
		

	public Cordenador(String nome, String cpf, String endereco, String telefone, double salario,
			int senhaSistema, int senha) {
		super(nome, endereco,cpf, telefone); // ta mandando os dados para classe mae
		this.salario = salario;
		this.senhaSistema = senhaSistema;
		this.senha = senha;
	}







	@Override
	public void senha(int senhaS) {
		if (this.senhaSistema == senhaS) {
			System.out.println("Senha correta");
		}else {
			System.out.println("Senha incorreta");
		}
		
	}
	
	

}
