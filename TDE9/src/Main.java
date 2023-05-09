public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Monalise", 30);
        Funcionario funcionario = new Funcionario("Amanda", 25, "Gerente");

        Veiculo veiculo = new Veiculo("Ford", "Fiesta");
        Carro carro = new Carro("Toyota", "Corolla", 5);

        FiguraGeométrica figura = new FiguraGeométrica();
        double areaFigura = figura.calcularArea();
        double perimetroFigura = figura.calcularPerimetro();

        Quadrado quadrado = new Quadrado(5.0);
        double areaQuadrado = quadrado.calcularArea();
        double perimetroQuadrado = quadrado.calcularPerimetro();

        Conta conta = new Conta(1000.0, 12345);
        ContaCorrente contaCorrente = new ContaCorrente(500.0, 67890, 1000.0);

        Animal animal = new Animal();
        animal.emitirSom();

        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.latir();


        Estudante estudante = new Estudante("Monalise", 20);
        estudante.falar();
        estudante.andar();
        estudante.estudar();

        Produto produto = new Produto(123, 10.0);
        produto.setCodigo(456);
        produto.setPreco(20.0);

        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel(789, 15.0, "31/12/2023");
        produtoPerecivel.setCodigo(1011);
        produtoPerecivel.setPreco(25.0);
        produtoPerecivel.setDataValidade("31/12/2024");

        Animal animal1 = new Animal();
        animal.mover();

        Peixe peixe = new Peixe();
        peixe.mover();

        Pessoa pessoa3 = new Pessoa("Fulano", "Rua A, 123");
        Cliente cliente = new Cliente("Beltrano", "Rua B, 456", 1234);
        cliente.setEndereco("Rua C, 789");
        cliente.setNumeroCartao(5678);

        Animal animal3 = new Animal();
        animal3.emitirSom(); // imprime "Som genérico de animal"

        Gato gato = new Gato();
        gato.emitirSom(); // imprime "Miau!"

    }
}