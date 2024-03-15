

public class binary_serach {
    public static int search(int num[] , int a ){
        int start = 0; int end = num.length-1;
        while (start<=end) {
            int mid = (start+end)/2;
            if (num[mid]==a) {
                return mid;
            }
            if (num[mid]<a) {
                start = mid+1;
            }
            else{
               end =  mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[]= {2,4,6,8,10};
        int a = 78;
        System.out.println(search(num, a));
    }
}
