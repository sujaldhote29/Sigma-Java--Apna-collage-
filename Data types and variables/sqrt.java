import java.util.*;
public class sqrt {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number =  ");
        int n = sc.nextInt();
        for (int i = 2; i <=n; i++) {
            if ((n/i)==i) {
                System.out.print(i);
                
            }
            
            sc.close();
        }

    }
}