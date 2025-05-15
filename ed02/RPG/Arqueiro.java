import java.util.Random;

/**
 * Classe que representa um Arqueiro com chance de ataque crítico.
 */
public class Arqueiro extends Personagem {
    private Random random;

    /**
     * Construtor do Arqueiro com HP e ataque padrão.
     * 
     * @param nome Nome do arqueiro.
     */
    public Arqueiro(String nome) {
        super(nome, 120, 18);
        random = new Random();
    }

    @Override
    public void atacar(Personagem inimigo) {
        boolean critico = random.nextDouble() < 0.3;
        int dano = critico ? ataqueBase * 2 : ataqueBase;
        System.out.println(nome + (critico ? " acerta um CRÍTICO em " : " ataca ") + inimigo.nome + " causando " + dano + " de dano!");
        inimigo.defender(dano);
    }

    @Override
    public void defender(int dano) {
        hp -= dano;
        System.out.println(nome + " recebeu " + dano + " de dano.");
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " usa Chuva de Flechas! (3 ataques)");
        for (int i = 0; i < 3; i++) {
            System.out.println("Ataque " + (i + 1));
        }
    }
}
