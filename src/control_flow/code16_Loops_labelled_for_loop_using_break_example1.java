package control_flow;

public class code16_Loops_labelled_for_loop_using_break_example1 {
    public static void main(String[] args) {
        aa:
        for (int i = 1; i <= 3; i++) {
            bb:
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break aa;
                }
                System.out.println(i + " " + j);
            }
        }
    }
}  