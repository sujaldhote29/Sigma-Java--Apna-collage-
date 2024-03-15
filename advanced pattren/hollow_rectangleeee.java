
public class hollow_rectangleeee {
    public static void hollow_rectangl(int total_row, int total_cols){
        // inner loop
        for(int i = 1; i<=total_row;i++){
            // outer loop
            for(int j = 1; j<=total_cols; j++){
                if (i==1 || i ==total_row || j==1 || j ==total_cols) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        hollow_rectangl(5  , 5);
    }
}
