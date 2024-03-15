import java.util.*;
public class odd_even {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the integer =  ");
        int n = sc.nextInt();
        int sum = 0;
        if (n%2==0) {
            for(int i = 0 ; i <= n ; i++){
                
                sum = i+sum;
            }
            System.out.println(sum);
        }
        if (n%2==1) {
            for(int i = 0 ; i<=n ; i++){
                sum = sum +i;
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
