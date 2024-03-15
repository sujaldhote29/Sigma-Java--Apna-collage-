import java.util.*;

public class bino_coffi {
    public static int formula(int n, int r, int p ){
        int a= 1 ;
        int b= 1;
        int c =1 ;
        for(int i = 1; i<=n;i++){
            a*=i;
        }
        for(int j = 1; j<=r;j++){
            b*=j;
        }
        for(int h = 1; h<=p;h++){
            c*=h;
        }
         return a/(b*c);
    
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int p = n - r;
        System.out.println(formula(n,r,p));
        sc.close();
    }

}
