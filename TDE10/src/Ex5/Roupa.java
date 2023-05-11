package Ex5;

public class Roupa extends Produto{
    String marca;
    String tamanho;
    double preco;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public void calcularPreco() {
        System.out.println("O preço da roupa está: " + getPreco());
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Marca: " + getMarca() + ", Tamanho: " + getTamanho() + ", preço: " + getPreco());
    }
}
