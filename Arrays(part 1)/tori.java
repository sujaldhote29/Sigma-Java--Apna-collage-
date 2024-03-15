public class tori {
    public static int f(int a[]){
        int fc = 1;
        for (int i = 1; i <=a.length; i++) {
            fc=fc*i;
        }

        // System.out.println(a.length);
        return fc;
    }
    public static void main(String[] args) {
        int a []={1,2,3,4,5};

        System.out.println("The factorial of given array is : "+f(a));
        
    }
}
