public class Main {
    public static void main(String[] args) {
        //Exercicio 1
        Circulo circulo = new Circulo();
        circulo.raio = 4;
        System.out.println(circulo.calcularArea());
        System.out.println(circulo.calcularPerimetro());

      //Exercicio 2

      Livro meuLivro = new Livro();
      meuLivro.titulo = "Cem Chances";
      meuLivro.autor = "Ruth Oliveira";
      meuLivro.editora = "Violeta";
      meuLivro.numeroPaginas = 472;
      meuLivro.exibirDetalhes();

      //Exercicio 3

        Animal meuAnimal = new Animal();
        meuAnimal.nome= "gato";
        meuAnimal.idade = 2;
        meuAnimal.especie = "Siberiano";
        meuAnimal.emitirSom();
        meuAnimal.dormir();
    }
}