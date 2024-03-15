import java.util.*;
public class pow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number = ");
        int n = sc.nextInt();
        System.out.print("enter the power = ");
        int power = sc.nextInt();
        int result = 1;
        for (int i = 1; i <=power; i++) {
            result=result*n;
        }
        System.out.println(result);
        sc.close();
    }
}
