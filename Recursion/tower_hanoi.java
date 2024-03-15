/**
 * The tower_hanoi class implements the Tower of Hanoi algorithm to solve the puzzle of moving a stack
 * of discs from one peg to another.
 */
public class tower_hanoi {
    public static void tower(int n, int A, int C, int B) {
        if (n == 0) {
            return;
        }
        tower(n - 1, A, B, C);
        System.out.println("Moving the " + n + " disc from " + A + " to " + C);
        tower(n - 1, B, C, A);
    }

    public static void main(String args[]) {
        tower(3, 1, 3, 2);
    }
}
