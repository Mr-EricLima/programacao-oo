package model;

public class PessoaFisica extends ContatoBase {
    private String cpf;

    public PessoaFisica(String nome, String telefone, String email, String cpf) {
        super(nome, telefone, email);
        if (!cpf.matches("\\d{11}")) {
            throw new IllegalArgumentException("CPF inválido. Deve conter 11 dígitos numéricos.");
        }
        this.cpf = cpf;
    }

    public String getCpf() { return cpf; }

    @Override
    public String getIdentificador() {
        return cpf;
    }
}
