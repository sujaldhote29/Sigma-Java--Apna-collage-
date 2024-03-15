import java.util.*;
public class prime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number =  ");
        int n = sc.nextInt();
        boolean isprime = true;
        for(int i = 2 ; i< n ; i++){
            if (n%i==0) {
                isprime=false;
            }
        }
        if (isprime==true) {
            System.out.println("prime number");
        }
        else{
                        System.out.println(" Not prime number");

        }
        sc.close();
    }
}
