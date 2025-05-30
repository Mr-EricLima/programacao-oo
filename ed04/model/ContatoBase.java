package model;

public abstract class ContatoBase implements Contato {
    private String nome;
    private String telefone;
    private String email;

    public ContatoBase(String nome, String telefone, String email) {
        setNome(nome);
        this.telefone = telefone;
        this.email = email;
    }

    public void setNome(String nome) {
        if (nome == null || nome.length() < 3) {
            throw new IllegalArgumentException("Nome deve ter pelo menos 3 caracteres.");
        }
        this.nome = nome;
    }

    public String getNome() { return nome; }
    public String getTelefone() { return telefone; }
    public String getEmail() { return email; }

    public void setTelefone(String telefone) { this.telefone = telefone; }
    public void setEmail(String email) { this.email = email; }
}
