import java.util.*;

public class get_ith {

    public static int ith(int n, int i) {
        int bitmask = 1 << i;
        if ((n & bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }
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
