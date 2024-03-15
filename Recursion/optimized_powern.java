public class optimized_powern {
    public static int optimized(int a, int n){
        if (n==0) {
            return 1;
        }
        int halfpower = optimized(a, n/2);
        int halfpowersq = halfpower*halfpower;
        if (n%2!=0) {
            halfpowersq = a*halfpowersq;
        }
        return halfpowersq;
    }
    public static void main(String[] args) {
        int a = 2; 
        int n = 5;
        System.out.println(optimized(a, n));
    }
}
