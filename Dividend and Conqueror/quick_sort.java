

public class quick_sort {
    public static void printarr(int n[]) {
        for(int i =0; i<n.length; i++){
            System.out.print(n[i]+" ");
        }
    }
    public static void sort(int n[], int si, int ei){
        if (si>=ei) {
            return ;
        }
        int Pidx = partition(n,si,ei);

        sort(n, si, Pidx-1);
        sort(n,  Pidx,ei);
    }

    public static int partition(int n[],int si, int ei){
        int pivot = n[ei];
        int i =si-1;
        for(int j =si; j<ei; j++){
            if (n[j]<=pivot) {
                i++;
                int temp = n[j];
            n[j] = n[i];
            n[i] = temp;
            }
            
        }
            i++;
            int temp = pivot;
            n[ei] = n[i];
            n[i] = temp;
        return i;
    }
    public static void main(String args[]){
        int n[] = {6,3,9,8,2,5};
        sort(n,0,n.length-1);
        printarr(n);

    }
}
