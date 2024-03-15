/**
 * The class x_powern calculates the power of a number x raised to the power of n using recursion.
 */
public class x_powern {
    public static int power(int x, int n){
        if (n==0) {
            return 1;
        }

        return x*power(x, n-1);
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        System.out.println(power(x, n));
    }
}
