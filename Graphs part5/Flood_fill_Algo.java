public class Flood_fill_Algo {

    public void helper(int[][] image, int sr, int sc, int color, boolean visit[][], int orgCol) {
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || visit[sr][sc]
                || image[sr][sc] != orgCol || image[sr][sc]==color) {
            return;
        }
        // left
        helper(image, sr, sc - 1, color, visit, orgCol);
        // right
        helper(image, sr, sc + 1, color, visit, orgCol);
        // up
        helper(image, sr - 1, sc, color, visit, orgCol);
        // down
        helper(image, sr + 1, sc, color, visit, orgCol);
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean[][] visit = new boolean[image.length][image[0].length];
        helper(image, sr, sc, color, visit, image[sr][sc]);
        return image;
    }

    public static void main(String[] args) {

    }
}
