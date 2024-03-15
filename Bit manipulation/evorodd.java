import java.util.*;
public class evorodd {
    public static void bit_even_odd(int n){
        int bit_mask = 1;
        if ((n & bit_mask) ==0) {
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        bit_even_odd(n);
        sc.close();
    }
}
