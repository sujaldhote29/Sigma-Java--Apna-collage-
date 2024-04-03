// 1 or 2 stairs are allowed
public class Climbing_stairs {
    // Using Recurrsion Tc O(2^n)
    public static int ways1(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        
        return ways1(n - 1) + ways1(n - 2);
    }
    
    // using Memoization Tc O(n)
    
    public static int ways2(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        int dp[] = new int[n + 1];
        if (dp[n] != 0) {
            return dp[n];
        }
        
        dp[n] = ways2(n - 1) + ways2(n - 2);
        return dp[n];
    }
    
    public static int ways3(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <=n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
    
    // 1 or 2 stairs are allowed
    public static void main(String[] args) {
        int n = 5;
        System.out.println(ways1(n));
        System.out.println(ways2(n));
        System.out.println(ways3(n));

    }
}
