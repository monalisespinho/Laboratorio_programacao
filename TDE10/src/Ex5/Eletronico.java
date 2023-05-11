package Ex5;

public class Eletronico extends Produto{
    @Override
    public void calcularPreco() {
        System.out.println("O preço do produto é: ");
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Marca:   , preço:    ,garantia:    ");
    }
}
