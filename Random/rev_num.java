import java.util.*;

public class rev_num {
    public static void num(int n) {
        Stack<Integer> s = new Stack<>();
        while (n > 0) {
            s.push(n % 10);
            n=n/10;
        }
        while (!s.isEmpty()) {
            System.out.print(s.pop());
        }
    }

    public static void main(String[] args) {
        num(69325);
    }
}
