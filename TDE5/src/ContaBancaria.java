public class ContaBancaria {
    public int numeroDaConta;
    public double saldo;
    public String titular;

    public void depositar(double valor){
       saldo += valor;
       System.out.println("Depósito de " + valor + " realizado na conta " + numeroDaConta);

    }
    public void sacar(double valor){
        if (saldo < valor){
            System.out.println("Saldo insuficiente para realizar saque");
        }else {
            System.out.println("Saque de " + valor + " realizado na conta " + numeroDaConta);

        }
    }

    public void trasnferir(double valor, ContaBancaria contaDestino){
        if (saldo < valor){
            System.out.println("Saldo insuficiente para realizar a tranferencia ");

        }else {
            saldo -= valor;
            contaDestino.saldo += valor;
            System.out.println("Transferencia de " + valor + " realizada da conta " + numeroDaConta + " para conta " + contaDestino.numeroDaConta);
        }
    }
}
