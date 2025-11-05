
public class Professor extends Cadastro implements SenhaSistema {
	protected double salario;
	protected int senhaSistema;
	protected int senhaAcesso;
	
	public Professor(String nome, String cpf, String endereco, String telefone, double salario, int senhaSistema, int senha) {
		super(nome, endereco,cpf, telefone); // ta mandando os dados para classe mae
		this.salario = salario;
		this.senhaSistema = senhaSistema;
		this.senhaAcesso = senha;
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
