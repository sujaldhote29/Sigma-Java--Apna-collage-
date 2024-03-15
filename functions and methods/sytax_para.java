import java.util.*;

public class sytax_para {
    public static int addition(int a,int b){  // a and b are called (Parameters or formal parameters)
        return a+b;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of a = ");
        int a =sc.nextInt();
        System.out.print("enter the value of b = ");
        int b =sc.nextInt();
        int sum = addition(a,b); // a and b are called (Argument or actual parameters)
        System.out.println("The sum is :  "+sum);
        sc.close();
    }
}
