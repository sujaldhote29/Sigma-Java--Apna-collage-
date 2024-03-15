import java.util.Scanner;
public class avg_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of a =  ");
        int a = sc.nextInt();
        System.out.print("enter the value of b =  ");
        int b = sc.nextInt();
        System.out.print("enter the value of c =  ");
        int c = sc.nextInt();
        float avg = (a+b+c)/3;
        System.out.println(avg);
        sc.close();
    }
}
