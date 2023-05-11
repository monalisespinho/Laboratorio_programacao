package Ex3;

public class Cachorro extends Animal{
    @Override
    public void comer() {
        System.out.println("Comendo ração.");

    }

    @Override
    public void dormir() {
        System.out.println("Dormindo na casinha");

    }

    @Override
    public void mover() {
        System.out.println("Correndo...");
    }
}
