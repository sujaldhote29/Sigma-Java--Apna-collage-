import java.util.*;
public class palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number = ");
        int n = sc.nextInt();
        int rev = 0;
        int original = n;
        while (n>0) {
            int ld = n%10;
            rev = (rev*10)+ld;
            n = n/10;
        }
        if (original==rev) {
            System.out.println("Palindrome number");
        }
        else{
            System.out.println("Not a palindrome number");
        }
        sc.close();
    }
}
