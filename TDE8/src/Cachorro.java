public class Cachorro {
    String nome;
    String raca;
    int idade;

    public Cachorro(String nome, String raca, int idade){
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;

    }
    public Cachorro(String nome, String raca){
        this(nome, raca, 0);
    }

    public String toString(){
        return "Nome:  " + this.nome + ",Raça : " + this.raca + ",Idade: " + this.idade;
    }
}