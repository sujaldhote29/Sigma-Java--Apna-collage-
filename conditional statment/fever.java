import java.util.*;

public class fever {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the temprature  = ");
        double n = sc.nextDouble();
        if (n > 100) {
            System.out.println("You have a fever");
        } else {
            System.out.println("You dont have a fever");
        }
        sc.close();
    }
}
