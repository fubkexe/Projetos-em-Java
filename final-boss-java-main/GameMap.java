import javax.swing.JOptionPane;

public class GameMap {

    public void sobreviver() {
        // Introdução
        String nome = JOptionPane.showInputDialog("Você acordou numa ilha deserta... sobreviva até a ajuda chegar!");
        ControllableCharacter j1 = new ControllableCharacter(nome, 10, 10, 0, 0, 0); // começa zerado

        JOptionPane.showMessageDialog(null, 
            "Você está com fome e sede, e o sol começa a se pôr.\n" +
            "É melhor se apressar e procurar recursos para sobreviver...");

        // Loop de 5 dias
        for (int dia = 1; dia <= 5; dia++) {
            JOptionPane.showMessageDialog(null, "🌅 Dia " + dia + " começa...");

            // Cada dia = 2 ações
            for (int turno = 1; turno <= 2; turno++) {
                String escolha = JOptionPane.showInputDialog(
                    "Ação " + turno + " do dia " + dia + ":\n" +
                    "1 - Caçar (consome energia, pode ganhar comida)\n" +
                    "2 - Descansar (recupera energia)\n" +
                    "3 - Explorar (gasta recursos, pode achar algo)\n"
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

                // ⚠️ Se morrer, fim imediato
                if (!j1.estaVivo()) {
                    JOptionPane.showMessageDialog(null, 
                        "💀 Fim da jornada. Você sobreviveu até o dia " + dia + ".");
                    return;
                }
            }

            JOptionPane.showMessageDialog(null, "🌙 A noite cai... você tenta descansar um pouco.");
            j1.descansar(); // recupera um pouco de energia automaticamente à noite
        }

        JOptionPane.showMessageDialog(null, "🚁 O resgate chegou! Você sobreviveu 5 dias na ilha!");
    }
}