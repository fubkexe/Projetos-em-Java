
	  
	    import javax.swing.JOptionPane;
import java.util.Random;

public class ControllableCharacter {
    Random ran = new Random();
    protected String jogador;
    protected int energia;
    protected int saude;
    protected int comida;
    protected int agua;

    public ControllableCharacter(String jogador, int energia, int saude, int comida, int agua, int i) {
        this.jogador = jogador;
        this.energia = energia;
        this.saude = saude;
        this.comida = comida;
        this.agua = agua;
    }

    // Mostrar status
    public void mostrarStatus() {
        String status = "===== STATUS ATUAL =====\n" +
                        "Jogador: " + jogador + "\n" +
                        "Comida: " + comida + "\n" +
                        "Água: " + agua + "\n" +
                        "Saúde: " + saude + "\n" +
                        "Energia: " + energia + "\n" +
                        "=========================";
        JOptionPane.showMessageDialog(null, status);
    }

    // Verificar se está vivo
    public boolean estaVivo() {
        if (saude <= 0) {
            JOptionPane.showMessageDialog(null, "☠️ Você morreu... sua saúde chegou a zero.");
            return false;
        }
        if (energia <= 0) {
            JOptionPane.showMessageDialog(null, "💤 Você desmaiou de exaustão. Fim de jogo.");
            return false;
        }
        if (comida <= 0) {
            JOptionPane.showMessageDialog(null, "🍖 Você morreu de fome. Fim de jogo.");
            return false;
        }
        if (agua <= 0) {
            JOptionPane.showMessageDialog(null, "💧 Você morreu de sede. Fim de jogo.");
            return false;
        }
        return true;
    }

    // Caçar
    public void cacar() {
        if (energia < 3) {
            JOptionPane.showMessageDialog(null, "Você está cansado demais pra caçar...");
            return;
        }

        Beast b = Beast.lista[ran.nextInt(Beast.lista.length)];
        int dano = b.getRandomDamage(ran);

        JOptionPane.showMessageDialog(null,
            "Você foi caçar e encontrou um " + b.getNome() + "!\n" +
            "Dano potencial: " + dano + "\n" +
            "Você luta e consegue comida, mas gasta energia.");

        energia -= 3;
        comida += 2;
        saude -= ran.nextInt(2);
        verificarLimites();
    }

    // Descansar
    public void descansar() {
        JOptionPane.showMessageDialog(null, "Você decide descansar e recuperar energia...");
        energia += 3;
        if (energia > 10) energia = 10;
        verificarLimites();
    }

    // Explorar (com chance de achar recursos ou bestas)
    public void explorar() {
        JOptionPane.showMessageDialog(null, "Você sai para explorar a ilha...");
        energia -= 2;
        comida -= 1;
        agua -= 1;

        int chance = ran.nextInt(100);

        if (chance < 25) {
            Beast b = Beast.lista[ran.nextInt(Beast.lista.length)];
            JOptionPane.showMessageDialog(null,
                "Durante a exploração, você encontrou um " + b.getNome() + "!\n" +
                "Conseguiu fugir, mas se feriu um pouco.");
            saude -= ran.nextInt(3);
        } 
        else if (chance < 50) {
            int frutas = 1 + ran.nextInt(3);
            comida += frutas;
            JOptionPane.showMessageDialog(null,
                "Você encontrou algumas frutas silvestres! 🍓\n(+ " + frutas + " de comida)");
        } 
        else if (chance < 70) {
            int aguaAchada = 1 + ran.nextInt(2);
            agua += aguaAchada;
            JOptionPane.showMessageDialog(null,
                "Você encontrou um pequeno riacho e bebeu um pouco. 💧\n(+ " + aguaAchada + " de água)");
        } 
        else if (chance < 85) {
            JOptionPane.showMessageDialog(null,
                "Você encontrou um abrigo improvisado e descansou um pouco. 🏕️\n(+1 de energia)");
            energia += 1;
        } 
        else {
            JOptionPane.showMessageDialog(null, "Você não encontrou nada de útil desta vez...");
        }

        verificarLimites();
    }

    // Corrige valores e aplica penalidades
    private void verificarLimites() {
        if (energia < 0) energia = 0;
        if (comida < 0) comida = 0;
        if (agua < 0) agua = 0;
        if (saude < 0) saude = 0;

        // Penalidade se estiver com fome ou sede
        if (comida == 0 || agua == 0) {
            saude -= 1;
        }
    }
}