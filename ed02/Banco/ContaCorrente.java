/**
 * Classe que representa uma conta corrente com juros diários de 0.1%.
 */
public class ContaCorrente extends Conta {

    public ContaCorrente(String cliente, double saldo) {
        super(cliente, saldo);
    }

    @Override
    public void aplicarJurosDiarios() {
        saldo += saldo * 0.001; // 0.1%
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato da Conta Corrente ===");
        System.out.println("Cliente: " + cliente);
        System.out.printf("Saldo: R$ %.2f\n\n", saldo);
    }
}
