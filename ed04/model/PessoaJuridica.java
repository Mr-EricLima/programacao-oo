package model;

public class PessoaJuridica extends ContatoBase {
    private String cnpj;

    public PessoaJuridica(String nome, String telefone, String email, String cnpj) {
        super(nome, telefone, email);
        if (!cnpj.matches("\\d{14}")) {
            throw new IllegalArgumentException("CNPJ inválido. Deve conter 14 dígitos numéricos.");
        }
        this.cnpj = cnpj;
    }

    public String getCnpj() { return cnpj; }

    @Override
    public String getIdentificador() {
        return cnpj;
    }
}
