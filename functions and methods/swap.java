
public class swap {
    public static void swa(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
         
    }
    public static void main(String[] args) {
        int a= 23;
        int b = 34;
        swa(a,b);

    }
}
