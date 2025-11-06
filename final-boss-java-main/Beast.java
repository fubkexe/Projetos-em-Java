
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
        new Beast("Lobo", 60, 200, 0),
        new Beast("Urso", 80, 150, 0),
        new Beast("Veado", 30, 250, 0),
        new Beast("Coelho", 10, 300, 0),
        new Beast("Puma", 70, 220, 0),
        new Beast("Tigre", 90, 180, 0),
        new Beast("Cervo", 40, 240, 0),
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