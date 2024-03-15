import java.util.Scanner;

public class items {
    // Bill of 3 items
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the price of pencil = ");
        float pencil = scan.nextFloat();
        System.out.print("enter the price of pen = ");
        float pen = scan.nextFloat();
        System.out.print("enter the price of eraser = ");
        float eraser = scan.nextFloat();
        float n = pen + pencil + eraser;
        float total = n + (.18f * n);
        System.out.println(total);
        scan.close();
    }
}
