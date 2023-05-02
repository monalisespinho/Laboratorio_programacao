public class Main {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante("Mona", 0001, "Análise e Desenvolvimento de Sistema");
        Estudante estudante2 = new Estudante("Mari", 0002, "Biologia");
        System.out.println(estudante1);
        System.out.println(estudante2);

        Livro livro1 = new Livro("O duque e eu", "Julia Quinn", 34.50);
        Livro livro2 = new Livro("O visconde que me amava", "Julia Quinn", 35.80);
        System.out.println(livro1);
        System.out.println(livro2);

        Cachorro cachorro1 = new Cachorro("Mel", "Shitzu", 5);
        Cachorro cachorro2 = new Cachorro("Snoppy", "pincher", 2);
        System.out.println(cachorro1);
        System.out.println(cachorro2);
    }
}