 public class ClimbingStairs {
    public static int climbStairs(int n) {
       if (n==0 || n==1) {
            return 1;
        }
       
        return climbStairs(n-1)+climbStairs(n-2);
    }

    public static void main(String[] args) {
        int r = climbStairs(4);
        System.out.println(r);
    }
}