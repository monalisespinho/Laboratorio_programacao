public class Veterinario extends Funcionario{
    String especialidades;

    public Veterinario(String nome, String cargo, double salario, String especialidades){
        super(nome, cargo, salario);
        this.especialidades = especialidades;
    }

   public void realizarExame(Animal animal){
       System.out.println("Veterinário realizando procedimento");
   }


}
