import java.util.*;
public class dooo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        System.out.print("enter the number = ");
        int n = sc.nextInt();
        do{
            System.out.println(counter);
            counter++;
        }while(counter<n);
        sc.close();

    }
}