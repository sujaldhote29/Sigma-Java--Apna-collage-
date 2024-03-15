
public class count_of_7 {
    public static void main(String args[]){
        int n[][] = {{4,7,8},{8,7,7}};
        int count = 0;
        for(int i = 0; i<n.length; i++){
            for(int j = 0; j<n[0].length; j++){
                if (n[i][j]==7) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
