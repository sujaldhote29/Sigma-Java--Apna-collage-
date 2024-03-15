import java.util.Scanner;
public class factori {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long fact = 1;
        System.out.print("enter the number =  ");
        float n = sc.nextFloat();
     
        for (int i = 1; i <=n; i++) {
            fact=fact*i;
        }
        System.out.println(fact);
        sc.close();
    }
}
