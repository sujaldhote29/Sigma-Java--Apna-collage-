import java.util.*;
public class income_tax_calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number =  ");
        float n = sc.nextInt();
        if (n<500000) {
            System.out.println("no tax");
        }
        else if (n>500000 && n<1000000) {
            float tax = n *.20f;
            System.out.println(tax);
        }
        else if (n>100000) {
            float tax = n*.30f;
            System.out.println(tax);
        }
        sc.close();
    }
}
