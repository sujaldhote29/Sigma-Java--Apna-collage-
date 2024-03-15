public class floys_traingle {
    public static void main(String args[]){
        int n = 5;
        int num = 1;
        for(int lines = 1; lines <= n; lines++){
            for(int number = 1;number <=lines; number++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
