/**
 * The "friend_pairing" class calculates the number of ways to pair up friends given a group size.
 */


public class friend_pairing {
    public static int pairing(int n){
        if (n==1 || n==2) {
            return n;
        }
        int fnm1 = pairing(n-1);
        int fnm2 = pairing(n-2);
        int pair_ways = (n-1)*fnm2;
        return fnm1+pair_ways;
    }
    public static void main(String args[]){
        System.out.println(pairing(3));
    }
}
