public class insertion {
    public static void sort(int n[]){
        for(int i =0; i<n.length; i++){
            int curr = n[i];
            int prev = i-1;
            while (prev>=0 && n[prev] > curr) {
                n[prev+1] = n[prev];
                prev--;
            }
            n[prev+1] = curr;
        }
    } 
    public static void main(String args[]){
        int n[] ={5,4,1,3,2};
        sort(n);
        for(int i =0 ; i<n.length; i++){
            System.out.print(n[i]+" ");
        }
    }
}
