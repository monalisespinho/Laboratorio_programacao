import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;

        System.out.print("Digite um número positivo: ");
        number = input.nextInt();

        if (number%2 == 0){
            System.out.print(number + " não é um número primo");
        }else if (number == 2){
            System.out.println(number + " é um número primo");
        }else{
            System.out.print( number + " é um número primo");
        }
        

    }
}
