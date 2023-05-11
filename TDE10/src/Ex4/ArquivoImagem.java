package Ex4;

public class ArquivoImagem extends Arquivo{
    @Override
    public void abrir() {
        System.out.println("Abrindo imagem...");

    }

    @Override
    public void fechar() {
        System.out.println("Fechando imagem..");

    }
}
