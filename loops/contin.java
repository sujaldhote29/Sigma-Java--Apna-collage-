import java.util.*;
public class contin {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number =  ");
        int n = sc.nextInt();
        for(int i = 1; i<=n ; i++){
            if (i==23) {
                continue;
            }
            System.out.println(i);
        }
        sc.close();
    }
}
