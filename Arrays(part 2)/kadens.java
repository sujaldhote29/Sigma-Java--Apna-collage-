public class kadens {

    public static int kadens_algo(int n[]){
        int cs=0;
        int ms = Integer.MIN_VALUE;
        
        for(int i =0; i<n.length;i++){
            cs+=n[i];
            if (cs<0) {
                cs=0;
            }
                ms = Math.max(ms, cs);
            
        }
        return  ms;
    }
    public static void main(String[] args) {
        int n[]={-2,-3,4,-1,-2,1,5,-3};

        System.out.println("the max sum of subarray is : "+kadens_algo(n));
    }
}
