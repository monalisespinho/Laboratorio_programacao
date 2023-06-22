public class Main {
    public static void main(String[] args) {
        //Capacidade de Animais e Funcionários no Zoológico
        Zoo zoo = new Zoo(5,3);

        //Criando os animais
        Animal animal1 = new Animal("Arara-azul", 2, 2.5,"Ave" );
        Animal animal2 = new Animal("Elefante", 4, 7000, "Mamífero");
        Animal animal3 = new Animal("Sucuri", 1, 1.3,"Ovíparo");
        Animal animal4 = new Animal("Orangotango",5, 10.6, "Mamífero");
        Animal animal5 = new Animal("Tucano",3, 1.2, "Ave");
        Animal animal6 = new Animal("Novo Animal", 7, 5.8,"Nova espécie");

        //Criando funcionários
        Funcionario funcionario1 = new Funcionario("André", "Faxineiro", 1500);
        Funcionario funcionario2 = new Funcionario("Silvia", "Adestradora", 2500);
        Funcionario funcionario3 = new Funcionario("Alexandre", "Serviços gerais", 2000);
        Funcionario funcionario4 = new Funcionario("Novo funcionario", "novo cargo", 1000);

        //Adicionando animais no Zoológico
        zoo.adicionarAnimal(animal1);
        zoo.adicionarAnimal(animal2);
        zoo.adicionarAnimal(animal3);
        zoo.adicionarAnimal(animal4);
        zoo.adicionarAnimal(animal5);
        zoo.adicionarAnimal(animal6);

        //Exibindo os animais do Zoológico
        zoo.exibirAnimais();

        //Adicionando funcionários
        zoo.adicionarFuncionarios(funcionario1);
        zoo.adicionarFuncionarios(funcionario2);
        zoo.adicionarFuncionarios(funcionario3);
        zoo.adicionarFuncionarios(funcionario4);

        //Exibir Funcionários do Zoológico
        zoo.exibirFuncionarios();

        //Veterinário realizando procedimento
        Veterinario veterinario = new Veterinario("Roberto", "Veterinário",3500, "Mamíferos" );
        veterinario.realizarExame(animal4);

        //Mamífero amamentando
        Mamifero mamifero = new Mamifero("Elefante", 4, 7000, "Mamífero", "Escuro");
        mamifero.amamentar();

        //Ave voando
        Ave ave = new Ave("Tucano",3, 1.2, "Ave", 20);
        ave.realizarTruque();
        ave.voar();


        //Movimentação
        animal3.movimentar("Rastejando em ziguezague");
        animal3.movimentar();
    }
}