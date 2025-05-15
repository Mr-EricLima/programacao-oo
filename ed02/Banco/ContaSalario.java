/**
 * Classe que representa uma conta salário que não aplica juros.
 */
public class ContaSalario extends Conta {

    public ContaSalario(String cliente, double saldo) {
        super(cliente, saldo);
    }

    @Override
    public void aplicarJurosDiarios() {
        // Não aplica juros
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato da Conta Salário ===");
        System.out.println("Cliente: " + cliente);
        System.out.printf("Saldo: R$ %.2f\n\n", saldo);
    }
}
