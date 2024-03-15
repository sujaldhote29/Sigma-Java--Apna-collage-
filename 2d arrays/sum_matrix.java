

public class sum_matrix {
    public static void main(String args[]){
        int n[][] = {{1,4,9},{11,4,3},{2,2,3}};
        int sum = 0;
        for(int i =0; i<n.length; i++){
           sum+=n[i][2];
        }
        System.out.println(sum);
    }
}
