import controller.ContatoController;
import model.*;
import view.ContatoView;

public class Main {
    public static void main(String[] args) {
        ContatoController controller = new ContatoController();
        ContatoView view = new ContatoView();

        while (true) {
            view.exibirMensagem("\n1. Adicionar Pessoa Física\n2. Adicionar Pessoa Jurídica\n3. Listar Contatos\n4. Remover Contato\n5. Sair");
            String opcao = view.lerEntrada("Escolha uma opção: ");

            try {
                switch (opcao) {
                    case "1":
                        String nome = view.lerEntrada("Nome: ");
                        String tel = view.lerEntrada("Telefone: ");
                        String email = view.lerEntrada("Email: ");
                        String cpf = view.lerEntrada("CPF (11 dígitos): ");
                        controller.adicionarContato(new PessoaFisica(nome, tel, email, cpf));
                        break;
                    case "2":
                        nome = view.lerEntrada("Nome: ");
                        tel = view.lerEntrada("Telefone: ");
                        email = view.lerEntrada("Email: ");
                        String cnpj = view.lerEntrada("CNPJ (14 dígitos): ");
                        controller.adicionarContato(new PessoaJuridica(nome, tel, email, cnpj));
                        break;
                    case "3":
                        view.exibirTabela(controller.listarContatos());
                        break;
                    case "4":
                        String id = view.lerEntrada("Informe CPF ou CNPJ do contato a remover: ");
                        if (controller.removerContato(id)) {
                            view.exibirMensagem("Contato removido com sucesso.");
                        } else {
                            view.exibirMensagem("Contato não encontrado.");
                        }
                        break;
                    case "5":
                        System.exit(0);
                    default:
                        view.exibirMensagem("Opção inválida.");
                }
            } catch (Exception e) {
                view.exibirMensagem("Erro: " + e.getMessage());
            }
        }
    }
}
