public class sum_natural {
    public static int sum(int n ){
        if (n==0) {
            return 0;
        }
        int sum1 = n+sum(n-1);
        return sum1;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(sum(n));
    }
}
