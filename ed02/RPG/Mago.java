/**
 * Classe que representa um Mago com ataque mágico e baixa defesa.
 */
public class Mago extends Personagem {

    /**
     * Construtor do Mago com HP e ataque padrão.
     * 
     * @param nome Nome do mago.
     */
    public Mago(String nome) {
        super(nome, 100, 25);
    }

    @Override
    public void atacar(Personagem inimigo) {
        System.out.println(nome + " lança feitiço em " + inimigo.nome + "!");
        inimigo.defender(ataqueBase);
    }

    @Override
    public void defender(int dano) {
        hp -= dano;
        System.out.println(nome + " recebeu " + dano + " de dano.");
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " usa Bola de Fogo! (ataque em área - dano x2)");
        ataqueBase *= 2;
    }
}

