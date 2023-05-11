package Ex8;

public class ImpressoraJatoTinta extends Impressora{
    @Override
    public void imprimir() {
        System.out.println("Imprimindo...");
    }

    @Override
    public void escanear() {
        System.out.println("Escaneando...");
    }
}
