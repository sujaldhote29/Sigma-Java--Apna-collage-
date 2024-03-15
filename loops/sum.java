import java.util.*;
public class sum {
    public static void main(String[] args){
        Scanner r= new Scanner(System.in);
        System.out.print("enter the number =  ");
        int n = r.nextInt();
        int sum = 0;
        int counter = 1;
        while (counter<=n) {
            sum = counter + sum ;
            counter++;
        }
        System.out.println(sum);
        r.close();
    }
}
