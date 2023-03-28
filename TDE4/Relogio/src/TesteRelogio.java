public class TesteRelogio {
    public static void main(String[] args) {
        Relogio relogio = new Relogio();
        relogio.acertarRelogio(3, 25, 50);
        System.out.println("Hora atual: " + relogio.lerHora() + " graus");
        System.out.println("Minuto atual: " + relogio.lerMinuto() + " graus");
        System.out.println("Segundo atual: " + relogio.lerSegundo() + " graus");
    }
}

