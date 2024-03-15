import java.util.*;
public class avg {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the value of a = ");
        float a = scan.nextFloat();
        System.out.print("enter the value of b  = ");
        float b = scan.nextFloat();
        System.out.print("enter the value of c = ");
        float c = scan.nextFloat();
        float avg = (a+b+c)/3;
        System.out.println(avg);
        scan.close();

    }
}
