

public class sorted_arr {

    public static int binary(int n[], int key , int si, int ei){
        if (si>ei) {
            return -1;
        }
        int mid = si+(ei-si)/2;
        if (n[mid]==key) {
            return mid;
        }
        if (n[si]<=n[mid]) {
            if (n[si]<=key && key<=n[mid]) {
                return binary(n, key, si, mid-1);
            }else{
                return binary(n, key, mid+1, ei);
            }
        }

        else{
            if (n[mid]<=key && key<=n[ei]) {
                return binary(n, key, mid +1, ei);
            }else{
                return binary(n, key, si,mid -1);

            }
        }
    }
    public static void main(String[] args) {
        int n[] = {4,5,6,7,0,1,2};
        System.out.println(binary(n, 0, 0, n.length-1));

    }
}
