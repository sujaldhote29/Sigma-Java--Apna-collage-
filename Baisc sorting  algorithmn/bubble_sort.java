// Large Elements Come to the end of array by swapping with adjacent elements 
public class bubble_sort {
    public static void bubble(int n[]){
        for(int turn = 0; turn<n.length-1;turn++){
            for(int j=0;j<n.length-1-turn;j++){
                if(n[j]>n[j+1]){
                    int temp = n[j];
                     n[j] = n[j+1];
                     n[j+1] = temp;
            }
        }
    }
    

    }
    public static void main(String[] args) {
        int n[]={5,4,1,3,2};

        bubble(n);

        for(int i = 0; i<n.length;i++){
            System.out.println(n[i]);
        }
    }
}
