
public class grid_way2 {
    public static int factorial(int n){
        if (n==1) {
            return 1;
        }
        return n*factorial(n-1);
    }

    public static int count(int x, int y, int z){
        int fact1 = factorial(x);
        int fact2 = factorial(y);
        int fact3 = factorial(z);
        int ways = fact1/(fact2*fact3);
        return ways;
    }
    public static void main(String args[]){
        int n = 3, m = 3;
        int x = n-1+m-1;
        int y = n-1;
        int z = m-1;
        System.out.println(count(x, y, z));


    }
}
