public class Pessoa {
    String nome;
    int idade;
    String endereco;

    public Pessoa(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }


    public void falar() {
        System.out.println("Pessoa falando");
    }

    public void andar() {
        System.out.println("Pessoa andando");
    }
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}


