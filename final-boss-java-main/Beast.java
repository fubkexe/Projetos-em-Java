

 import java.util.Random;

public class Beast {
    private String nome;
    private int forca;
    private int velocidade;

    public Beast(String nome, int forca, int velocidade, int i) {
        this.nome = nome;
        this.forca = forca;
        this.velocidade = velocidade;
    }

    // Lista de bestas disponíveis
   static Beast[] lista = {
            new Beast("Lobo", 6, 10),
            new Beast("Urso", 8, 5),
            new Beast("Veado", 3, 2),
            new Beast("Coelho", 1, 5),
            new Beast("Puma", 7, 8),
            new Beast("Tigre", 9, 10),
            new Beast("Cervo", 2, 5)
    };

    public String getNome() {
        return nome;
    }

    public int getRandomDamage(Random ran) {
        int variacao = ran.nextInt(20) - 10; // ±10 de variação
        int dano = forca + variacao;
        return Math.max(0, dano);
    }
}
