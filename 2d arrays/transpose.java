        
public class transpose {
    public static void change(int n[][]){
        int row = n[0].length-1;
        int col =0;
        int transposed[][] = new int[row][col];
        for(int i = 0; i<n.length; i++){
            for(int j = 0; j<n[0].length; j++){
                transposed[col][row] =  n[i][j];
            }
        }

// original 

        for(int i = 0; i<n.length; i++){
            for(int j = 0; j<n[0].length; j++){
                System.out.print(n[i][j]+" ");
            }
        }


        // transpose 

        for(int i = 0; i<transposed.length; i++){
            for(int j = 0; j<transposed[0].length; j++){
                System.out.print(n[i][j]+" ");
            }
        }

    }
    public static void main(String args[]){
        int n[][] = {{1,2,3},{4,5,6}};

        change(n);
    }
}
