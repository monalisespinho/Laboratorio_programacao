public class Main {
    public static void main(String[] args) {
        // Criar livros
        Livro livro1 = new Livro("Rainha Charlotte", "Julia Quinn","Arqueiro", 2023);
        Livro livro2 = new Livro("A hipótese do Amor", "Ali Hazelwood", "Arqueiro", 2022);
        Livro livro3 = new Livro("A sereia", "Kiera Cass", "Seguinte", 2009);
        Livro livro4 = new Livro("Harry Potter e a Pedra Filosofal", "J.K Rowling", "Rocco", 2017);
        Livro livro5 = new Livro("Por Lugares Incríveis", "Jeniffer Niven", "Seguinte", 2015);

        // Criar biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Adicionar livros à biblioteca
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);
        biblioteca.adicionarLivro(livro4);
        biblioteca.adicionarLivro(livro5);


        // Exibir detalhes dos livros na biblioteca
        System.out.println("Detalhes dos livros na biblioteca:");
        livro1.detalhesDoProduto();
        livro2.detalhesDoProduto();
        livro3.detalhesDoProduto();
        livro4.detalhesDoProduto();
        livro5.detalhesDoProduto();

        // Remover um livro da biblioteca
        biblioteca.removerLivro(livro1);
            if (biblioteca.l1==null){
                livro1.detalhesDoProduto();
            }else{
                biblioteca.l1.detalhesDoProduto();
            }



         //Atualizar detalhes de um livro na biblioteca
        biblioteca.atualizarLivro(livro4, "Juntando os pedaços", "Jeniffer Niven", "Seguinte",2016 );
        biblioteca.l4.detalhesDoProduto();

        //Verificar se um livro está disponível
        boolean disponivel = biblioteca.disponibilidadeLivro(livro1);
        System.out.println("O livro " + livro1.getTitulo() + " está disponível na biblioteca? " + (disponivel == true? "Disponível" : "Indisponível"));
    }

}

