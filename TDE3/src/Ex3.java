import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number= 0;

        System.out.print("Digite um número inteiro positivo: ");
        number = input.nextInt();

        for(int i = 0; i <= 10; i++){
            System.out.println(number + " x " + i + "=" + (number*i));

        }


    }
}
