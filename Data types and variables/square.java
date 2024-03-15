import java.util.*;

public class square {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number =  ");
        int n = sc.nextInt();
        int temp = n % 10;
        int real = n - temp;
        int square = real * real + temp * temp + 2 * temp * real;
        System.out.println(square);
        sc.close();
    }
}
