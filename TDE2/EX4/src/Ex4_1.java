import javax.swing.plaf.synth.SynthTabbedPaneUI;

public class Ex4_1 {
    public static void main(String[] args) {
        int x = 10;
        while (x < 1000){
            switch (x%2){
                case 0:
                    x = x +5;
                    break;
                default:
                    x = x * 2;
            }
            System.out.print(x + ", ");
        }
    }
}
