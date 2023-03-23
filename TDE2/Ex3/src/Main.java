public class Main {
    public static void main(String[] args) {
        int j = 1;
        for (int i = 0, cont = 0; cont < 15; cont++) {
            System.out.print(i + " ");
            i = i + j;
            j = i - j;
        }
    }
}