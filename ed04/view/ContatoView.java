package view;

import java.util.List;
import java.util.Scanner;
import model.Contato;

public class ContatoView {
    private Scanner scanner = new Scanner(System.in);

    public String lerEntrada(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public void exibirTabela(List<Contato> contatos) {
        System.out.printf("%-20s %-15s %-25s %-15s\n", "Nome", "Telefone", "Email", "CPF/CNPJ");
        for (Contato c : contatos) {
            System.out.printf("%-20s %-15s %-25s %-15s\n", 
                c.getNome(), c.getTelefone(), c.getEmail(), c.getIdentificador());
        }
    }
}
