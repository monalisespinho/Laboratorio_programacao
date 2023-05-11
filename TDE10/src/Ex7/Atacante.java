package Ex7;

public class Atacante extends Jogador{

    @Override
    public void atacar() {
        System.out.println("Ex7.Atacante atancando..");
    }

    @Override
    public void defender() {
        System.out.println("Ex7.Atacante defendendo ...");
    }

}
