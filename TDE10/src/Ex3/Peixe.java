package Ex3;

public class Peixe extends Animal{
    @Override
    public void comer() {
        System.out.println("Comendo ração de peixe");

    }

    @Override
    public void dormir() {
        System.out.println("Dormindo...");
    }

    @Override
    public void mover() {
        System.out.println("Nadando..");
    }
}
