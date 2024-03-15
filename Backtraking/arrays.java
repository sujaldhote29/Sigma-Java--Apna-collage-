
public class arrays {
    public static void printarr(int n[]){
        for(int i = 0; i<n.length; i++){
            System.out.print(n[i]+" ");
        }
        System.out.println();
    }

    public static void changearr(int n[],int i , int value){
        if (i==n.length) {
            printarr(n);
            return;
        }
        n[i] = value;
        changearr(n, i+1, value+1);
        n[i] = value-2;
    }
    public static void main(String args[]){
        int n[] = new int[5];
        changearr(n,0,1);
        printarr(n);
    }
}
