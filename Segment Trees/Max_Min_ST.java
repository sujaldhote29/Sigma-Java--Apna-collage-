
// MaxlMin Element Queries
// Given an arr[], we have to answer few queries :
// a. Output MaxlMin for the subarray[i..jl
// b. Update the element at idx
// (6, 8, -1, 2, 17, 1, 3, 2, 4)
public class Max_Min_ST {
    static int tree[];

    public static void init(int n) {
        tree = new int[4 * n];
    }

    public static void buildST(int arr[], int i, int si, int sj) {
        if (si == sj) {
            tree[i] = arr[si];
            return;
        }

        int mid = (si + sj) / 2;
        buildST(arr, 2 * i + 1, si, mid);
        buildST(arr, 2 * i + 2, mid + 1, sj);

        tree[i] = Math.max(tree[2 * i + 1], tree[2 * i + 2]);

    }

    public static void update(int arr[], int idx, int newVal) {
        arr[idx] = newVal;
        int n = arr.length;
        updateUtil(0, 0, n - 1, idx, newVal);
    }

    public static void updateUtil(int i, int si, int sj, int idx, int newVal) {
        if (idx < si || idx > sj) {
            return;
        }

        if (si==sj) {
            tree[i] = newVal;
        }
        if (si != sj) {
            tree[i] = Math.max(tree[i], newVal);
            int mid = (si + sj) / 2;

            updateUtil(2 * i + 1, si, mid, idx, newVal);
            updateUtil(2 * i + 2, mid + 1, sj, idx, newVal);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 8, -1, 2, 17, 1, 3, 2, 4 };
        int n = arr.length;
        init(n);
        buildST(arr, 0, 0, n - 1);
        // for (int i = 0; i < tree.length; i++) {
        // System.out.print(tree[i]+" ");
        // }

        update(arr, 2, 20);

    }
}
