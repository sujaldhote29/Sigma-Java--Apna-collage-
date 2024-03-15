import java.util.*;

public class positive_or_negative {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number =  ");
        int n = sc.nextInt();
        if (n >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
        sc.close();
    }
}
