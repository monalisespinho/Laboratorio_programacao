public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Qboa", 6.49, 5);
        Produto p2 = new Produto("Brilhante", 12.99, 4);
        Produto p3 = new Produto("Amaciante Downy", 21.99, 6);

        Loja loja = new Loja();

        loja.adicionarProduto(p1);
        loja.adicionarProduto(p2);
        loja.adicionarProduto(p3);


        loja.venderProduto(p1, 3);
        loja.venderProduto(p2, 2);
        loja.venderProduto(p3, 2);
        loja.listarProduto();
        loja.removerProduto(p3);
        loja.listarProduto();
        loja.adicionarEstoque(p2, 6);
        loja.listarProduto();





    }
}


