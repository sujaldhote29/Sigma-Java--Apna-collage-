// import java.lang.reflect.Array;

public class SubArray_sum {

    public static int sum1(int[] arr){
        int currsum= 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i =0; i<arr.length; i++){
            for(int j =i; j<arr.length; j++){
                currsum =0;
                for(int k =i; k<=j; k++){
                    currsum+=arr[k];
                }
                // System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int arr[] =  {-1,2,-2,-1,3};
        System.out.println(sum1(arr));

    }
}
