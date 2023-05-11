package Ex2;

public class CartaoDebito extends Pagamento{
    @Override
    public void realizarPagamentos() {
        System.out.println("Ex2.Pagamento com cartão de Débito realizado com sucesso!");

    }

    @Override
    public void emitirRecibo() {
        System.out.println("Emitindo recibo...");
    }
}
