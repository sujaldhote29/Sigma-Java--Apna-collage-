public class grid_way {
    public static int countway(int i, int j, int n, int m) {
        if (i == n - 1 && j == m - 1) {
            return 1;
        } else if (i == n || j == m) {
            return 0;
        }

        int w1 = countway(i + 1, j, n, m);
        int w2 = countway(i, j + 1, n, m);
        return w1 + w2;
    }

    public static void main(String args[]) {
        int n = 4;
        int m = 4;
        System.out.println(countway(0, 0, n, m));

    }
}