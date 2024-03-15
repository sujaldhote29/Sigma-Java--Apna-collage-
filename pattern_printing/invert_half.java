public class invert_half {
    public static void main(String args[]){
        int  n = 5;
        for(int lines = 1; lines<=n; lines++){
            for(int number = 1; number<=n-lines+1; number++){
                System.out.print(number);
            }
            System.out.println();
        }
    }
}
