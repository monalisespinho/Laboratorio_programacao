import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;

        System.out.print("Digite um número positivo: ");
        number = input.nextInt();

        for (int i = 0; i <= number; i++){
            if (i%2 == 0){
                System.out.println(i);
            }
        }
    }
}
