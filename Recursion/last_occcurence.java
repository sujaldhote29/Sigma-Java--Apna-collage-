public class last_occcurence {
    public static int last(int n[],int key , int i){
        if (i==0) {
            return -1;
        }
        if (n[i]==key) {
            return i;
        }
        return last(n, key, i-1);
    }

    public static int last2(int n[],int key , int i){
        if (i==n.length) {
            return -1;
        }
        int isFound = last2(n, key, i+1);
        if (isFound==-1 && n[i]==key) {
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int n[]={8,3,6,9,5,10,5,3,89};
        // int n[] = {5,5,5,5,5};
        int i = 0;
        int key = 5;
        System.out.println(last2(n, key, i));
    }
}
