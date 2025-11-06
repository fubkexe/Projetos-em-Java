import javax.swing.JOptionPane;

public class GameMap {

    public void sobreviver() {
        // Introdução
        String nome = JOptionPane.showInputDialog("Você acordou numa ilha... sobreviva até a ajuda chegar!");
        ControllableCharacter j1 = new ControllableCharacter(nome, 10, 10, 5, 5, 0);

        JOptionPane.showMessageDialog(null, 
            "Você avista uma floresta logo à frente...\nTalvez seja sua melhor chance de sobreviver antes do anoitecer.");

        // Loop de 5 dias
        for (int dia = 1; dia <= 5; dia++) {
            JOptionPane.showMessageDialog(null, "🌅 Dia " + dia + " começa...");

            String escolha = JOptionPane.showInputDialog(
                "Escolha uma ação:\n" +
                "1 - Caçar (consome 3 energia, pode ganhar comida)\n" +
                "2 - Descansar (recupera energia)\n" +
                "3 - Explorar (gasta recursos, chance de encontrar algo)\n"
            );

            if (escolha.equals("1")) {
                j1.cacar();
            } else if (escolha.equals("2")) {
                j1.descansar();
            } else if (escolha.equals("3")) {
                j1.explorar();
            } else {
                JOptionPane.showMessageDialog(null, "Opção inválida! Você perdeu tempo precioso...");
            }

            j1.mostrarStatus();

            // ⚠️ Se o jogador morrer, o jogo termina
            if (!j1.estaVivo()) {
                JOptionPane.showMessageDialog(null, "💀 Fim da jornada. Você sobreviveu até o dia " + dia + ".");
                return;
            }
        }

        JOptionPane.showMessageDialog(null, "🚁 O resgate chegou! Você sobreviveu 5 dias na ilha!");
    }
}