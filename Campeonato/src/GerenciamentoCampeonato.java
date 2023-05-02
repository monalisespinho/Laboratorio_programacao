public class GerenciamentoCampeonato {

    public static void main(String[] args) {
       Equipe equipe1 = new Equipe("Loud", 5, 2, 3);
       Equipe equipe2 = new Equipe("Pain", 4, 5,1);
       Equipe equipe3 = new Equipe("Red Canids", 2,4,4);

       equipe1.registrarVitoria();
       equipe1.registrarDerrota();
       equipe1.registarEmpate();

       equipe2.registrarVitoria();
       equipe2.registrarDerrota();
       equipe2.registarEmpate();

       equipe3.registrarVitoria();
       equipe3.registrarDerrota();
       equipe3.registarEmpate();


    }
}
