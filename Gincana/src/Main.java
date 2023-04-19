public class Main {
    public static void main(String[] args) {

        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        Estudante estudante3 = new Estudante();
        Gincana gincana = new Gincana();

        estudante1.setNome("Monalise");
        estudante1.setIdade(20);
        estudante1.setPontos(30);

        estudante2.setNome("Lucas");
        estudante2.setIdade(21);
        estudante2.setPontos(20);

        estudante3.setNome("João");
        estudante3.setIdade(24);
        estudante3.setPontos(25);

        gincana.setNomeGincana("Gincana da Faculdade");
        gincana.setTotalEstudantes(3);
        gincana.adicionarEstudante(estudante1);
        gincana.adicionarEstudante(estudante2);
        gincana.adicionarEstudante(estudante3);

        gincana.exibirVencedor();

    }
}