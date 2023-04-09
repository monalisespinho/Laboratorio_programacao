public class Loja {
    Produto produto1;
    Produto produto2;
    Produto produto3;


    public void adicionarProduto(Produto produto){
        if (produto1 == null){
            produto1 = produto;
        } else if (produto2 == null) {
            produto2 = produto;
        } else if (produto3 == null) {
            produto3 = produto;
        }else {
            System.out.println("Estoque da loja cheio");
        }
    }

    public void removerProduto(Produto produto){
        if (produto1 == produto){
            produto1 = null;
        } else if (produto2 == produto) {
            produto2 = null;
        } else if (produto3 == produto) {
            produto3 = null;
        }else{
            System.out.println("Produto não encontrado");
        }

    }
    public  void listarProduto(){
        if (produto1 != null) {
            System.out.println("Produto 1: " + produto1.getNome() + ", Preço: " + produto1.getPreco() + ", Quantidade: " + produto1.getQuantidade());
        }
        if (produto2 != null) {
            System.out.println("Produto 2: " + produto2.getNome() + ", Preço: " + produto2.getPreco() + ", Quantidade: " + produto2.getQuantidade());
        }
        if (produto3 != null) {
            System.out.println("Produto 3: " + produto3.getNome() + ", Preço: " + produto3.getPreco() + ", Quantidade: " + produto3.getQuantidade());
        }
    }

    public  void venderProduto(Produto produto, int quantidade){
        if (produto.getQuantidade() > quantidade && produto != null){
            produto.setQuantidade(produto.getQuantidade() - quantidade);
            System.out.println("Venda realizada com sucesso");
        } else {
            System.out.println("Produto com estoque insuficiente");
        }

    }

    public void adicionarEstoque(Produto produto, int quantidade){
        if (produto != null){
            produto.setQuantidade(produto.getQuantidade() + quantidade);
            System.out.println("Estoque adicionado com sucesso");
        }

    }

}
