import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero, soma = 0;
        int i = 0;

        System.out.print("Digite um número inteiro positivo: ");
        numero= input.nextInt();

        while(i <= numero){
            soma += i;
            i++;
        }
        System.out.println("A soma dos númerso naturais até " + numero + " é: " + soma);
    }
}
