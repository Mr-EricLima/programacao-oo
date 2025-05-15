/**
 * Classe principal que testa os personagens do jogo RPG.
 */
public class MainRpg {
    public static void main(String[] args) {
        Guerreiro g = new Guerreiro("Thorgal");
        Mago m = new Mago("Merlino");
        Arqueiro a = new Arqueiro("Legolis");

        System.out.println("=== Status Inicial ===");
        g.status();
        m.status();
        a.status();

        System.out.println("\n=== Batalha ===");
        g.atacar(m);           // Thorgal ataca Merlino
        m.usarHabilidadeEspecial(); // Merlino usa Bola de Fogo
        a.usarHabilidadeEspecial(); // Legolis usa Chuva de Flechas

        System.out.println("\n=== Status Final ===");
        g.status();
        m.status();
        a.status();
    }
}
