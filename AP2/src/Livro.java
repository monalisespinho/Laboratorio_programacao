public class Livro extends Produto{
    private String autor;
    private int anoDePublicacao;
    private boolean disponibilidade;

    public Livro(String titulo, String autor, String editora, int anoDePublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.anoDePublicacao = anoDePublicacao;

    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public void setAnoDePublicacao(int anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }


    @Override
    public void detalhesDoProduto() {
            System.out.println("Titulo: " + getTitulo());
            System.out.println("Autor(a): " + getAutor());
            System.out.println("Editora: " + getEditora());
            System.out.println("Publicação: " + getAnoDePublicacao());
            System.out.println("_________________________________________________________________________");
        }

    public void setTitulo(String titulo, int numEdicao){
        setTitulo(titulo + " - Edicação " + numEdicao);
    }


}
