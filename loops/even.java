import java.util.*;
public class even {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        int c;
        int evensum = 0;
        int oddsum = 0;
        do{
            System.out.println("enter the number = ");
            n = sc.nextInt();
            if (n%2==0) {
                evensum+=n;
            }
            else{
                oddsum+=n;
            }
            System.out.println("yes 1 for no 0");

            c = sc.nextInt();

        }while(c==1);
        System.out.println(evensum);
        System.out.println(oddsum);
        sc.close();
    }
}
