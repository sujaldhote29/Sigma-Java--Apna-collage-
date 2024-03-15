import java.util.*;

public class facat {
    public static int f(int n ){
        int fa = 1;
        for(int i = 1; i <=n; i++){
            fa*=i;
        }
        return fa;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int faf = f(n);
        System.out.println(faf);
        sc.close();
    }
}
