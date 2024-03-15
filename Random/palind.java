import java.util.*;
public class palind {
    public static boolean check(String str){
        int n = str.length(); 
        str = str.toLowerCase();
        for (int i = 0; i < n/2; i++) {
            if (str.charAt(i)!=str.charAt(n-i-1)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string = ");
        String str = sc.next();

        System.out.println(check(str));
        sc.close();
    }
}
