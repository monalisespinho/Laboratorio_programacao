public class ProdutoPerecivel extends Produto{
    private String dataValidade;

    public ProdutoPerecivel(int codigo, double preco, String dataValidade) {
        super(codigo, preco);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }
    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
