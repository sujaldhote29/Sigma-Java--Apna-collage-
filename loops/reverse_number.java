import java.util.*;
public class reverse_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number =  ");
        int n =sc.nextInt();
        int ld;
        
        while (n>0) {
             ld = n%10;
             System.out.print(ld);
             n = n/10;

        }
        sc.close();
    }
}
