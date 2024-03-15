public class search_sorted {
    public static boolean search(int matrix[][],int key){
        int row = 0; 
        int col = matrix[0].length -1;
        while (row<matrix.length && col>=0) {
            if (matrix[row][col]==key) {
                System.out.println("The key was found at index : "+row+" "+col);
                return true;
            }
            if (matrix[row][col]>key) {
                col--;
            
            }
            else{
                row++;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int matrix[][] = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
        int key = 9;
        System.out.println(search(matrix, key));
    }
}
