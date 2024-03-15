import java.util.*;
public class evennn {
    public static boolean iseven(int n ){
        if (n%2==0) {
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number =  ");
        int n = sc.nextInt();
        System.out.println(iseven(n));
        sc.close();
    }
}
