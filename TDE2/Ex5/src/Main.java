public class Main {
    public static void main(String[] args) {
        int dia = 31;
        int mes = 5;
        int ano = 1982;

        if (ano < 1900 || ano > 2999 || mes < 1 || mes > 12 || dia < 1 || dia > 31) {
            System.out.println("Data inválida");
        }else if((dia <= 31)&& (mes<=12)){
            if (((dia > 28) && (mes == 2))
                    || ((dia == 31) && ((mes ==4) || (mes ==6) || (mes ==9) || (mes == 11)))){
                System.out.println("Data válida");
            }else {
                System.out.println("Data válida");
            }
        }else {
            System.out.println("Data inválida");
        }
    }
}