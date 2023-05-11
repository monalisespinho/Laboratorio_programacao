package Ex7;

public class Goleiro extends Jogador{
    @Override
    public void atacar() {
        System.out.println("Ex7.Goleiro não pode atacar...");
    }

    @Override
    public void defender() {
        System.out.println("Ex7.Goleiro defendendo...");

    }
}
