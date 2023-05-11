package Ex4;

public class ArquivoAudio extends Arquivo{
    @Override
    public void abrir() {
        System.out.println("Abrindo Áudio..");

    }

    @Override
    public void fechar() {
        System.out.println("Fechando áudio...");
    }
}
