/**
 * Classe que representa um Guerreiro com forte ataque físico.
 */
public class Guerreiro extends Personagem {

    /**
     * Construtor do Guerreiro com HP e ataque padrão.
     * 
     * @param nome Nome do guerreiro.
     */
    public Guerreiro(String nome) {
        super(nome, 150, 20);
    }

    @Override
    public void atacar(Personagem inimigo) {
        System.out.println(nome + " ataca " + inimigo.nome + " com golpe físico!");
        inimigo.defender(ataqueBase);
    }

    @Override
    public void defender(int dano) {
        int danoReduzido = dano / 2;
        hp -= danoReduzido;
        System.out.println(nome + " defendeu e recebeu apenas " + danoReduzido + " de dano.");
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " usa Golpe Duplo!");
        ataqueBase *= 2;
    }
}
