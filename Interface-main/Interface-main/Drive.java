
public class Drive {

	public static void main(String[] args) {
		Professor  p1 = new Professor("ismael", "1234", "rua 1", "300.00", 100, 200, 123);
		Cordenador c1 = new Cordenador( "Pedro","4567", "rua 2", "200.00", 200, 300, 456);
		Aluno l1 = new Aluno(678);
		AcessoSistema as = new AcessoSistema();
		
		as.autenticar(p1);	
		as.autenticar(c1);
		as.autenticar(l1);

	}

}
