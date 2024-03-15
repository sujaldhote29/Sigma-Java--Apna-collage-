
public class reverse {
    public static void revers(int n[]){
        int start = 0; 
        int end = n.length-1;
        while (start<end) {
            int temp =n[end];
            n[end] = n[start];
            n[start] = temp;
            start++;
            end--;
        }
        
        
    }
    
    public static void main(String[] args) {
        int n [] = {2,4,6,8};
        revers(n);
        for(int i = 0; i<n.length; i++){
            System.out.println(n[i]+" ");
        }
        System.out.println();
    }
}
