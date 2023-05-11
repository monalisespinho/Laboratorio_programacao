package Ex2;

public class Dinheiro extends Pagamento{
    @Override
    public void realizarPagamentos() {
        System.out.println("Ex2.Pagamento com dinheiro realizado com sucesso!");

    }

    @Override
    public void emitirRecibo() {
        System.out.println("Emitindo recibo...");
    }
}
