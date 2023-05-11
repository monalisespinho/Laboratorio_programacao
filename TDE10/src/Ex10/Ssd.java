package Ex10;

public class Ssd extends DispositivoArmazenamento{
    @Override
    public void lerDados() {
        System.out.println("Lendo dados...");
    }

    @Override
    public void gravarDados() {
        System.out.println("Gravando dados...");
    }
}
