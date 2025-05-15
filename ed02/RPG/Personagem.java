/**
 * Classe abstrata que representa um personagem genérico de RPG.
 */
public abstract class Personagem {
    protected String nome;
    protected int hp;
    protected int ataqueBase;

    /**
     * Construtor da classe Personagem.
     * 
     * @param nome Nome do personagem.
     * @param hp Pontos de vida (Health Points).
     * @param ataqueBase Valor base de ataque.
     */
    public Personagem(String nome, int hp, int ataqueBase) {
        this.nome = nome;
        this.hp = hp;
        this.ataqueBase = ataqueBase;
    }

    /**
     * Realiza um ataque a outro personagem.
     * 
     * @param inimigo O personagem inimigo a ser atacado.
     */
    public abstract void atacar(Personagem inimigo);

    /**
     * Recebe dano e reduz o HP do personagem.
     * 
     * @param dano Quantidade de dano recebido.
     */
    public abstract void defender(int dano);

    /**
     * Usa uma habilidade especial, específica de cada tipo de personagem.
     */
    public abstract void usarHabilidadeEspecial();

    /**
     * Exibe o status atual do personagem.
     */
    public void status() {
        System.out.println(nome + " - HP: " + hp + " | Ataque Base: " + ataqueBase);
    }

    /**
     * Verifica se o personagem está vivo.
     * 
     * @return true se HP > 0, false caso contrário.
     */
    public boolean estaVivo() {
        return hp > 0;
    }
}
