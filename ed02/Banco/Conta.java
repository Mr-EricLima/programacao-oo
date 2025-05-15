
/**
 * Classe base que representa uma conta bancária genérica.
 */
public abstract class Conta {
    protected String cliente;
    protected double saldo;

    /**
     * Construtor da conta.
     * 
     * @param cliente Nome do cliente.
     * @param saldo   Saldo inicial da conta.
     */
    public Conta(String cliente, double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
    }

    /**
     * Realiza um depósito na conta.
     * 
     * @param valor Valor a ser depositado.
     */
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    /**
     * Realiza um saque da conta.
     * 
     * @param valor Valor a ser sacado.
     * @return true se o saque for bem-sucedido, false caso contrário.
     */
    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    /**
     * Transfere um valor para outra conta.
     * 
     * @param destino Conta de destino.
     * @param valor   Valor a ser transferido.
     */
    public void transferir(Conta destino, double valor) {
        if (this.sacar(valor)) {
            destino.depositar(valor);
        }
    }

    /**
     * Retorna o saldo atual da conta.
     * 
     * @return Saldo da conta.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Aplica juros diários na conta. Método abstrato.
     */
    public abstract void aplicarJurosDiarios();

    /**
     * Imprime o extrato da conta. Método abstrato.
     */
    public abstract void imprimirExtrato();
}
