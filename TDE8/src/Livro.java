public class Livro {
    String titulo;
    String autor;
    double preco;

    public Livro(String titulo, String autor, double preco){
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public Livro(String titulo, String autor){
        this(titulo, autor, 0.0);
    }

    public String toString(){
        return "Título:  " + this.titulo + ", Autor: " + this.autor + ", Preço: " + this.preco;
    }
}

