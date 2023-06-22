public class Zoo {
    private Animal[] animais;
    private Funcionario[] funcionarios;
    private int numAnimais;
    private int numFuncionarios;

    public Zoo(int capacidadeAnimais, int capacidadeFuncionarios){
        animais = new Animal[capacidadeAnimais];
        funcionarios = new Funcionario[capacidadeFuncionarios];
        numFuncionarios = 0;
        numAnimais = 0;
    }

    public void adicionarAnimal(Animal animal){
        if (numAnimais < animais.length){
            animais[numAnimais] = animal;
            numAnimais++;
            System.out.println("Animal adicionado com sucesso!!");
        }else {
            System.out.println("O zoológico ja está cheio! :(");
        }
    }
    public void adicionarFuncionarios(Funcionario funcionario){
        if (numFuncionarios < funcionarios.length){
            funcionarios[numFuncionarios] = funcionario;
            numFuncionarios++;
            System.out.println("Funcionário adicionado com sucesso!!");
        }else {
            System.out.println("Todas as vagas de funcionários foram preenchidas! :(");
        }

    }

    public Animal[] getAnimais(){
        return animais;
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public void exibirAnimais(){
        System.out.println("Animais no Zoológico:");
        for(int i = 0; i<numAnimais; i++){
            System.out.println("Nome: " + animais[i].getNome());
            System.out.println("Idade: " + animais[i].getIdade());
            System.out.println("Peso: " + animais[i].getPeso());
            System.out.println("Espécie: " + animais[i].getEspecie());
            System.out.println("________________________________________________________");
        }
    }
    public void exibirFuncionarios(){
        for (int i = 0; i < numFuncionarios; i++){
            System.out.println("Nome: " + funcionarios[i].getNome());
            System.out.println("Cargo: " + funcionarios[i].getCargo());
            System.out.println("Salário: " + funcionarios[i].getSalario());
            System.out.println("________________________________________________________");
        }
    }
}
