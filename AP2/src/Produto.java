abstract class Produto {

    String titulo;

    String editora;


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        editora = editora;
    }


    public abstract void detalhesDoProduto();


}
