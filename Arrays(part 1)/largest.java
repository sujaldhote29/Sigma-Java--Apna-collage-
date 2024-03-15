

public class largest {
    public static int larger(int num[]){
        int large = Integer.MIN_VALUE;
        for(int i = 0; i<num.length; i++){
            if (large < num[i]) {
                 large = num[i];
            }
        }
        return large;
    }
    public static int smallest(int num[]){
        int small = Integer.MAX_VALUE;
        for(int i =0; i<num.length; i++){
            if (small>num[i]) {
                small = num[i];
            }
        }
        return small;
    }
    public static void main(String[] args) {
        int num[] = {2,5,7,3,5};
        System.out.println(larger(num));
        System.out.println(smallest(num));
    }
}
