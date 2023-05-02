public class Estudante {
    private String nome;
    private int matricula;
    private String curso;

    public Estudante(String nome, int matricula, String curso ){
        this.nome = nome;
        this.matricula= matricula;
        this.curso = curso;

    }

    public Estudante(String nome, int matricula){
        this(nome, matricula, "Sem curso");
    }
    public String toString(){
        return "Nome " + this.nome +", Matrícula: " + this.matricula + ", Curso: " + this.curso;
    }

}
