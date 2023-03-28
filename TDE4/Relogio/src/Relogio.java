public class Relogio {
    private Ponteiro ponteiroHora;
    private Ponteiro ponteiroMinuto;
    private Ponteiro ponteiroSegundo;

    public Relogio() {
        this.ponteiroHora = new Ponteiro();
        this.ponteiroMinuto = new Ponteiro();
        this.ponteiroSegundo = new Ponteiro();
    }

    public void acertarRelogio(int hora, int minuto, int segundo) {
        this.ponteiroHora.posicao(hora % 12);
        this.ponteiroMinuto.posicao(minuto);
        this.ponteiroSegundo.posicao(segundo);
    }

    public int lerHora() {
        return this.ponteiroHora.getPosicao() * 30;
    }

    public int lerMinuto() {
        return this.ponteiroMinuto.getPosicao() * 6;
    }

    public int lerSegundo() {
        return this.ponteiroSegundo.getPosicao() * 6;
    }
}

