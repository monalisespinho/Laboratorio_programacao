public class Gincana {
    private String nomeGincana;
    private int totalEstudantes;
    private Estudante estudanteVencedor;
    private int pontuacaoMaxima;

    public String getNomeGincana() {
        return nomeGincana;
    }

    public int getTotalEstudantes() {
        return totalEstudantes;
    }

    public Estudante getEstudanteVencedor() {
        return estudanteVencedor;
    }

    public int getPontuacaoMaxima() {
        return pontuacaoMaxima;
    }

    public void setNomeGincana(String nomeGincana) {
        this.nomeGincana = nomeGincana;
    }

    public void setTotalEstudantes(int totalEstudantes) {
        this.totalEstudantes = totalEstudantes;
    }

    public void setEstudanteVencedor(Estudante estudanteVencedor) {
        this.estudanteVencedor = estudanteVencedor;
    }

    public void setPontuacaoMaxima(int pontuacaoMaxima) {
        this.pontuacaoMaxima = pontuacaoMaxima;
    }

    public void adicionarEstudante(Estudante estudante){
        totalEstudantes++;
        if (estudante.getPontos()> pontuacaoMaxima){
            estudanteVencedor = estudante;
            pontuacaoMaxima = estudante.getPontos();

        }
    }
    public void exibirVencedor(){
        System.out.println("O estudante vencedor é " + estudanteVencedor.getNome() + " com " + pontuacaoMaxima + " pontos.");
    }
}

