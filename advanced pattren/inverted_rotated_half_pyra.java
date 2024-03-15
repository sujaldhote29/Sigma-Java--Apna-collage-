public class inverted_rotated_half_pyra{
    public static void rotated(int n){
        for(int i =1; i<=n; i++){
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k = 1 ; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        
        rotated(4);
    }
}