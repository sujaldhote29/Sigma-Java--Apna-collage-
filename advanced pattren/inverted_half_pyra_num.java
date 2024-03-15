

public class inverted_half_pyra_num {
    public static void num(int n ){
        // int num = 1;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n-i+1; j++){
                System.out.print(j);
                // num++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        num(5);
    }
}
