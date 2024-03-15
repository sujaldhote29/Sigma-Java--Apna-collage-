/**
 * The above Java class calculates the number of ways to tile a 2xN grid using 2x1 tiles.
 */


public class tilling_problem {
    public static int cross(int n){
        if (n==0 || n==1) {
            return 1;
        }
        int fnm1 = cross(n-1);
        int fnm2 = cross(n-2);
        int total_ways = fnm1+fnm2;
        return total_ways;
    }
    public static void main(String args[]){
        System.out.println(cross(4));
    }
}
