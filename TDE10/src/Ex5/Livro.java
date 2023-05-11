package Ex5;

public class Livro extends Produto{
    String título;
    String autor;
    double preco;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public void calcularPreco() {
        System.out.println("o preço do livro é: " + preco);

    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Título: " + getTítulo() + ", Autor(a): " + getAutor() + ", preço: "+getPreco());
    }
}
