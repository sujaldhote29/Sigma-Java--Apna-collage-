import java.util.*;

public class clear_ith {
    public static int ith(int n , int i){
        int bit_mask = ~(1<<i);
        return n&bit_mask;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the number : ");
        int n = sc.nextInt();
        System.out.println("enter the ith position : ");
        int i = sc.nextInt();
        System.out.println(ith(n, i));
        sc.close();
    }
}


