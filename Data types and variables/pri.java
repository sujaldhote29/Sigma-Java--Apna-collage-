import java.util.*;

public class pri {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int div = 2;
        boolean isPrime = false;

        while (div < n) {
            if (n % div == 0) {
                isPrime = true;
                break;
            }
            div++;
        }

        if (isPrime) {
            System.out.println(" Not Prime");
        } else {
            System.out.println("Prime");
        }

        sc.close();
    }
}
