/**
 * The merge_sort class implements the merge sort algorithm to sort an array of integers in ascending
 * order.
 */

public class merge_sort {

    public static void printarr(int n[]) {
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
    }

    public static void sort(int n[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        
        sort(n, si, mid);
        sort(n, mid + 1, ei);

        merge(n, si, mid, ei);
    }

    public static void merge(int n[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= ei) {
            if (n[i] < n[j]) {
                temp[k] = n[i];
                i++;
            } else {
                temp[k] = n[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            temp[k++] = n[i++];
        }

        while (j <= ei) {
            temp[k++] = n[j++];
        }

        for (k = 0, i = si; k < temp.length; k++, i++) {
            n[i] = temp[k];
        }
    }

    public static void main(String args[]) {
        int n[] = { 5,2,4,3 };
        
        sort(n, 0, n.length - 1);
        printarr(n);




        // System.out.println(1);
    }
}
