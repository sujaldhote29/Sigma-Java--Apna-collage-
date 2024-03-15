public class sum_of_n{
    public static void sum(int n ){
        int sum = 0;
        // int k ;
        
        while (n>0) {
            int ld;
            ld = n%10;
            sum= sum+ld;
            n =  n/10;
        }
        System.out.println(sum);
    }
    public static void main(String args[]){
        sum(23);
    }
}