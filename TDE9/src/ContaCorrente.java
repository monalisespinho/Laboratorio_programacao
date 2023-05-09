public class ContaCorrente extends Conta {
    double limite;

    public ContaCorrente(double saldo, int numero, double limite) {
        super(saldo, numero);
        this.limite = limite;
    }
}
