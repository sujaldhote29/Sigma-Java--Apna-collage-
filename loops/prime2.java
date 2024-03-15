import java.util.*;

public class prime2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number =  ");
        int n = sc.nextInt();
        boolean isprime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isprime = false;
                break;
            }
        }
        if (isprime == true) {
            System.out.println("Prime number ");
        } else {
            System.out.println("Not Prime number ");

        }
        sc.close();
    }
}
