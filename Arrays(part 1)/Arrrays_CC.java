
import java.util.*;
public class Arrrays_CC {
    public static void main(String[] args) {
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);
         
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("phy marks = " +marks[0]);
        System.out.println("chem marks = " +marks[1]);
        System.out.println("maths marks = "+ marks[2]);


        System.out.println(marks.length);
        sc.close();
    }
}
