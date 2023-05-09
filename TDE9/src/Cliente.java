public class Cliente extends Pessoa {
    private int numeroCartao;

    public Cliente(String nome, String endereco, int numeroCartao) {
        super(nome, endereco);
        this.numeroCartao = numeroCartao;
    }

    public int getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(int numeroCartao) {
        this.numeroCartao = numeroCartao;
    }
}
