public class Ave extends Animal implements Treinavel{
    double envergarAsa;

    public Ave(String nome, int idade, double peso, String especie, double envergarAsa){
        super(nome, idade, peso, especie);
        this.envergarAsa = envergarAsa;
    }
    public double getEnvergarAsa() {
        return envergarAsa;
    }

    public void setEnvergarAsa(double envergarAsa) {
        this.envergarAsa = envergarAsa;
    }

    public void voar(){
        System.out.println("Ave está voando");

    }

    @Override
    public void realizarTruque() {

        System.out.println("Ave realizou o truque");
    }
}
