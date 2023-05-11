package Ex3;

public class Gato extends Animal{
    @Override
    public void comer() {
        System.out.println("Comendo Whiskas");

    }

    @Override
    public void dormir() {
        System.out.println("Dormindo em qualquer lugar");

    }

    @Override
    public void mover() {
        System.out.println("Caminhando...");
    }
}
