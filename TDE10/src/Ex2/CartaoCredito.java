package Ex2;

public class CartaoCredito extends Pagamento{
    @Override
    public void realizarPagamentos() {
        System.out.println("Paagamento com cartão de crédito realizado com sucesso");
    }

    @Override
    public void emitirRecibo() {
        System.out.println("Emitindo nota do cartão de crédito...");

    }
}

