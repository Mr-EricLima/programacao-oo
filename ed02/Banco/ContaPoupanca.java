/**
 * Classe que representa uma conta poupança com juros diários de 0.08%.
 */
public class ContaPoupanca extends Conta {

    public ContaPoupanca(String cliente, double saldo) {
        super(cliente, saldo);
    }

    @Override
    public void aplicarJurosDiarios() {
        saldo += saldo * 0.0008; // 0.08%
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato da Conta Poupança ===");
        System.out.println("Cliente: " + cliente);
        System.out.printf("Saldo: R$ %.2f\n\n", saldo);
    }
}
