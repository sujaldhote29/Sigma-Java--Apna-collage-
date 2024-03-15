import java.util.Scanner;
public class areaofsquare {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
            System.out.print("enter the side of square = ");
            float side = scan.nextFloat();
            float area = side*side;
            System.out.println(area);
        scan.close();
    }
}
