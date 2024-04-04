
public class zero_1knapsack {
    // Recurrsion
    public static int knapsack(int[] val, int[] wt, int i, int W) {
        if (W == 0 || i == 0) {
            return 0;
        }

        if (wt[i - 1] <= W) {
            int ans1 = val[i - 1] + knapsack(val, wt, i - 1, W - wt[i - 1]);

            int ans2 = knapsack(val, wt, i - 1, W);
            return Math.max(ans2, ans1);
        } else {
            return knapsack(val, wt, i - 1, W);
        }
    }

    // Memoization
    public static int knapsack(int[] val, int[] wt, int i, int W, int dp[][]) {
        if (W == 0 || i == 0) {
            return 0;
        }

        if (dp[i][W] != -1) {
            return dp[i][W];
        }
        if (wt[i - 1] <= W) {
            int ans1 = val[i - 1] + knapsack(val, wt, i - 1, W - wt[i - 1], dp);

            int ans2 = knapsack(val, wt, i - 1, W, dp);
            dp[i][W] = Math.max(ans2, ans1);
            return dp[i][W];
        } else {
            dp[i][W] = knapsack(val, wt, i - 1, W, dp);
            return dp[i][W];
        }
    }

    public static void printdp(int dp[][]){
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Tabulation
    public static int knapsack(int val[], int wt[], int W) {
        int n = val.length;
        int dp[][] = new int[n + 1][W + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;
        }

        for (int j = 0; j < dp[0].length; j++) {
            dp[0][j] = 0;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                int v = val[i-1];
                int w = wt[i-1];
                if (w<=j) {
                    int incProfit = v +dp[i-1][j-w];
                    int excProfit = dp[i-1][j];
                    dp[i][j] = Math.max(incProfit, excProfit);
                }else{
                    int excProfit = dp[i-1][j];
                    dp[i][j] = excProfit;

                }
            }
        }
        printdp(dp);
        return dp[n][W];
    }

    public static void main(String[] args) {
        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int W = 7;
        int dp[][] = new int[val.length + 1][W + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(knapsack(val, wt, val.length, W));
        System.out.println(knapsack(val, wt, val.length, W, dp));
        System.out.println(knapsack(val, wt, W));
    }
}
