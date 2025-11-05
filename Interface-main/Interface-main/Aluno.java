
public class Aluno implements SenhaSistema {
	
	private int senhaSistema;
	

	public Aluno(int senhaSistema) {
		this.senhaSistema = senhaSistema;
	}


	@Override
	public void senha(int senhaS) {
		  if (this.senhaSistema == senhaS) {
	            System.out.println("Senha correta");
	        } else {
	            System.out.println("Senha incorreta");
	        }
		
		
	}
	
		
		
	}


