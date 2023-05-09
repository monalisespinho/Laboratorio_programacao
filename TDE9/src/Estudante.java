public class Estudante extends Pessoa {
    public Estudante(String nome, int idade) {
        super(nome, idade);
    }

    public void estudar() {
        System.out.println("Estudante estudando");
    }
}
