public class CountingSort {
    public static void main(String[] args) {
        int arr[] = {3,1,5,2,6};
        int max = arr[0];
        for (int i : arr) {
            if (i>max) {
                max = i;
            }
        }

        int count[] = new int[max+1];

        for(int i =0; i<arr.length; i++){
            count[arr[i]]++;
        }
        int j =0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]>0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
