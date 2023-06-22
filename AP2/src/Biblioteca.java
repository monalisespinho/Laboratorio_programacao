public class Biblioteca {
    public  Livro l1;
    public  Livro l2;
    public  Livro l3;

    public  Livro l4;

    public Livro l5;


    public void detalhesDoProduto(Livro livro){
        if (l1 == null){
            System.out.println("Livro não encontrado.");
        }else if (l2 == null){
            System.out.println("Livro não encontrado.");
        }else if (l3 == null){
            System.out.println("Livro não encontrado.");
        }else if (l4 == null){
            System.out.println("Livro não encontrado.");
        }else if (l5 == null){
            System.out.println("Livro não encontrado.");
        }
    }
    public void adicionarLivro(Livro livro){
        if (l1 == null){
            l1 = livro;
        } else if (l2 == null) {
            l2 = livro;
        } else if (l3 == null) {
            l3 = livro;
        } else if (l4 == null) {
            l4 = livro;
        } else if (l5 == null) {
            l5  = livro;
        } else if (l1 != null && l2 != null && l3 != null && l4 != null && l5 != null) {
            l2 = l3;
            l3 = l4;
            l4 = l5;
        }
    }

    public void removerLivro(Livro livro){
        if (l1 == livro){
            l1 = null;
            System.out.println("Livro removido:");
        }else if (l2 == livro) {
            l2 = null;
            System.out.println("Livro removido:");
        }else if (l3 == livro) {
            l3 = null;
            System.out.println("Livro removido:");
        }else if (l4 == livro) {
            l4 = null;
            System.out.println("Livro removido:");
        }else  if (l5 == livro) {
            l5 = null;
            System.out.println("Livro removido:");
        }else {
            System.out.println("Livro não encontrado");
        }
    }
    public void atualizarLivro(Livro livro, String novoTitulo, String novoAutor,  String novaEditora, int novoAnoDePublicacao){
        if (l1 == livro){
            l1.setTitulo(novoTitulo);
            l1.setAutor(novoAutor);
            l1.setAnoDePublicacao(novoAnoDePublicacao);
            l1.setEditora(novaEditora);
        } else if (l2 == livro) {
            l2.setTitulo(novoTitulo);
            l2.setAutor(novoAutor);
            l2.setAnoDePublicacao(novoAnoDePublicacao);
            l2.setEditora(novaEditora);
        } else if (l3 == livro) {
            l3.setTitulo(novoTitulo);
            l3.setAutor(novoAutor);
            l3.setAnoDePublicacao(novoAnoDePublicacao);
            l3.setEditora(novaEditora);
        } else if (l4 == livro) {
            l4.setTitulo(novoTitulo);
            l4.setAutor(novoAutor);
            l4.setAnoDePublicacao(novoAnoDePublicacao);
            l4.setEditora(novaEditora);
        } else if (l5 == livro) {
            l5.setTitulo(novoTitulo);
            l5.setAutor(novoAutor);
            l5.setAnoDePublicacao(novoAnoDePublicacao);
            l5.setEditora(novaEditora);
        }else{
            System.out.println("Livro não encontrado na biblioteca");
        }

    }

    public boolean disponibilidadeLivro(Livro livro) {
        if (l1 == null) {
            return false;
        }else if (l2 == null) {
            return false;
        }else if (l3 == null) {
            return false;
        }else if( l4 == null){
            return false;
        }else if (l5 == null){
            return false;
        }else {
            return true;
        }

    }
}
