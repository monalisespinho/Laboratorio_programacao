package Ex9;

public class Caminhao extends Transporte{
    @Override
    public void carregar() {
        System.out.println("Carregando...");
    }

    @Override
    public void descarregar() {
        System.out.println("Descarregando...");
    }
}
