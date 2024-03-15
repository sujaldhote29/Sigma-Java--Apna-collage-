public class spiral {
    public static void printSpiral(int n[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = n.length - 1;
        int endCol = n[startRow].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(n[startRow][j] + " ");
            }
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(n[i][endCol] + " ");
            }
            if (startRow < endRow) {
                for (int j = endCol - 1; j >= startCol; j--) {
                    System.out.print(n[endRow][j] + " ");
                }
            }
            if (startCol < endCol) {
                for (int i = endRow - 1; i > startRow; i--) {
                    System.out.print(n[i][startCol] + " ");
                }
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int num[][] ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        // int num[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        printSpiral(num);
    }
}
