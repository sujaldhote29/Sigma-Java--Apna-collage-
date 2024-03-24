

public class largest {
    public static int larger(int num[]){
        // int large = Integer.MIN_VALUE;
        // for(int i = 0; i<num.length; i++){
        //     if (large < num[i]) {
        //          large = num[i];
        //     }
        // }
        int large = num[0];
        for(int i =1; i<num.length-1; i++){
           large = Math.max(large, num[i]);
        }
        return large;
    }
    public static int smallest(int num[]){
        // int small = Integer.MAX_VALUE;
        // for(int i =0; i<num.length; i++){
        //     if (small>num[i]) {
        //         small = num[i];
        //     }
        // }

        int small = num[0];
        for(int i =1; i<num.length-1; i++){
           small = Math.min(small, num[i]);
        }
        return small;
    }
    public static void main(String[] args) {
        int num[] = {2,5,7,3,5};
        System.out.println(larger(num));
        System.out.println(smallest(num));
    }
}
